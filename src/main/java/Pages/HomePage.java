package Pages;

import Utilities.Helpers;
import org.openqa.selenium.By;

public class HomePage extends Helpers {

    By sideMenuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public void clickSideMenu(){
        driver.findElement(sideMenuButton).click();
    }
}
