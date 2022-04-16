package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class setup {
    public static WebDriver driver;

    //browser
    public static WebDriver setupBrowser(String drivertype){

        if(drivertype.equalsIgnoreCase("ch")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(drivertype.equalsIgnoreCase("ff")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(drivertype.equalsIgnoreCase("sa")){
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;

    }


}
