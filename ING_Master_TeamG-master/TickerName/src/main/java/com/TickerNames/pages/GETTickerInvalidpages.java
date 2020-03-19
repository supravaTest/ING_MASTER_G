package com.TickerNames.pages;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GETTickerInvalidpages {

	static Response response;

	public static void GetBaseURI_400() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://api-pub.bitfinex.com/v2/books/tBTCUSD/P0";
	}

	public static void GetAPIRequest() {
		//RestAssured.basePath = "/v2/book/tBTCUSD/P0";
		response = given().when().get();
		System.out.println("Get Response for tickernames :-" + response.asString());
	}

	public static Response GetAPIRequest(String name) {
		
		System.out.println("Path formwd is ::"+"/v2/book/tBTCUSD/P0" + name);
		RestAssured.basePath = "/v2/book/tBTCUSD/P0" + name;
		Response res = given().when().get();
				return res;
	}

	public static void ValidateAPIResponse() {
		JsonPath json = new JsonPath(response.asString());

		try {
			System.out.println("Started to validate the response data");
			Assert.assertEquals(404, response.statusCode());

		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to validate the response data");
		}

	}
}
