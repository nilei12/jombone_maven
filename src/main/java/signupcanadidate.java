import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class signupcanadidate {


    public static void main (String[] args)throws IOException {
      //  System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
     //   WebDriver driver = new ChromeDriver();
        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("http://52.60.159.184/candidate/signup");

        driver.findElement(By.name("firstName"));
        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("first name");

        driver.findElement(By.name("lastName"));
        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("last name");

         driver.findElement(By.id("sbBt"));
         WebElement submitIcon = driver.findElement(By.id("sbBt"));
         submitIcon.click();

       //  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // FileUtils.copyFile(screenshotFile, new File(".//screenshot/screen.png") );

        TakesScreenshot ts =(TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/Image.png"));
    }
}

