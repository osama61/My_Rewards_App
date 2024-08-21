import static io.appium.java_client.AppiumBy.*;
import org.junit.Test;


public class LifeStyleTest extends BaseClass {
    @Test
    public void onlineSection() throws InterruptedException {
        ptclUser();
        ufoneUser();

    }

    public void ptclUser() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Lifestyle\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pony Cycle\"));"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem Via Pin\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem\")"));
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"),"8");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"),"3");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)"),"7");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)"),"7");Thread.sleep(2000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"My Rewards, Please ask merchant to enter code\")"));
        clickWhenReady(xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));
        System.out.println("Test Passed");
    }

    public void ufoneUser() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Lifestyle\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Pony Cycle\"));"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem Via Pin\")"));Thread.sleep(15000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem\")"));
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"),"8");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"),"3");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)"),"7");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)"),"7");
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"My Rewards, Please ask merchant to enter code\")"));
        clickWhenReady(xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));
        System.out.println("Test Passed");

    }


}
