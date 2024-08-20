import static io.appium.java_client.AppiumBy.*;

import io.appium.java_client.AppiumBy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomeScreenTest extends BaseClass{

    private final By locator = AppiumBy.androidUIAutomator("new UiSelector().text(\"Welcome\")");

    @Test
    public void home() throws InterruptedException {

        clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));

        String welcome = wait.until(ExpectedConditions.elementToBeClickable(locator)).getText();
        System.out.println(welcome);

        String description = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().text(\"To My Rewards!\")"))).getText();
        System.out.println(description);

        boolean banners = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(4)"))).isDisplayed();
        System.out.println(banners);
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(2)"));
        Thread.sleep(3000);
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Login\")"));
        Thread.sleep(2000);
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uE5C4\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(13)"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Terms and Conditions\")"));
        clickWhenReady(id("android:id/contentPanel"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Privacy Policy\")"));
        clickWhenReady(id("android:id/contentPanel"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDC4D\")"));


        Thread.sleep(3000);













    }
}
