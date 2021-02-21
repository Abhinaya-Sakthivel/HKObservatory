package Pages;

import Utilities.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgreeTermsAndConditionsPage extends Helpers {

    By agreeButton = By.id("btn_agree");
    By locationButton = By.xpath("//*[@text=\"OK\"]");

//    By permissionAllowButton = By.id("permission_allow_button");
    By permissionAllowButton = By.xpath("//*[@text=\"ALLOW\"]");
    By reminderSkipButton = By.id("btn_friendly_reminder_skip");

    public void clickAgreeConditions(){
        driver.findElement(agreeButton).click();
        driver.findElement(agreeButton).click();
//        WebDriverWait wait = new WebDriverWait(driver,30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locationButton));
        driver.findElement(locationButton).click();
        driver.findElement(permissionAllowButton).click();
        driver.findElement(reminderSkipButton).click();
        driver.findElement(reminderSkipButton).click();
    }
}
