//package org.RestAssured;
//
//import io.restassured.RestAssured;
//import org.testng.annotations.Test;
//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//public class Sample {
//
//    @Test
//    public void testGetUsers() {
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//
//        given()
//                .when()
//                .get("/users/1")
//                .then()
//                .statusCode(200)
//                .body("username", equalTo("Bret"));
//    }
//}
