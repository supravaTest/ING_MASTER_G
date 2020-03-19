package com.TickerNames.pages;

import static io.restassured.RestAssured.given;

import java.io.FileWriter;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import io.cucumber.java.ht.E;
import io.restassured.RestAssured;
import io.restassured.internal.support.FileReader;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GETTickernamesPages {

	static Response res;

	public static void GetBaseURI() {
		RestAssured.useRelaxedHTTPSValidation();
		RestAssured.baseURI = "https://api-pub.bitfinex.com/v2/book/tBTCUSD/P0";
		
	}

	public static void GetAPIRequest() {
		// RestAssured.basePath ="/v2/book/tBTCUSD/P0";
		res = given().when().get();

		System.out.println("Get Response for tickername :-" + res.asString());
	}

	public static void ValidateAPIResponse() throws ParseException {

		JsonPath jsonPath = res.jsonPath();
		List list = jsonPath.getList(".");
		System.out.println("List of tickernames" + list);

		JSONObject Tickernames = new JSONObject();
		Tickernames.put("1", "tBTCUSD");
		Tickernames.put("2", "tLTCBTC");
		Tickernames.put("3", "tETHUSD");
		Tickernames.put("4", "tXRPUSD");

		JSONObject Tickernamess = new JSONObject();
		Tickernamess.put("tickers", Tickernames);

		JSONArray jsonlist = new JSONArray();
		jsonlist.add(Tickernamess);
		jsonlist.add(Tickernamess);

		try {
			FileWriter f = new FileWriter("C:/Users/gayatri.c/Documents/Emp(1)/Emp/src/test/java/Tickerslist.json");
			f.write(jsonlist.toJSONString());
			f.flush();
		}

		catch (Exception e) {
			System.out.println(e);
		}
		String s = res.asString();

		System.out.println("response" + res.asString().contentEquals("tBTCUSD"));
		// System.out.println("response from the tickername
		// "+res.asString().contains(""));
		String s1 = res.getBody().asString();
		System.out.println(s1);
		JsonPath json = new JsonPath(res.asString());
		// json.get("5305.7,1,0.08801762");
		// Assert.assertEquals("5305.7,1,0.08801762",res.asString().contentEquals("5305.7,1,0.08801762"));

		/*
		 * JsonPath jsonPath = res.jsonPath(); List list =
		 * jsonPath.getList("."); System.out.println("List" +list);
		 */

		/*
		 * List list=json.getList(path); Iterator<E> it = list.iterator();
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */

		{
			/*
			 * JSONParser jsonParser = new JSONParser(); JSONObject jobj =
			 * (JSONObject)jsonParser.parse(s1); JSONArray i= (JSONArray)
			 * jobj.get("1"); JSONArray jsonarr =
			 * (JSONArray)((JSONArray)i).get(0);
			 */
			String s2 = res.asString();

			for (int i1 = 1; i1 < s2.length(); i1++) {
				System.out.println("list of elements" + s2);
			}
			/*
			 * FileReader reader = new FileReader(); Object obj =
			 * (JSONObject)jsonParser.parse(reader);
			 * 
			 * JSONArray tiokensist = (JSONArray) obj;
			 * System.out.println(tiokensist);
			 * 
			 * for(int i2=0;i2<tiokensist.size();i2++) {
			 * System.out.println(tiokensist(i2)); }
			 */

			System.out.println("Started to validate the responsedata");
			//Assert.assertEquals("5305.7,1,0.08801762",list.get(0));
			Assert.assertEquals("tBTCUSD", res.asString().contentEquals("tBTCUSD"));

		}
		/*
		 * catch(Exception e) { e.printStackTrace(); System.out.println(
		 * "Failed to validate the response data"); }
		 */

	}
}
