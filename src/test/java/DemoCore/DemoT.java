package DemoCore;

import Demo.DemoTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DemoT {
    @Test
    public void verifyBonigarciaWorks(){
        WebDriver driver = new DemoTests().getDriver();
        driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.4.3");
    }

    /**
     * Verify firefox setup
     */
    @Test
    public void verifyBonigarciaWorksForFireFox(){
        WebDriver driver = new DemoTests().firefoxDriver();
        driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/4.4.3");
    }
}
