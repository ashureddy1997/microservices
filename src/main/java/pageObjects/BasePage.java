package pageObjects;

import appiumSupport.AppiumBaseClass;
import com.github.javafaker.Faker;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.Set;

import static io.appium.java_client.touch.offset.PointOption.point;

public class BasePage extends AppiumBaseClass {

    protected void waitForElementToBeVisible(WebElement element) {

        new WebDriverWait(driver(), 30).until(
                ExpectedConditions.visibilityOf(element));

    }
    protected void waitForElementToBeClickable(WebElement element) {

        new WebDriverWait(driver(), 30).until(
                ExpectedConditions.elementToBeClickable(element));

    }
    public CharSequence generateRandomNumberCharSeq() {
        Random r = new Random();
        CharSequence randomNumber = String.format("%04d", r.nextInt(1001));
        return randomNumber;
    }
    protected String randomFullName() {
        Faker faker = new Faker();

        String name = faker.name().fullName();
        return name;
    }
    public void refresh() {

        swipeScreen(Direction.DOWN);

     /*   Dimension windowSize = driver().manage().window().getSize();
        int x = windowSize.height;
        int y = windowSize.width;
        int z = x / 2;

        TouchAction action = new TouchAction(driver());
        action.moveTo(PointOption.point(z, (int) (y * 0.2)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .moveTo(PointOption.point(z, (int) (y * 0.6)))
                .release();*/
    }
    protected String randomFirstName() {
        Faker faker = new Faker();

        String name = faker.name().firstName();
        return name;
    }

    protected void wait(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    protected void waitForElementToInvisible(WebElement element) {
        new WebDriverWait(driver(), 30).until(
                ExpectedConditions.invisibilityOf(element)
        );
    }
    protected void acceptAlert() {
        new WebDriverWait(driver(), 30).until(ExpectedConditions.alertIsPresent());
        Alert alert = driver().switchTo().alert();
        alert.accept();
    }

    public String generateRandomName(){
        return randomFirstName().toLowerCase()+generateRandomNumberCharSeq();

    }

    public String generateRandomEmailID(){
        return randomFirstName().toLowerCase()+generateRandomNumberCharSeq()+"@guerrillamail.com";

    }

    protected void moveToElement(WebElement element) {
        Actions action = new Actions(driver());
        action.moveToElement(element).click().build().perform();
    }


    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver().manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        System.out.println("inside");
        new TouchAction(driver()).longPress(point(anchor, startPoint)).moveTo(point(anchor, endPoint)).release()
                .perform();
    }
    public void waitForElementToBeInvisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver(), 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void waitForElementToBeRefreshed(By by) {
        WebDriverWait wait = new WebDriverWait(driver(), 30);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(by)));
    }


   /* public WebElement scrollToAnElementByText(AppiumDriver<WebElement> driver, String text) {
        return driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
    }*/

    public void scrollToText(String str) {

        try {
            driver().findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
                            + str + "\").instance(0))"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // System.out.println("Ended");

    }








    public void scrollToTextSameText(String str) {

        driver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\""
                        + str + "\").instance(0))"));

    }

    public void scrollToTextWithTap(String str) {

        // System.out.println("started:" + str);

        try {
            WebElement scrollObject = driver().findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
                            + str + "\").instance(0))"));

            scrollObject.click();

        } catch (

                Exception e) {
            System.err.println("Scrolling was not successful");
        }

        // System.out.println("Ended");

    }

    public void scrollUsingResourceID(String resourceId) {

        try {
            driver().findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\""
                            + resourceId + "\").instance(0))"));
        } catch (Exception e) {
            System.err.println("Scrolling was not successful");

        }

    }

    protected void jsClick(WebElement element) {
        ((JavascriptExecutor) driver()).executeScript("arguments[0].click();", element);
    }


    public void switchToWebView() {
        WebDriverWait wait = new WebDriverWait(driver(), 30);
        By webView = By.className("android.webkit.WebView");

        System.out.println("Searching for WebView");
        wait.until(ExpectedConditions.visibilityOfElementLocated(webView));
        System.out.println("Searched WebView");

        Set<String> afterAvailableContexts = driver().getContextHandles();
        System.out.println("Available Views:" + afterAvailableContexts);
        System.out.println("Total No of Views Found After reaching to WebView = " + afterAvailableContexts.size());

        for (String context : afterAvailableContexts) {
            if (context.contains("WEBVIEW_com.embibe.student")) {
                System.out.println("View Name is " + context);
                driver().context(context);
                break;

            }
        }
    }

    public void switchToNativeApp() {
        driver().context("NATIVE_APP");
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;
    }

    public void swipeScreen(Direction dir) {
        System.out.println("swipeScreen(): dir: '" + dir + "'"); // always log your actions

        // Animation default time:
        //  - Android: 300 ms
        //  - iOS: 200 ms
        // final value depends on your app and could be greater
        final int ANIMATION_TIME = 200; // ms

        final int PRESS_TIME = 400; // ms

        int edgeBorder = 10; // better avoid edges
        PointOption pointOptionStart, pointOptionEnd;

        // init screen variables
        Dimension dims = driver().manage().window().getSize();

        // init start point = center of screen
        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 4);

        switch (dir) {
            case DOWN: // center of footer
                pointOptionEnd = PointOption.point(dims.width / 2, dims.height - edgeBorder);
                break;
            case UP: // center of header
                pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
                break;
            case LEFT: // center of left side
                pointOptionEnd = PointOption.point(edgeBorder, dims.height / 2);
                break;
            case RIGHT: // center of right side
                pointOptionEnd = PointOption.point(dims.width - edgeBorder, dims.height / 2);
                break;
            default:
                throw new IllegalArgumentException("swipeScreen(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(driver())
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeScreen(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }

    public void scrollToElementIos(WebElement element){

        while (element.getAttribute("visible").equalsIgnoreCase("false")){
            swipeScreen(Direction.UP);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollToElementAndroid(WebElement element){

        while (element.getAttribute("visible").equalsIgnoreCase("false")){
            swipeScreen(Direction.DOWN);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
