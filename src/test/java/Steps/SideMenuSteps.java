package Steps;

import Pages.SideMenuPage;
import io.cucumber.java.en.And;

public class SideMenuSteps {

    SideMenuPage sideMenuPage = new SideMenuPage();

    @And("selects nine Day weather forecast")
    public void selectsNineDayWeatherForecast() {
        sideMenuPage.swipeToText("9-Day Forecast");
        sideMenuPage.clickNineDayForecast();
    }
}