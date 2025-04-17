package Rutuja_Assignment;

import java.time.LocalDate;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class postCreateUserSD {
	
	String postUrl = "https://reqres.in/api/users";
	Response res ;
	
	@Given("Hit create user API")
	public void hit_create_user_api() {
		res = RestAssured
				.given()
				.accept(ContentType.JSON)
				.body("{\r\n"
						+ "    \"name\": \"Mahesh Awale\",\r\n"
						+ "    \"job\": \"QA leader\",\r\n"
						+ "    \"mob\": \"122\",\r\n"
						+ "    \"dept\": \"QA-Automation\",\r\n"
						+ "    \"location\": \"Pune\"\r\n"
						+ "}\r\n"
						+ "")
				.post(postUrl);
	}
	@Then("create new user in system")
	public void create_new_user_in_system() {
	    int statusCode = res.getStatusCode();
	    System.out.println("statuc code ="+statusCode);
	    String resData = res.body().asString();
	    String resData1 =res.getBody().asPrettyString();
	    System.out.println("==="+resData);
	    System.out.println("==="+resData1);
	}
	
	@Then("validate user created")
	public void validate_user_created() {
		Assert.assertTrue(res.getStatusCode() == 201);
		
		String idValue = res.body().jsonPath().getString("id");
		System.out.println(" ID = "+ idValue);
		Assert.assertTrue(Integer.parseInt(idValue) > 0);
		
		String createdAtValue = res.body().jsonPath().getString("createdAt");
		System.out.println(" time = "+ createdAtValue);
		// String todaysDate = write some code which will always return todays date
		LocalDate today = LocalDate.now();
		String todayStr = today.toString();
        System.out.println("Today's date is: " + todayStr);
		
		Assert.assertTrue(createdAtValue.contains(todayStr));
	}


}
