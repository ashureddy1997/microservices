package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.Properties;

import java.util.List;

import static io.restassured.RestAssured.given;

public class PracticeAPI {

    public Response getPracticeHomeAPIResponse(String embibe_Token, String ChildID, String ExamName, String Goal) {

        String s = "{\n" +
                "    \"board\": \"" + Goal + "\",\n" +
                "    \"child_id\": " + ChildID + ",\n" +
                "    \"exam\": \"" + ExamName + "\",\n" +
                "    \"exam_name\": \"" + ExamName + "\",\n" +
                "    \"goal\": \"" + Goal + "\"\n" +
                "}";
        RestAssured.baseURI = Properties.baseUrl;
        RestAssured.basePath = Properties.practiceBasePath;
        Response response = given().
                header("Content-Type", "application/json").
                header("embibe-token", embibe_Token).
                body(s).log().all().
                when().
                post().
                then().
                extract().response();
        Assert.assertEquals(response.getStatusCode(),200,"API not working");

        return response;
    }


    public List<String> getSectionNameList(Response response){
        JsonPath jsonPath = new JsonPath(response.asString());
        List<String> sectionNameList;
        sectionNameList=jsonPath.param("$..section_name","section_name").getList("section_name");
        return sectionNameList;
    }
}
