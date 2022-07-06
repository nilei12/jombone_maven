package  com.selenium;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.Iterator;

public class JMB_CALogin_007 {


    @Test
    public static void main(String[] args) throws IOException {
        //      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 5");
        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("http://52.60.159.184/");
        driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
        WebElement signonbutton = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
        signonbutton.click();


        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("./Screenshots7/Image.png"));
    }

}