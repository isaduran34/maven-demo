import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Search {

    WebDriver driver;

    @BeforeMethod
    public void setup(){


        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }
    @Test
    public void googleSearch() {


        driver.findElement(By.name("q")).sendKeys("Chicken" + Keys.ENTER);
        Assert.assertTrue(driver.getTitle().contains("Chicken"));

    }







}
