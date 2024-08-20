
import static io.appium.java_client.AppiumBy.*;
import org.junit.Test;
public class ScrollingTest extends BaseClass {

    @Test
    public void scrolling() throws InterruptedException {

        clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Food\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pizzrella\"));"));

        Thread.sleep(3000);

        


    }
}
