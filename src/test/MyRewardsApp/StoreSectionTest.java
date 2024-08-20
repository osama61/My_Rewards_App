import static io.appium.java_client.AppiumBy .*;
import org.junit.Test;


public class StoreSectionTest extends BaseClass {
    @Test
    public void storeDeals() {

        clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Stores\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(21)"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Get Discount\")"));
        clickWhenReady(xpath("//android.widget.TextView[@text=\"\uE5C4\"]"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uEA2C\")"));
    }
}
