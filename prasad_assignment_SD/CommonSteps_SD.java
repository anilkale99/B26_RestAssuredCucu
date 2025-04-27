package prasad_assignment_SD;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class CommonSteps_SD {

			    public static Response response;
			    public static String responseBodyAsString;
			    public static JsonPath jsonPath;
		
			    public static Response invalidResponse;
			    public static String invalidResponseBodyAsString;
			    public static JsonPath invalidJsonPath;
		
			    @Given("Hit books API")
			    public void hit_books_api() {
				    
				    	response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
		
				    	// Cache response body and jsonPath
				    	responseBodyAsString = response.getBody().asString();
				    	jsonPath = new JsonPath(responseBodyAsString);
		
				    	System.out.println("Status Code = " + response.getStatusCode());
			        
			    }
		
			    @Given("Hit books API with incorrect end point")
			    public void hit_books_api_with_incorrect_end_point() {
				    
				    	invalidResponse = RestAssured.given().get("https://demoqa.com/BookStore/v1/Book");
		
				    	// Cache response body and jsonPath
				    	invalidResponseBodyAsString = invalidResponse.getBody().asString();
				    	invalidJsonPath = new JsonPath(invalidResponseBodyAsString);
		
				    	System.out.println("Invalid endpoint status code = " + invalidResponse.getStatusCode());
				    	
			    }
		
}
