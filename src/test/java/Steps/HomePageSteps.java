package Steps;

import Pages.HomePage;
import Utilities.Helpers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


import java.net.MalformedURLException;


public class HomePageSteps {
    Helpers helpers = new Helpers();
    HomePage homePage = new HomePage();

    @Given("user launch the app")
    public void userLaunchTheApp() throws MalformedURLException {
        helpers.openApp();
    }

    @When("user click on the side menu")
    public void userClickOnTheSideMenu() {
        homePage.clickSideMenu();
    }


}
