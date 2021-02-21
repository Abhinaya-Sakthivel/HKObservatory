package Pages;

import Utilities.Helpers;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SideMenuPage extends Helpers {
    By nineDayForecastOption = By.xpath("//*[@text=\"9-Day Forecast\"]");
    public void swipeToText(String selector) {
        driver.findElement(
                MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"\\Q"
                                + selector
                                + "\\E\").instance(0))"));
    }
    public void clickNineDayForecast(){
        driver.findElement(nineDayForecastOption).click();
    }

}
