package api;

import java.io.IOException;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleApiTest {

	public static void main(String[] args) throws IOException {
		RestAssured.baseURI ="https://payments.testing.digital.travelex.net/v1/remittance";
		RequestSpecification request = RestAssured.given();

		// JSONObject is a class that represents a simple
		// JSON. We can add Key - Value pairs using the put
		JSONObject requestParams = new JSONObject();
		requestParams.put("countryCode", "IN");
		requestParams.put("authenticationAgentCode", "TRVLXUKLN001");
		requestParams.put("callRefNo", 5555);
		requestParams.put("clientUserId", "PS5555");

		// Add a header stating the Request body is a JSON
		request.header("Content-Type", "application/json");
		request.header("X-Auth", "BASIC Y3NjLXRlc3RzOmlhNHVWMUVlS2FpdA==");
		request.header("Accept", "application/json");

		// Add the Json to the body of the request
		request.body(requestParams.toString());

		// Post the request and check the response
		Response response = request.post("/getCountryDetails");

		int statusCode = response.getStatusCode();
		System.out.println(response.body().prettyPrint());
		String successCode = response.jsonPath().get("returnMsg");
		System.out.println("\nStatusCode : " + statusCode + "\nMessage : " + successCode);
	}
}
