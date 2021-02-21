package Steps;

import Pages.AgreeTermsAndConditionsPage;
import Pages.SideMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;


public class AgreeTermsAndConditionsSteps {

    AgreeTermsAndConditionsPage agreeTermsAndConditionsPage = new AgreeTermsAndConditionsPage();


    @When("user agree the Terms and conditions")
    public void userAgreeTheTermsAndConditions() {
agreeTermsAndConditionsPage.clickAgreeConditions();
    }
}