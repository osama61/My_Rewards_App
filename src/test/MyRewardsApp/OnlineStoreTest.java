import static io.appium.java_client.AppiumBy.*;
import org.junit.Test;


public class OnlineStoreTest extends BaseClass {
    @Test
    public void onlineSection() {
       clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
       clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));
       clickWhenReady(androidUIAutomator("new UiSelector().description(\"Lifestyle\")"));
       clickWhenReady(androidUIAutomator("new UiSelector().description(\"Natural Fervor Vitamin, Flat 20 % Off On Vitamin, Validity, 31-12-2024, Savings Rs., 1000\")"));
       clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem Via Pin\")"));
       clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE5C4\")"));
       clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uEA2C\")"));

        //wait.until(ExpectedConditions.elementToBeClickable(androidUIAutomator("new UiSelector().description(\"Home\")"))).click();
        System.out.println("Test Passed");


    }
}
