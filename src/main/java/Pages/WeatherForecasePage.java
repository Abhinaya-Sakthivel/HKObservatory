package Pages;


import Utilities.Helpers;
import org.junit.Assert;
import org.openqa.selenium.By;
//import org.testng.Assert;

public class WeatherForecasePage extends Helpers {
By firstDayInForecast = By.xpath("(//*[@resource-id=\"hko.MyObservatory_v1_0:id/sevenday_forecast_date\"])[1]");
By lastDayInForecast = By.xpath("(//*[@resource-id=\"hko.MyObservatory_v1_0:id/sevenday_forecast_date\"])[2]");

public void isallNineDayForecastDisplayed(){

    String firstDay = String.valueOf(expectedDates().get(0));
    String lastDay = String.valueOf(expectedDates().get(8));
    Assert.assertEquals(driver.findElement(firstDayInForecast).getText(),firstDay);
    swipeUp();
    swipeUp();
    Assert.assertEquals(driver.findElement(lastDayInForecast).getText(),lastDay);

}


}
