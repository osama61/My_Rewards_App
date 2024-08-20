
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static io.appium.java_client.AppiumBy.*;

public class LoginFlowTest extends BaseClass {

    @Test
    public void testLoginFlow() throws InterruptedException {
        clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));

        boolean logo = wait.until(ExpectedConditions.elementToBeClickable(xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"))).isDisplayed();
        System.out.println(logo);
        boolean banner = wait.until(ExpectedConditions.elementToBeClickable(xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]"))).isDisplayed();
        System.out.println(banner);

        clickWhenReady(xpath("//android.view.ViewGroup[@content-desc='Login']"));
        sendWhenReady(androidUIAutomator("new UiSelector().text(\"033xxxxxxxx or 051xxxxxxx\")"), "0937871890");
        String actualValue = driver.findElement(androidUIAutomator("new UiSelector().text(\"Enter Number\")")).getText();
        Assert.assertEquals(actualValue,"Enter Number");
        System.out.println(actualValue);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Send OTP\")"));
        Thread.sleep(25000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Proceed\")"));
        Thread.sleep(5000);
        System.out.println("Test Passed");
    }
}
