import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    protected static AppiumDriver driver;
    protected static WebDriverWait wait;

    void clickWhenReady(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    void sendWhenReady(By locator ,String keys){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).sendKeys(keys);
    }

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "Own Smart 9 Pro");
        capabilities.setCapability("appium:platformVersion", "8.0.1");
        capabilities.setCapability("appium:appPackage", "com.myrewards.android");
        capabilities.setCapability("appium:appActivity", "com.myrewards.android.MainActivity");
        capabilities.setCapability("appium:udid", "JFRKNZ7SNFBMSWOV");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("fllReset",false);

        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
