package Rutuja_Assignment;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class get_Headers_SD {
	
	String url = null;
	Response response = null;

	@Given("Hit books API")
	public void hit_books_api() {
		response = RestAssured.given().get("https://demoqa.com/BookStore/v1/Books");
	}
	
//	@Then("Validate headers")
//	public void validate_headers()
//	{
//		String collectionHeader = response.header("Connection");
//		System.out.println(collectionHeader);
//		String actualConnectionValue = "keep-alive";
//		Assert.assertEquals("Value is not matching ", collectionHeader, actualConnectionValue);
//	}
	
	@Then("Validate headers as key and its values")
	public void validate_All_headers(DataTable dataTable)
	
	{
		 Map<String, String> expectedHeaders = dataTable.asMap(String.class, String.class);

	        for (Map.Entry<String, String> entry : expectedHeaders.entrySet()) {
	            String headerKey = entry.getKey();
	            String headerValue = entry.getValue();
	            String actualValue = response.getHeader(headerKey);
	            System.out.println(actualValue);

	            Assert.assertEquals("Header mismatch for: " + headerKey, headerValue, actualValue);
	        }
	}
}
