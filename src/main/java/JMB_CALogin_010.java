package  com.selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.Iterator;

public class JMB_CALogin_010 {


    @Test
    public static void main(String[] args) {
        //      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 5");
        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("http://52.60.159.184/");
        driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
        WebElement signonbutton = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
        signonbutton.click();

        driver.findElement(By.id("email"));
        WebElement firstname = driver.findElement(By.id("email"));
        firstname.sendKeys("canfin@mailinator.com");

        driver.findElement(By.id("password-field"));
        WebElement lastname = driver.findElement(By.id("password-field"));
        lastname.sendKeys("VH#eG@t7@");

        driver.findElement(By.id("sbBt"));
        WebElement submitbotton = driver.findElement(By.id("sbBt"));
        submitbotton.click();

    }
}