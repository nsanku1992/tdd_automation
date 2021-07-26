package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTests {
    /**
     * this function set ups and returns the chrome driver
     * @return
     */
    public ChromeDriver getDriver(){
        WebDriverManager.chromedriver().mac().setup();
        return new ChromeDriver();
    }

    public FirefoxDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().mac().setup();
        return new FirefoxDriver();

    }
}
