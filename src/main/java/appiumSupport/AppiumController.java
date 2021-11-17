package appiumSupport;

import constant.OS;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.Properties;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumController {

    public static AppiumController instance = new AppiumController();
    public AppiumDriver driver;


    public void start() throws MalformedURLException {
        if (driver != null) {
            return;
        }
        DesiredCapabilities capabilities = new DesiredCapabilities();
        File file = new File("app");


        if (Properties.os.equalsIgnoreCase(OS.Android)) {
            File filepath = new File(file, Properties.androidAppPath);

            capabilities.setCapability(MobileCapabilityType.APP, filepath.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability("deviceName", "Android");
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        } else if (Properties.os.equalsIgnoreCase(OS.Ios)) {
            File filepath = new File(file, Properties.iOSAppPath);
            capabilities.setCapability("platformName", "ios");
            capabilities.setCapability("deviceName", "iPhone XR");
            capabilities.setCapability("app", filepath.getAbsolutePath());
            capabilities.setCapability("newCommandTimeout", 6000);
            capabilities.setCapability("launchTimeout", 90000);
            capabilities.setCapability("idleTimeout",2500);
        //    capabilities.setCapability("appPushTimeout",200);

            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("platformVersion","14.4.1");
            capabilities.setCapability("simpleIsVisibleCheck",true);
            capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, Boolean.TRUE);
            capabilities.setCapability("permissions", "{\"io.cloudgrey.the-app\": {\"location\": \"inuse\"}}");
            capabilities.setCapability("udid","00008020-001418281A28402E");
            capabilities.setCapability("simpleIsVisibleCheck",true);
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        }else if(Properties.os.equalsIgnoreCase(OS.AndroidP)){

            capabilities.setCapability("pCloudy_Username", "abhinav.kumar@embibe.com");
            capabilities.setCapability("pCloudy_ApiKey", "rr75wq3pdr5yt2jsp2r58j3s");
            capabilities.setCapability("pCloudy_DurationInMinutes", System.getProperty("time"));
            capabilities.setCapability("newCommandTimeout", 6000);
            capabilities.setCapability("launchTimeout", 90000);
            capabilities.setCapability("pCloudy_DeviceFullName", System.getProperty("deviceName"));
            capabilities.setCapability("uiautomator2ServerLaunchTimeout", 120000);
            capabilities.setCapability("uiautomator2ServerInstallTimeout", 90000);
            capabilities.setCapability("idleTimeout",180);
           // capabilities.setCapability("platformVersion", System.getProperty("versionName"));
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("automationName", "uiautomator2");
            capabilities.setCapability("pCloudy_ApplicationName", System.getProperty("appName"));
            capabilities.setCapability("appPackage", "com.embibe.student");
            capabilities.setCapability("appActivity", "com.embibe.jioembibe.onboarding.OnboardingActivity");
            capabilities.setCapability("autoGrantPermissions", "true");
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("pCloudy_WildNet", "false");
            capabilities.setCapability("pCloudy_EnableVideo", "false");
            capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
            capabilities.setCapability("pCloudy_EnableDeviceLogs", "false");
            driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        }


        else if(Properties.os.equalsIgnoreCase(OS.IosP)){

            capabilities.setCapability("pCloudy_Username", "abhinav.kumar@embibe.com");
            capabilities.setCapability("pCloudy_ApiKey", "rr75wq3pdr5yt2jsp2r58j3s");
            capabilities.setCapability("pCloudy_DurationInMinutes",  System.getProperty("time"));
            capabilities.setCapability("newCommandTimeout", 600);
            capabilities.setCapability("launchTimeout", 90000);
            capabilities.setCapability("pCloudy_DeviceFullName", System.getProperty("deviceName"));
           // capabilities.setCapability("platformVersion", "9.3.5");
            capabilities.setCapability("platformName", "ios");
            capabilities.setCapability("acceptAlerts", true);
            capabilities.setCapability("simpleIsVisibleCheck",true);
            capabilities.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, Boolean.TRUE);
            capabilities.setCapability("permissions", "{\"io.cloudgrey.the-app\": {\"location\": \"inuse\"}}");
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
            capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("pCloudy_ApplicationName", System.getProperty("appName"));
            capabilities.setCapability("bundleId", "com.embibe.fiber");
            capabilities.setCapability("pCloudy_WildNet", "false");
            capabilities.setCapability("pCloudy_EnableVideo", "false");
            capabilities.setCapability("pCloudy_EnablePerformanceData", "false");
            capabilities.setCapability("pCloudy_EnableDeviceLogs", "true");
            driver = new IOSDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
        }

    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
