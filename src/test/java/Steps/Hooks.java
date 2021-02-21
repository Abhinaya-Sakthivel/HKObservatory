package Steps;

import Utilities.Helpers;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Hooks extends Helpers {


    @After
    public void tearDown(Scenario scenario) {
        System.out.println("inside screenshot");
        if (scenario.isFailed()) {
            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            String methodName = scenario.getName();
            String path = System.getProperty("user.dir") + "/Screenshot/" + methodName + java.time.LocalDateTime.now() + ".png";
            File destination = new File(path);
            try {
                FileUtils.copyFile(screenshot, destination);
            } catch (IOException e) {
                System.out.println("Capture Failed " + e.getMessage());
            }
        }
    }
}
