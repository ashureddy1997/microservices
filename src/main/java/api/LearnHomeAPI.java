package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.Properties;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class LearnHomeAPI {


    public Response getHomeAPIData(String embibe_Token, String ChildID, String ExamName, String Goal) {

        String s="{\"child_id\": \""+ChildID+"\",\n" +
                "    \"exam_name\": \""+ExamName+"\",\n" +
                "     \"goal\": \""+Goal+"\"" +
                "}";
        RestAssured.baseURI = Properties.baseUrl;
        RestAssured.basePath = Properties.homeBasePath;
        Response response = given().
                header("Content-Type", "application/json").
                header("embibe-token", embibe_Token).
                body(s).log().all().
                when().
                post().
                then().
                extract().response();
        return response;
    }

    public List<String> getSectionNameList(Response response){
        JsonPath jsonPath = new JsonPath(response.asString());
        List<String> sectionNameList;
        sectionNameList=jsonPath.param("$..section_name","section_name").getList("section_name");
        return sectionNameList;
    }

    public Map<String, Map<String, Map<String, Object>>> getLearnHomeContent(Response response){
        JsonPath jsonPath = new JsonPath(response.asString());
        Map<String, Map<String, Map<String, Object>>> allSections = new LinkedHashMap<>();
        List<Map<?,?>> sectionsList = jsonPath.getList("$");
        for (int i = 2; i <sectionsList.size() ; i++) {
            Map<String, Map<String, Object>> allContents = new LinkedHashMap<>();
            Map<?,?> sectionsMap = sectionsList.get(i);
            if (sectionsMap.get("section_name").toString().length()>0){
                List<Map<?,?>> contentList = (List<Map<?,?>>)sectionsMap.get("content");
                for (int j = 0; j < contentList.size(); j++) {
                    Map<String, Object> contentDetails = new LinkedHashMap<>();
                    Map<?,?> contentMap = contentList.get(j);
                    contentDetails.put("title",contentMap.get("title"));
                    contentDetails.put("description",contentMap.get("description"));
                    contentDetails.put("thumb",contentMap.get("thumb"));
                    allContents.put(contentMap.get("id").toString(),contentDetails);
                }
                allSections.put(sectionsMap.get("section_name").toString(),allContents);
            }
        }
        return allSections;
    }


}