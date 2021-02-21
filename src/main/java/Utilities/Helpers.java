package Utilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Helpers {

    public static AndroidDriver driver;

    int defaultSwipeDuration = 2;

 public void openApp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("deviceName", "My New Phone");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "hko.MyObservatory_v1_0");
        capabilities.setCapability("appActivity", "hko.MyObservatory_v1_0.AgreementPage");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void swipeUp() {
        int startX;
        int startY;
        int endX;
        int endY;
        Dimension size = driver.manage().window().getSize();
        startX = endX = size.getWidth() / 2;
        endY = (int) (size.getHeight() * 10 / 100f);
        startY = (int) (size.getHeight() * (100 - 10) / 100f);
        swipeUp(startX, startY, endX, endY);
    }

    private void swipeUp(int startX, int startY, int endX, int endY) {

        new TouchAction(driver)
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(defaultSwipeDuration)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public List expectedDates() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM");
        List<String> expectedDates = new ArrayList<String>();
        for (int i = 1; i <= 9; i++) {
            cal.add(Calendar.DATE, 1);
            expectedDates.add(sdf.format(cal.getTime()));
        }
        return expectedDates;
    }
}