package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class PropertiesReader {

    private Properties prop = new Properties();

    PropertiesReader() {
        String environment = System.getProperty("env");
        String propertiesFilePath = environment + ".properties";
        InputStream inputStream;
        inputStream = getInputStream(propertiesFilePath);

        try {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private InputStream getInputStream(String propertiesFilePath) {
        return this.getClass().getClassLoader().getResourceAsStream(propertiesFilePath);
    }

    String getPracticeQuestionSet() {
        return prop.getProperty("practiceQuestionSetURL");
    }
    String getBaseUrl() { return prop.getProperty("baseUrl");
    }

    String getBaseUrlWithouFiberMS(){
        return prop.getProperty("baseUrlWithoutFiberMS");
    }
    String getSignupBasePath() {
        return  prop.getProperty("signUpBasePath");
    }

    String getLoginOTPBasePath(){
        return prop.getProperty("loginOTPBasePath");
    }
    String getHomeBasePath() {
        return prop.getProperty("homeBasePath");
    }
    String getUserName() {
        return prop.getProperty("userName");
    }

    String getPracticeBasePath(){
        return prop.getProperty("practiceBasePath");
    };
    String getPassword() {
        return prop.getProperty("password");
    }

    String getBrowser() {
        return prop.getProperty("appPath");
    }

    String getDeviceName(){return prop.getProperty("deviceName");}

    public String getHost() {
        return this.prop.getProperty("host");
    }

    public String getAppPath() {
        return this.prop.getProperty("androidAppPath");
    }

    public String getIosAppPath() {
        return this.prop.getProperty("iOSAppPath");
    }


    public String getLoginClientAPI () {
        return prop.getProperty("loginClient");
    }
    public String getTestMataDataAPIURL() {
        return this.prop.getProperty("testMataDataAPIURL");
    }

    public String getUrlForAPI() {
        return this.prop.getProperty("urlForAPI");
    }

    public String getAppID() {
        return this.prop.getProperty("appID");
    }

    public String getAppVersion() {
        return this.prop.getProperty("appVersion");
    }

    public String getUserId() {
        return this.prop.getProperty("user_id");

    }

    public String getExam() {
        return prop.getProperty("examName");
    }

    public String getExamType() {
        return prop.getProperty("examType");
    }

    public String getTestName() {
        return prop.getProperty("testName");
    }

    public String getPackType() {
        return prop.getProperty("packType");
    }

    public String getLanguage() {
        return prop.getProperty("language");
    }

    public String getKey() {
        return prop.getProperty("key");
    }

    public String getTestBasePath() {
        return prop.getProperty("testBasePath");
    }

    public String getOrigin() {
        return prop.getProperty("origin");
    }

    public String getTestBundleBasePath() {
        return  prop.getProperty("testBundleBasePath");
    }

    public String getTestSubmissionMsBasePath() {
        return  prop.getProperty("testSubmissionMsBasePath");
    }

    public String getGoalExamBasePath() {
        return prop.getProperty("goalExamBasePath");
    }

    public String getSignInBasePath() {
        return prop.getProperty("signInBasePath");
    }

    public String getVerifyOTPBasePath() {
        return  prop.getProperty("verifyOTPBasePath");

    }
    public String getVerifyHostBasePath(){
        return prop.getProperty("host");
    }

    public String getResetbasePath() {
        return prop.getProperty("resetBasePath");
    }

    public String getConnectedProfileBasePath() {
        return prop.getProperty("connectedProfileBasePath");
    }
}
