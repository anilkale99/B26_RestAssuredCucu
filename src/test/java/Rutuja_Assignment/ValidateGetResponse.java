package Rutuja_Assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import Rutuja_Assignment.SupportingUtility;

public class ValidateGetResponse {
	
	String url;
	Response response = null;
	Response responseFailure = null;
	
	@Given("Hit books API")
	public void hit_books_API()
	{
		response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");	
	}
	
	@Then("Validate API returns multiple books json")
	public void validate_API_returns_multiple_books_json()
	{
//		System.out.println("All logs "+response.then().log().all());
		int bookCount = response.jsonPath().getList("books").size();
		System.out.println("Total book count "+bookCount);
		Assert.assertTrue("Failed-Multiple books not present", bookCount>1);		
	}
	
	@Then("Validate attribute at json path {string} and its value {string}")
	public void Validate_attribute_at_json_path(String jsonPathStr , String expvalue) {
	    String actAttibutValue = response.body().jsonPath().getString(jsonPathStr);
	    System.out.println("actual atr from response = "+actAttibutValue);
	    Assert.assertTrue("Failed- atr value Not matching", expvalue.equals(actAttibutValue));
	}
	
	@Then("Verify {string} attribute have numbers only")
	public void verify_isbn_attribute_have_numbers_only(String jsonPathStr)	{
		String actIsbn = response.body().jsonPath().getString(jsonPathStr);
		System.out.println(actIsbn);
		Assert.assertTrue("Failed- ISBN contains characters", SupportingUtility.isNumber(actIsbn));
	}
	
	@Given("If end point is not correct")
	public void if_end_point_is_not_correct() {
		Response invalidUrl = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
		int statcode = invalidUrl.statusCode();
		System.out.println("StatusCode is "+statcode);
		Assert.assertTrue("Incorrect endpoint" , statcode==502);
		
	}

	 @Then("Validate json path {string} and confirm that there are total {int} attributes present")
     public void validate_json_path_and_confirm_that_there_are_total_attributes_present(String jsonPathStr,
                     int expectedCountOfAttributes){
            
             	Map<String, String> bookMap = response.body().jsonPath().getJsonObject(jsonPathStr);
             	int actualCountOfAttributes = bookMap.size();
             	System.out.println("Total books count is : " + actualCountOfAttributes);
             	Assert.assertTrue("Failed - book does not have 9 attributes ",(actualCountOfAttributes == expectedCountOfAttributes));

     }

	@Then("Verify {string} attribute have numbers")
	public void page_attribute_should_be_a_number_not_a_character(String jsonPath1) {
		System.out.println("Response body: " + response.getBody().asString());
	
		Object value = response.jsonPath().get(jsonPath1);

	    Assert.assertNotNull("The attribute at path '" + jsonPath1 + "' is null", value);
	    try {
	        Double.parseDouble(value.toString()); 
	        System.out.println(jsonPath1 + " is a valid number: " + value);
	    } catch (NumberFormatException e) {
	        fail("Expected a number at '" + jsonPath1 + "', but got: " + value);
	    }
	}
	
	@Then("{string} attributes value should start with {string} and end with {string}")
	public void website_attributes_value_should_shart_with_and_end_with(String website, String expStartUrl, String expEndUrl) {
		 List<Map<String, Object>> books = response.body().jsonPath().getList("books");
		 for (Map<String, Object> book : books) {
			 Object value = book.get(website);
			 System.out.println("website value is " +value);
			 String actStartUrl = ((String) value).substring(0, 7);
			 System.out.println("actual first chars "+actStartUrl);
			 Assert.assertTrue("Url is not starting with http:// ", expStartUrl == actStartUrl);
			 
			 String lastSixcharOfWebsite = ((String) value).substring(((String) value).length() - 10);
			 System.out.println("actual last chars "+lastSixcharOfWebsite);
			 Assert.assertTrue("Url is not starting with index.html ", expEndUrl == lastSixcharOfWebsite);
		 }
	}


	@Then("Verify all {int} books should not be blank with {int} attributes")
	public void all_books_should_have_attributes(int expectedBookCount, int expectedAttributeCount) {
	    List<Map<String, Object>> books = response.jsonPath().getList("books");

	    Assert.assertEquals("Book count mismatch", expectedBookCount,  books.size());
	    for (int i = 0; i < books.size(); i++) {
	        Map<String, Object> book = books.get(i);

	        Assert.assertTrue("Empty books attribute are present at "+book.keySet() , expectedAttributeCount==book.size());
	    }

	    System.out.println("All " + expectedBookCount + " books have " + expectedAttributeCount + " attributes.");
	}

	@Then("verify date format {string}")
	 public void each_format_should_match(String expectedDateFormat) {
		
	   	List<String> publishedDates = response.jsonPath().getList("books.publish_date");
	   
	   	Pattern pattern = Pattern.compile(expectedDateFormat);
		        		
		for (String date : publishedDates) {
		
				Matcher matcher = pattern.matcher(date);
				boolean isMatch = matcher.matches();
				Assert.assertTrue("Date format mismatch "+ date, isMatch);	
}}
	
	@Then("Validate that {string} publisher has only {int} books namely {string} and {string}")
    public void publisher_should_have_only_books_namely_and(String publisherName, int expBooksCountForPublisher, String expBookTitle1,
            String expBookTitle2){

        List<String> expBookTitleList = Arrays.asList(expBookTitle1,expBookTitle2);
        List<String> actBookTitleList = new ArrayList<String>();
        List<Map<String, Object>> booksJsonList = response.body().jsonPath().getList("books");

        for (Map<String, Object> bookMap : booksJsonList){

                	if (bookMap.get("publisher").equals(publisherName))
                	{
                			actBookTitleList.add((String) bookMap.get("title"));
                	} else{
                			continue;
                	}
        }
        System.out.println("Count of Books = " +actBookTitleList);
        Assert.assertTrue("Total books count for given publisher does not match",
                        expBooksCountForPublisher == actBookTitleList.size());

        Assert.assertTrue("Actual book titles and expected book title for given publisher does not match ",
                        (actBookTitleList.containsAll(expBookTitleList)) && (expBookTitleList.containsAll(actBookTitleList)));
}
	
    @Then("{string} publisher is not the publishing any book for author {string}")
    public void publisher_is_not_the_publishing_any_book_for_author(String publisherToCheck, String authorToCheckAgainst){

                List<String> authorList = new ArrayList<String>();
                List<Map<String, Object>> booksJsonList = response.body().jsonPath().getList("books");

                for (Map<String, Object> bookMap : booksJsonList){

                        	if (bookMap.get("publisher").equals(publisherToCheck)){
                                		authorList.add((String) bookMap.get("author"));
                        	} else{
                                		continue;
                        	}
                }
                System.out.println(authorList);         
                Assert.assertFalse("Failed - O'Reilly Media  publisher is publishing book for author Nicholas C. Zakas", authorList.contains(authorToCheckAgainst));
    }


    @Then("{string} publisher should have exactly {int} books")
    public void publisher_should_have_exactly_books(String publisherName, Integer expCountOfBooksForPublisher){

                int actCountOfBooksForPublisher = 0;
                List<Map<String, Object>> booksJsonList = response.body().jsonPath().getList("books");

                for (Map<String, Object> bookMap : booksJsonList){

                		if (bookMap.get("publisher").equals(publisherName)){
                                		actCountOfBooksForPublisher++;
                		} else{
                                		continue;
                		}
                }
                Assert.assertTrue("Failed - total book count is not matching with expected book count for publisher O'Reilly Media", actCountOfBooksForPublisher == expCountOfBooksForPublisher);
    }
}
