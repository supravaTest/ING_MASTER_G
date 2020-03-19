$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/ticker/feature/GetTickername.feature");
formatter.feature({
  "name": "To retrevie response data for Ticker name and precision details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tickername and precision details test scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "GetBase URL for Get Operations",
  "keyword": "Given "
});
formatter.match({
  "location": "com.ticker.stepdefination.TickerNameGET.getbase_URL_for_Get_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Send the Request for Get Operations",
  "keyword": "When "
});
formatter.match({
  "location": "com.ticker.stepdefination.TickerNameGET.send_the_Request_for_Get_Operations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the Get Operations",
  "keyword": "Then "
});
formatter.match({
  "location": "com.ticker.stepdefination.TickerNameGET.validate_the_Get_Operations()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003ctBTCUSD\u003e but was:\u003cfalse\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.TickerNames.pages.GETTickernamesPages.ValidateAPIResponse(GETTickernamesPages.java:112)\r\n\tat com.ticker.stepdefination.TickerNameGET.validate_the_Get_Operations(TickerNameGET.java:32)\r\n\tat ✽.Validate the Get Operations(file:///C:/Users/gayatri.c/Documents/Emp(1)/Emp/./src/main/java/com/ticker/feature/GetTickername.feature:5)\r\n",
  "status": "failed"
});
});