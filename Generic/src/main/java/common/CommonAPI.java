package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\Framework\\Generic\\src\\main\\java\\driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().fullscreen();
        this.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void cleanUp(){
        this.driver.close();
    }
}
