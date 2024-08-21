import org.junit.Test;


import static io.appium.java_client.AppiumBy.*;



public class FoodPageTest extends BaseClass {

    @Test
    public void foodDealsTest() throws InterruptedException {

        foodSection();
        ptclUser();
        dealNotHonored();



    }

     public void foodSection() throws InterruptedException {

        //Ufone User FLow
//        clickWhenReady(xpath("//android.widget.Button[@resource-id='com.android.packageinstaller:id/permission_allow_button']"));
//        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Islamabad\")"));
//        clickWhenReady(androidUIAutomator("new UiSelector().text(\"Continue\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Food\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Broadway\"));"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem Via Pin\")"));
        Thread.sleep(15000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem\")"));
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"),"8");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"),"3");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)"),"7");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)"),"7");Thread.sleep(2000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"My Rewards, Please ask merchant to enter code\")"));
        clickWhenReady(xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));
        System.out.println("Food Deals Test Passed");
    }

    public void ptclUser() throws InterruptedException {

        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Food\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"BBQ Bazaar\"));"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem Via Pin\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Redeem\")"));
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)"),"8");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"),"3");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)"),"7");
        sendWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)"),"7");Thread.sleep(1000);
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"My Rewards, Please ask merchant to enter code\")"));
        clickWhenReady(xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));
        System.out.println("Food Deals Test Passed");

    }
    public void dealNotHonored() throws InterruptedException {
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Food\")"));
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Juices Island\"));"));

//        clickWhenReady(androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".setMaxSearchSwipes(15)" +
//                        ".scrollIntoView(new UiSelector().text(\"Juices Island\"));"));

        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tap here to talk to us\"));"));
        Thread.sleep(1000);
        clickWhenReady(androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Write your query here\"));"));
        Thread.sleep(1000);
        sendWhenReady(androidUIAutomator("new UiSelector().text(\"Write your query here\")"),"Testing section working or not!!");
        clickWhenReady(androidUIAutomator("new UiSelector().className(\"android.widget.ScrollView\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Report\")"));
        clickWhenReady(androidUIAutomator("new UiSelector().description(\"Ok\")"));

    }
}
