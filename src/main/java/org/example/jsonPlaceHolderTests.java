package org.example;
import org.testng.*;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class jsonPlaceHolderTests {
    private String url = "https://jsonplaceholder.typicode.com/";
    @Test(priority = 1)
    private void getUsersResponseCode200(){
        //Verifies success code is 200
        given().when().get(url+"users").then().assertThat().statusCode(200);
        //System.out.println("abc");
    }

    @Test(priority = 2)
    private void getUsersResponseBody(){
        //Verifies name of user 1 is Leanne Graham
        given().when().get(url+"users/1").then().body("name", equalTo("Leanne Graham"));
        //Verifies company name of user 1 is Romaguera-Crona
        given().when().get(url+"users/1").then().body("company.name",equalTo("Romaguera-Crona"));
        //Prints response body
        System.out.println(given().when().get(url+"users/1").thenReturn().asString());
    }







}
