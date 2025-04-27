package prasad_SD.getHeader.usingdatatable;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateGetHeaderUsingDataTable {

		String urlString = null;
		Response response = null;
	
		@Given("Hit books API")
		public void hit_books_api() {
			
				response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
		
		}
		
		@Then("Validate headers and its value")
		public void validate_headers_and_its_value(io.cucumber.datatable.DataTable dataTable) {
			
			List<List<String>> headersList = dataTable.asLists(String.class);
	
			for (int i = 0; i < headersList.size(); i++) {
				
				String headerParamater 	= 	headersList.get(i).get(0);
				System.out.println("Header paramater : "+headerParamater);
				
				String expectedHeaderValue 	=	headersList.get(i).get(1);
				System.out.println("Expected header value : "+ expectedHeaderValue);
				
				String actualHeaderValue = response.getHeader(headerParamater);
				System.out.println("actual attribute from response : " + actualHeaderValue);
				
				Assert.assertEquals("Mismatch for header: " + headerParamater, expectedHeaderValue, actualHeaderValue);

				
			}
			
			
		}
	
}
