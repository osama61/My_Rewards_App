import static com.codeborne.selenide.appium.SelenideAppium.$;
import static io.appium.java_client.AppiumBy .*;

import io.appium.java_client.AppiumBy;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class StoreSectionTest extends BaseClass {
    @Test
    public void storeDeals() throws InterruptedException {
        ptclUser();
        ufoneUser();

    }

    public void ptclUser() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Stores\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Alpinebear\"));"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Get Discount\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));
    }

    public void ufoneUser() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Stores\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ApparelsDen\"));"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Get Discount\")"));
        Thread.sleep(15000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));

    }
}
