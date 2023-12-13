package rest.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Getrequest {
	
	@Test
	public void Getautomation() {		
				
//	RestAssured.baseURI = "https://reqres.in/api/users?page=2";
//	
//	Response response = RestAssured.given().param("page", "2").when().get();
//	
//	System.out.println(response.statusCode());
//	System.out.println(response.statusLine());
//    System.out.println(response.contentType());
//    System.out.println(response.getTime());
//	System.out.println(response.prettyPrint()); // JSON 
		
		
		RequestSpecification request = RestAssured.given();
		
		//request.header("Content-Type", "application/json");
		
		//JSONObject json = new JSONObject();
		
		//request.body(json.toJSONString());
	    
	    Response response = request.get("https://www.mailinator.com/v4/public/inboxes.jsp?to=test1996");
	    
	    System.out.println(response.statusCode());
	    System.out.println(response.statusLine());
	  //  System.out.println(response.prettyPrint());
	    
	    
	    
}
	
}



