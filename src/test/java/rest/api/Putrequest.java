package rest.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Putrequest {
	
	@Test
	public void Putautomation() {
		
	     RequestSpecification request = RestAssured.given();
			
			request.header("Content-Type", "application/json");
			
			JSONObject json = new JSONObject();
			
			json.put("id", "4");
			json.put("name", "Vimal");
			json.put("role", "Engineer");
			
			request.body(json.toJSONString());
			
			Response response = request.put("http://localhost:3000/users/4");
			
			System.out.println(response.statusCode());
			System.out.println(response.statusLine());
			System.out.println(response.prettyPrint());

	}

}
