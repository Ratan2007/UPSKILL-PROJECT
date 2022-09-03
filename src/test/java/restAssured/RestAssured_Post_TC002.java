package restAssured;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssured_Post_TC002 {
	@Test
	void RegistrationSuccessful() {
		//Specific base URL
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
	
		//Ruquest object
		RequestSpecification httpRequest=RestAssured.given();
		
		
	//Request Payload sending along with post request
	JSONObject requestParams=new JSONObject();
	requestParams.put("FirstName", "JohnXYZ");
	requestParams.put("LastName", "XYZJohn");
	requestParams.put("UserName", "JohnXYZ");
	requestParams.put("Password", "JohnXYZxyx");
	requestParams.put("Email", "JohnXYZ@gmail.com");
	
	httpRequest.header("Content-Type","application/json");
	httpRequest.body(requestParams.toJSONString());
	
	//Reponse object
    Response response=httpRequest.request(Method.POST,"/register");
	//Print response in console window
    String responseBody=response.getBody().asString();
	System.out.println("Response Body is:"+responseBody);
	
	//status code validation
	int statusCode=response.getStatusCode();
	System.out.println("Response Code is:"+statusCode);
	Assert.assertEquals(statusCode, 201);
	
	//Success Code validation 
	String successCode=response.jsonPath().getString("SuccessCode");
	Assert.assertEquals(successCode, "OPERATION_SUCCESS");
	
	
	
	}

}
