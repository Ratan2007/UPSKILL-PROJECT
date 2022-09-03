package restAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Get_TC001 {
	@Test
	void getWeatherDetail() {
	
		// specify base URL
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
	
		// Response object
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
		
		// Print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is:" + responseBody);

		// Status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is :" + statusCode);
		Assert.assertEquals(statusCode, 200);

		// Status Line Verication
		String statusLine = response.getStatusLine();
		System.out.println("Status line is:" + statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 ok");
	}
}
