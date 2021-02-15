package Steps;

import Pages.SideMenuPage;
import Pages.WeatherForecasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class WeatherForecastSteps {

    WeatherForecasePage weatherForecasePage = new WeatherForecasePage();

    @Then("nine Day weather forecast should be displayed")
    public void nineDayWeatherForecastShouldBeDisplayed() {
        weatherForecasePage.isallNineDayForecaseDisplayed();
    }
}
