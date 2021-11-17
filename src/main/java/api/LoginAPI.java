package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.Properties;

import static io.restassured.RestAssured.given;

public class LoginAPI {


    public String getEmbibeToken(String email,String password) {

        String s = "{\n" +
                "    \"email\": \""+email+"\",\n" +
                "    \"password\": \""+password+"\",\n" +
                "    \"device_id\": \"01234567-89ABCDEF-01234567-89ABCDEF\",\n" +
                "    \"connected_response\": true\n" +
                "}";
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.signInBasePath;
        Response response = given().
                header("Content-Type", "application/json").
                header("Origin", Properties.origin).
                body(s).log().all().
                when().
                post().
                then().
                extract().response();
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200,"API not working");

        System.out.println("vipin :"+response.getHeader("embibe-token").toString());
        return response.getHeader("embibe-token").toString();
    }
}
