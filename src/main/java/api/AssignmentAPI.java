package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class AssignmentAPI {


    public String  fetchAssignmentId(String env) {
        String id=null;
        String ap = "https://beta-api.embibe.com/userhome/v1/myhome?board=CBSE&clientType=web&child_id=2000122722&exam=10th+CBSE&goal=CBSE&grade=10&offset=0&size=20&locale=en";
        Response retff = RestAssured.given().relaxedHTTPSValidation().header("embibe-token", " eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJjb3VudHJ5IjoxLCJ1c2VyX3R5cGUiOjEsInBhcmVudF91c2VyX2lkIjoyMDAwMTIyNzE2LCJjcmVhdGVkIjoxNjIxNDA5MzI0LCJvcmdhbml6YXRpb25faWQiOiIxIiwiaWQiOjIwMDAxMjI3MjIsImV4cCI6MTYyMjYxODkyNCwiZGV2aWNlSWQiOiIxNjIxNDA3NTI2NTA3IiwibW9iaWxlX3ZlcmlmaWNhdGlvbl9zdGF0dXMiOmZhbHNlLCJlbWFpbF92ZXJpZmljYXRpb25fc3RhdHVzIjpmYWxzZSwiZW1haWwiOiIyMDAwMTIyNzE2XzQyODA4MDQ0MTA4MjA3MjZAZW1iaWJlLXVzZXIuY29tIn0.WafhlgW3lqlA2yKSC02PsIfNiPPlDzrrrifvojePQ0corckeUpWMoUUv9zRodf0GFU5v3L9ju5NIEDEk19UgMg'")
                .when().get(ap).then().extract().response();
           retff.prettyPrint();
          System.out.println(retff);
        int size = retff.jsonPath().get("carousels[0].data.size()");
          System.out.println(size);

        for (int i = 0; i < size; i++) {


            String name = retff.jsonPath().get("carousels[0].data[" + i + "].assignmentName");
             System.out.println(name);
            if (env.equalsIgnoreCase(name)) {
                 id = retff.jsonPath().get("carousels[0].data[" + i + "].id");
                System.out.println(id);
                break;
            }
        }

        return id;
    }


}
