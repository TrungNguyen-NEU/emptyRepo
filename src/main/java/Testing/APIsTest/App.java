package Testing.APIsTest;

import static io.restassured.RestAssured.*;
import static io.restassured.path.json.JsonPath.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import java.util.ArrayList;
import java.util.Map;
//import io.restassured.path.json.JsonPath.*;


public class App {
  public static void main(String[] args) {
  
  /*Response authres = given().baseUri("https://sunworldb2cdev.b2clogin.com").header("User-Agent","PostmanRuntime/7.33.0")
      .contentType("application/json").body("{\r\n"
      + "\"client_id\":\"c8163e2e-f64e-4d34-b604-2341607f8935\",\r\n"
      + "\r\n"
      + "\"client_secret\":\"1nx8Q~7JLlu~Hvakxc4dInFPgQGEOu.8u55IkcNB\",\r\n"
      + "\"grant_type\":\"client_credentials\",\r\n"
      + "\"scope\":\"https://sunworldb2cdev.onmicrosoft.com/c8163e2e-f64e-4d34-b604-2341607f8935/.default\"\r\n"
      + "}").
  when().post("/sunworldb2cdev.onmicrosoft.com/B2C_1_ropc/oauth2/v2.0/token");
  JsonPath authresJsp = authres.jsonPath();
  String accesstoken = authresJsp.getString("access_token");
  System.out.print(accesstoken);
  */ 
  baseURI = "https://proxy-dev.its-solution.vn";
  Response res = given().auth().oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6Ilg1ZVhrNHh5b2pORnVtMWts"
  		+ "Mll0djhkbE5QNC1jNTdkTzZRR1RWQndhTmsiLCJ0eXAiOiJKV1QifQ.eyJ0ZnAiOiJCMkNfMV9yb3BjIi"
  		+ "wiYXpwYWNyIjoiMSIsInN1YiI6ImY4ZGRkMzA4LTBkNDQtNDVlMC04YWQyLWNlZTEzYmI2YWE4NiIsImF1"
  		+ "ZCI6ImM4MTYzZTJlLWY2NGUtNGQzNC1iNjA0LTIzNDE2MDdmODkzNSIsIm9pZCI6ImY4ZGRkMzA4LTBkND"
  		+ "QtNDVlMC04YWQyLWNlZTEzYmI2YWE4NiIsInRpZCI6ImMwMTMzYTdhLTQ2OTctNGU3Yy04ZjFjLWY0ZTgzM"
  		+ "jJiMDU3NSIsInZlciI6IjIuMCIsImF6cCI6ImM4MTYzZTJlLWY2NGUtNGQzNC1iNjA0LTIzNDE2MDdmODkzN"
  		+ "SIsImlhdCI6MTY5NjUxMzM3OCwiZXhwIjoxNjk2NTE2OTc4LCJpc3MiOiJodHRwczovL3N1bndvcmxkYjJjZGV2LmIyY2xvZ2luLmNvbS9jMDEzM2E3YS00Njk3LTRlN2MtOGYxYy1mNGU4MzIyYjA1NzUvdjIuMC8iLCJuYmYiOjE2OTY1MTMzNzh9.oSzWMaLH_pGTqtg_H5EXpHaqPWFQTLnn0iC_t9OKHe1g2muovZysuCvUXhsvAjkea2ntrJDDB2k6QRjeXxYLqvDh2Rvqxf-wogJE6bbg6rhAQsxL0rlTQPwuiy3JK4f477QgmH24SdU9gxVXKnBj38NKV3Stv7WQARgnX_BtQ1HGMhe9L53ZnCtRj16gMTDrPs5l6YofpYS_ej6QlXKVeI2cDb0NREC-gmgH7rsU5-oXj4BU9Z8xvIXuktZN4fbV9RAoJa-MzjnFBjPbY_LZoZTFABDBY6WfIqYpmZV_RSktTqMse81P37kvOajfsaT2KervFh4iCEZfKuz7bE4WbQ")
  .header("swg-subscription-key","37e4db18b1f248568fb8d13e271485eb")
  .get("/ticket/dev01/ext/vi/api/product/detail?id=2440&siteCode=HLC&date=2023-11-29&saleChannel=TOL")
  ;

  
  JsonPath jsp = res.jsonPath();
  JsonPath newjsp = given("{\"not_before\": 1696487115,\r\n"
      + "    \"expires_in\": 3600,\r\n"
      + "    \"expires_on\": 1696490715\r\n"
      + "}");
  int items = newjsp.get("expires_on");
  String jspString = jsp.get().toString();
  
  Map<String, String> cookies = res.cookies();
  

  //System.out.println(strRes);
  System.out.println(cookies);
  
  }
}