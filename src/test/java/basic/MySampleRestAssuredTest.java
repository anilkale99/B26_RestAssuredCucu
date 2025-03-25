package basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MySampleRestAssuredTest {

	public static void main(String[] args) {
		
		Response response = RestAssured.given().get("https://rest-assuredfsdfadss.io/");
		System.out.println("output = "+response.statusCode());

	}

}
