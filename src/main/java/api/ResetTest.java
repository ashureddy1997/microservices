package api;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.Assert;
import resetLib.ResetHelper;
import utils.Properties;

import static io.restassured.RestAssured.given;

public class ResetTest {

    public Response resetTest(String budleCode,String embibe_Token) {

        String s = "";
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.testResetBasePath+budleCode+"/reset";
        Response response = given().
                header("Content-Type", "application/json").
                header("embibe-token", embibe_Token).
                header("Origin", Properties.origin).
                body(s).log().all().
                when().
                post().
                then().
                extract().response();
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200,"API not working");
       /* ResetHelper value=response.as(ResetHelper.class, ObjectMapperType.GSON);
        if(value.getMessage().equalsIgnoreCase("Test reset successfully")){

        }
        else {
            Assert.assertFalse(false,"Reset api not working "+value.getMessage());
        }*/


        return response;
    }

}
