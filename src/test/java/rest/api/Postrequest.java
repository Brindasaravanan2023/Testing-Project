package rest.api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postrequest {
	
	@Test
	public void postautomaation() {
		
			
//			RestAssured.baseURI = "https://reqres.in/api/users";
//			
//			String Json = "{\r\n" + " \"name\": \"morpheus\",\r\n" + " \"job\": \"leader\"\r\n" + "}";
//			
//			RestAssured.given().body(Json).post().then().log().all().assertThat().statusCode(201);
		
		   
        RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		
		json.put("id", "1234578");
		json.put("name", "Nimal");
		json.put("role", "Associate");
		
		request.body(json.toJSONString());
		
		Response response = request.post("http://localhost:3000/data");
		
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
		System.out.println(response.prettyPrint());
		
		
		
		
		
	}

}
