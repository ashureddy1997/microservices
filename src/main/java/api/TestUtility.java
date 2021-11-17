package api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import utils.Properties;

import java.util.*;

public class TestUtility {
    Response response = null;
    RestAssuredConfig config = null;

    public Response getMockTestBundles(String bundleCode){
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.mockTestBundlesBasePath;
        RequestSpecification request = RestAssured.given().config(config);
        //.filters(new ResponseLoggingFilter(),new RequestLoggingFilter());
        request.header("Content-Type","application/json");
        request.queryParam("referer_service","test_microservice");
        request.queryParam("view_solutions",true);
        request.queryParam("version",1);
        response = request.get("/"+bundleCode);
        return response;
    }

    public Response testSubmissionMs(String goalCode, String examCode, String bundleCode, String embibeToken){
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.testSubmissionMsBasePath;
        RequestSpecification request = RestAssured.given().config(config);
        //.filters(new ResponseLoggingFilter(),new RequestLoggingFilter());
        request.header("Content-Type","application/json");
        request.header("embibe-token",embibeToken);
        request.queryParam("goal_code",goalCode);
        request.queryParam("exam_code",examCode);
        response = request.get("/"+bundleCode+"/questions");
        return response;
    }

    public Map<String, String> getQuestionCodeAndType(Response response){
        Map<String, Object> sectionsMap = response.path("paper.sections");
        Set<String> sections = sectionsMap.keySet();
        Map<String, String> questionAndTypeMap = new LinkedHashMap<>();
        for (String str:sections){
            Map<String, Object> sectionMap = (Map<String, Object>)sectionsMap.get(str);
            List<Map<String, Object>> questionsList =(List<Map<String, Object>>) sectionMap.get("questions");
            for (int i = 0; i <questionsList.size() ; i++) {
                Map<String, Object> questionsMap = questionsList.get(i);
                questionAndTypeMap.put(questionsMap.get("code").toString(),questionsMap.get("category").toString());
            }
        }
        return questionAndTypeMap;
    }


    public Map<String, List<Map<String, Object>>> getAllQuestionsAndAnswers(Response response){
        Map<String, Object> sectionsMap = response.path("data.paper.sections");
        Set<String> sections = sectionsMap.keySet();
        Map<String, List<Map<String, Object>>> questionAnswersMap = new LinkedHashMap<>();
        for (String str:sections){
            Map<String, Object> sectionMap = (Map<String, Object>)sectionsMap.get(str);
            List<Map<String, Object>> questionsList =(List<Map<String, Object>>) sectionMap.get("questions");
            for (int i = 0; i <questionsList.size() ; i++) {
                Map<String, Object> questionsMap = questionsList.get(i);
                if (questionsMap.get("category").toString().equals("SubjectiveAnswer")|| questionsMap.get("category").toString().equals("MultipleFillInTheBlanks")){
                    List<List<Map<String, Object>>> listOfAnswersList =(List<List<Map<String, Object>>>) questionsMap.get("answers");
                    List<Map<String, Object>> answersList = new ArrayList<>();
                    for (int j = 0; j <listOfAnswersList.size() ; j++) {
                        List<Map<String, Object>> listOfAnswers = listOfAnswersList.get(j);
                        answersList.add(listOfAnswers.get(0));
                    }
                    questionAnswersMap.put(questionsMap.get("code").toString(),answersList);
                }else {
                    List<Map<String, Object>> answersList =(List<Map<String, Object>>) questionsMap.get("answers");
                    questionAnswersMap.put(questionsMap.get("code").toString(),answersList);
                }
            }
        }
        return questionAnswersMap;
    }


    public Response getCountryGoalsAPIResponse(){
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.countryGoalExamsBasePath;
        RequestSpecification request = RestAssured.given().config(config);
        //.filters(new ResponseLoggingFilter(),new RequestLoggingFilter());
        request.header("Content-Type","application/json");
        response = request.get();
        Assert.assertEquals(response.statusCode(),200);
        return  response;
    }
    public Map<String, String> getGoalAndExamName(String goal, String exam){
        String goalName =null;
        String examName = null;
        response = getCountryGoalsAPIResponse();
        boolean flag = false;
        Map<String, String> goalExamMap = new LinkedHashMap<>();
        List<Map<String, Object>> goalsList = response.path("data");
        for (int i = 0; i <goalsList.size() ; i++) {
            Map<String, Object> goalMap = goalsList.get(i);
            if (goalMap.get("display_name").toString().equals(goal)){
                goalName = goalMap.get("name").toString();
                List<Map<String, Object>> examsList =(List<Map<String, Object>>) goalMap.get("exam");
                for (int j = 0; j <examsList.size() ; j++) {
                    Map<String, Object> examMap = examsList.get(j);
                    if (examMap.get("display_name").toString().equals(exam)){
                        examName = examMap.get("name").toString();
                        goalExamMap.put("goalName",goalName);
                        goalExamMap.put("examName",examName);
                        goalExamMap.put("goalCode",examMap.get("parent_code").toString());
                        goalExamMap.put("examCode",examMap.get("code").toString());
                        flag = true;
                        break;
                    }
                }
                if (flag){
                    break;
                }
            }
        }
        return goalExamMap;
    }

    public Response getSignInResponse(String email, String password, String deviceId, String origin){
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.signInBasePath;
        RequestSpecification request = RestAssured.given().config(config);
        // .filters(new ResponseLoggingFilter(),new RequestLoggingFilter());
        String body = getSignInPayload(email,password,deviceId);
        request.header("Origin",origin);
        request.body(body);
        response = request.post();
        return  response;
    }

    public String getEmbibeToken(String email, String password, String deviceId, String origin){
        String embibeToken = null;
        response = getSignInResponse(email,password,deviceId,origin);
        Assert.assertEquals(response.statusCode(),200);
        embibeToken = response.getHeader("embibe-token");
        return embibeToken;
    }
    public String getSignInPayload(String email, String password, String deviceId){
        Map<String, Object> signInMap = new HashMap<String, Object>();
        String json = null;
        signInMap.put("email", email);
        signInMap.put("password", password);
        signInMap.put("device_id",deviceId);
        json = convertToJson(signInMap);
        return  json;
    }
    public String convertToJson(Map<String, Object> map)
    {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = null;
        try {
            json = ow.writeValueAsString(map);
        } catch (JsonProcessingException e1) {
            e1.printStackTrace();
        }
        return json;
    }

}
