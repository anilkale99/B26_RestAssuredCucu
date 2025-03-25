package basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MySampleGoogleTest {

	public static void main(String[] args) {
		
		Response response = RestAssured.given().get("http://www.google.com/");
		System.out.println("output = "+response.statusCode());
		
		Response response1 = RestAssured.given().get("http://www.googledfds.com/");
		System.out.println("output = "+response1.statusCode());
		
		Response response2 = RestAssured.given().get("http://www.googledfdsa.com/");
		System.out.println("output = "+response2.statusCode());

	}

}
