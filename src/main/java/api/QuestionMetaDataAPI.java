package api;

public class QuestionMetaDataAPI {


   /* public Response getQuestionAnswer(String questionID) {

   *//*     String s = "{%22type%22:%22Question%22,%22id%22:1913867}";
        RestAssured.baseURI = Properties.baseUrl;
        RestAssured.basePath = Properties.questionBasePath;
        Response response = given().
                param("where","{\"id\":"+questionID+"}").
                header("Content-Type", "application/json").
                header("Authorization", "048f38be-1b07-4b21-8f24-eac727dce217:gSEkC3dqDcIv1bbOk78UD9owjn7ins8D").
                body(s).log().all().
                when().
                post().
                then().
                extract().response();
        Assert.assertEquals(response.getStatusCode(),200,"API not working");
        QuestionMetaDataHelper value=response.as(QuestionMetaDataHelper.class, ObjectMapperType.GSON);
        //value.getItems().get(0).getContent().getQuestionDetails().getEn().getAnswers().ge
*//*




      //  return response;
    }*/
}
