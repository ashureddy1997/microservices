package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Properties;

import static io.restassured.RestAssured.given;

public class OTPAPI {


    public String getOTP(String OTP_Token) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        RestAssured.baseURI = "http://10.141.10.177:8080/";
        RestAssured.basePath = "ondemandautomation/getotp";
        Response response = given().
                header("Content-Type", "application/json").
                header("otp-token",OTP_Token).
                header("host", Properties.host).
                when().log().all().
                urlEncodingEnabled(false).
                get().
                then().
                extract().response();
        response.prettyPrint();
        return response.getBody().jsonPath().get("otp").toString();
    }
}
