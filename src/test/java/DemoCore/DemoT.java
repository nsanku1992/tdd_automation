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
}
