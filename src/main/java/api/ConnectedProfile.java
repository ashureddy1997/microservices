package api;

import connectedProfile.ConnectedProfileHelper;
import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.Properties;

import static io.restassured.RestAssured.given;

public class ConnectedProfile {

    public String getEmbibeToken(String childname,String embibeToken) {

        String childEmbibeToken=null;
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.connectedProfilesBasePath;
        Response response = given().
                header("Content-Type", "application/json").
                header("embibe-token", embibeToken).
                log().all().
                when().
                get().
                then().
                extract().response();
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200,"API not working");
        ConnectedProfileHelper value=response.as(ConnectedProfileHelper.class, ObjectMapperType.GSON);
        for(int i=0;i<value.getData().getLinkedProfiles().size();i++) {
           if( value.getData().getLinkedProfiles().get(i).getProfileDetails().getFirstName().equalsIgnoreCase(childname)) {

               childEmbibeToken=  value.getData().getLinkedProfiles().get(i).getEmbibeToken();
               break;
           }
        }



        return childEmbibeToken;
    }
}
