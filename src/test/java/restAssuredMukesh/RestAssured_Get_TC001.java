package restAssuredMukesh;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssured_Get_TC001 {
	@Test
	void testTC001() {
	Response response=RestAssured.get("http://reqres.in/api/users?page=2");
	
//	response.asString();
//	response.getBody();
//	response.getStatusCode();
//	response.getStatusLine();
//	response.getHeader("content-type");
//	response.getTime();
	System.out.println(response.asString());
	System.out.println(response.getBody());
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("content-type"));
	System.out.println(response.getTime());
	
	
	
	}

}
