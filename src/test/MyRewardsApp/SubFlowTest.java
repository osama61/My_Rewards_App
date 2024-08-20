import org.junit.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import javax.swing.*;

import java.time.Duration;
import java.util.Collections;

import static io.appium.java_client.AppiumBy.*;

public class SubFlowTest extends BaseClass{

    @Test

    public void subFlowsTest() throws InterruptedException {
        ufoneTest();
        unsubscribeService();
        ptclTest();
        unsubscribeService();


    }





    void ufoneTest() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Login\")"));
        sendWhenReady(xpath("//android.widget.EditText[@text=\"033xxxxxxxx or 051xxxxxxx\"]"),"03362283366");
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Send OTP\")"));
        Thread.sleep(25000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Proceed\")"));
        Thread.sleep(3000);

    }

    void ptclTest() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Login\")"));
        sendWhenReady(xpath("//android.widget.EditText[@text=\"033xxxxxxxx or 051xxxxxxx\"]"),"0937871890");
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Send OTP\")"));
        Thread.sleep(25000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Proceed\")"));
        Thread.sleep(3000);

    }

    void unsubscribeService() throws InterruptedException {
        Thread.sleep(3000);
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(2)"));
        Thread.sleep(3000);
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Settings\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Delete Account\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Do you want to delete account?, If you delete account, you will no longer be, able to get benefits from our exciting offers, Slide to delete account\")"));

        Actions actions = new Actions(driver);

        int startX = 904;
        int startY = 2118;
        int endX = 170;
        int endY = 2114;

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");

        Sequence slide = new Sequence(finger, 1);
        slide.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
        slide.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        slide.addAction(finger.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endX, endY));
        slide.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(slide));

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Delete Account\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));

    }



}
