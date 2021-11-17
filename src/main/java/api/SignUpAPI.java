package api;

import io.restassured.RestAssured;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import org.testng.Assert;
import signupHelp.SignupHelper;
import utils.Properties;

import static io.restassured.RestAssured.given;

public class SignUpAPI {


    public static String embibe_Token = null;
    public static String user_id=null;

    String otp_Token=null;
    String otp=null;
    Response response=null;

    public String getEmbibeToken(String email){//Create new user using signUP API
        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.signupBasePath;

        String signUpPayload = "{\n" +
                "    \"first_name\": \"first\",\n" +
                "    \"last_name\": \"last\",\n" +
                "    \"email\": \""+email+"\",\n" +
                "    \"password\": \""+ Properties.password+"\",\n" +
                "    \"meta\" : {\n" +
                "        \"books\":\"xyz\",\n" +
                "        \"localtion\":\"location\"\n" +
                "    }\n" +
                "}";
        response = given().
                header("Content-Type", "application/json").body(signUpPayload).
                header("Origin", Properties.origin).
                when().log().all().
                post().
                then().log().all().
                extract().response();

        System.out.println("Status code " + response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(),201,"Status code not matched expected 200 found "+response.getStatusCode());
        embibe_Token = response.getHeader("embibe-token");
        otp_Token=response.getHeader("otp-token");

        SignupHelper value=response.as(SignupHelper.class,ObjectMapperType.GSON);
        user_id= String.valueOf(value.getData().getUserDetails().getId());
// get OTP
        OTPAPI otp_api=new OTPAPI();
        otp= otp_api.getOTP(otp_Token);

//verify OTP

        RestAssured.baseURI = Properties.baseUrlWithoutFiberMs;
        RestAssured.basePath = Properties.verifyOTPBasePath;

        String verifyOTPPayload = "{\"otp\":\""+otp+"\"}";
        response = given().
                header("Content-Type", "application/json").body(verifyOTPPayload).
                header("Origin", Properties.origin).
                header("otp-token",otp_Token).
                when().log().all().
                post().
                then().log().all().
                extract().response();
        Assert.assertEquals(response.getStatusCode(),200,"Status code not matched expected 200 found "+response.getStatusCode());


        return response.getHeader("embibe-token");
    }

}
