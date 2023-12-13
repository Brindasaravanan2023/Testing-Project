package rest.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Deleterequest {
	
	
	@Test
	private void Deleteautomation() {
		
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("id", "1234578");
		json.put("name", "Nimal");
		json.put("role", "Associate");
		
		request.body(json.toJSONString());
		
		Response response = request.delete("http://localhost:3000/data/1234578");
		
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.prettyPrint());


	}

}
