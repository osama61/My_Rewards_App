import static io.appium.java_client.AppiumBy.*;
import org.junit.Test;


public class SearchFunctionalityTest extends BaseClass {
    @Test
    public void searchTest()  {

        clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Search\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Search for Restaurant , Lifestyle & Stores\")"));
        sendWhenReady(androidUIAutomator("new UiSelector().text(\"Search for Restaurant , Lifestyle & Stores\")"),"chicken ");
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uEE60\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uF176\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Clear All\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uDB80\uDD40\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"\uF10C\").instance(1)"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Continue\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Home\")"));
        System.out.println("Search Functionality Test is  Passed");












    }
}
