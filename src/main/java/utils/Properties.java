package utils;

public class Properties {

    public static final String os;
    private static final PropertiesReader propertiesReader = new PropertiesReader();
    public static final String baseUrl = propertiesReader.getBaseUrl();
    public static final String baseUrlWithoutFiberMs = propertiesReader.getBaseUrlWithouFiberMS();
    public static final String signupBasePath=propertiesReader.getSignupBasePath();
    public static final String loginOTPBasePath=propertiesReader.getLoginOTPBasePath();
    public static final String origin=propertiesReader.getOrigin();
    public static final String homeBasePath=propertiesReader.getHomeBasePath();
    public static final String username = propertiesReader.getUserName();
    public static final String password = propertiesReader.getPassword();
    public static final String browser = propertiesReader.getBrowser();
    public static final String deviceName;
    public static final String appPath=propertiesReader.getAppPath();
    public static final String loginAPI= propertiesReader.getLoginClientAPI();
    public static final String testBasePath =propertiesReader.getTestBasePath();
    public static final String practiceBasePath=propertiesReader.getPracticeBasePath();
    public static final String androidAppPath=propertiesReader.getAppPath();
    public static final String iOSAppPath=propertiesReader.getIosAppPath();



    public static final String testMataDataAPIURL=propertiesReader.getTestMataDataAPIURL();
    public static final String urlForAPI=propertiesReader.getUrlForAPI();
    public static final String appID=propertiesReader.getAppID();

    public static final String exam= propertiesReader.getExam();
    public static final String examType = propertiesReader.getExamType();
    public static final String testName = propertiesReader.getTestName();
    public static final String packType = propertiesReader.getPackType();
    public static final String appVersion = propertiesReader.getAppVersion();
    public static final String key=propertiesReader.getKey();
    public static final String language = propertiesReader.getLanguage();
    public static final String practiceQuestionSet=propertiesReader.getPracticeQuestionSet();

    public static final String fiberBaseUrl=propertiesReader.getBaseUrl();
    public static final String mockTestBundlesBasePath =propertiesReader.getTestBundleBasePath();
    public static final String testSubmissionMsBasePath =propertiesReader.getTestSubmissionMsBasePath();
    public static final String countryGoalExamsBasePath=propertiesReader.getGoalExamBasePath();
    public static final String signInBasePath=propertiesReader.getSignInBasePath();
    public static final String testResetBasePath=propertiesReader.getResetbasePath();
    public static final String connectedProfilesBasePath=propertiesReader.getConnectedProfileBasePath();;


    public static final String env;
    public static final String time;
    public static final String appName;
    public static final String versionName;
    public static final String verifyOTPBasePath=propertiesReader.getVerifyOTPBasePath();

    public static final String host=propertiesReader.getHost();



    static {
        env = ((null == System.getProperty("env")) ? "" : System.getProperty("env"));
        time = ((null == System.getProperty("time")) ? "" : System.getProperty("time"));
        appName = ((null == System.getProperty("appName")) ? "" : System.getProperty("appName"));
        deviceName = ((null == System.getProperty("deviceName")) ? "" : System.getProperty("deviceName"));
        os = ((null == System.getProperty("os")) ? "" : System.getProperty("os"));
        versionName=((null == System.getProperty("versionName")) ? "" : System.getProperty("versionName"));
    }
}
