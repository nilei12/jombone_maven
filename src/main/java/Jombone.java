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

public class Jombone {


    @Test
    public static void main(String[] args){
  //      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 5");
        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("http://52.60.159.184/login");

        driver.findElement(By.id("email"));
        WebElement firstname = driver.findElement(By.name("email"));
        firstname.sendKeys("testercoding@busyqa.com");

        driver.findElement(By.id("password-field"));
        WebElement lastname = driver.findElement(By.id("password-field"));
        lastname.sendKeys("codetest12@$");

        driver.findElement(By.id("sbBt"));
        WebElement submitbotton = driver.findElement(By.id("sbBt"));
        submitbotton.click();


       // Set<String> a = driver.getWindowHandles();
        //System.out.println("child window handle is " + a);
        //Iterator<String> it = a.iterator();
        //String chlwnd = it.next();
        //driver.switchTo().window(chlwnd);
        //System.out.println("Page title" + driver.switchTo().window(chlwnd).getTitle());
        //driver.close();
        //driver.switchTo().window();

        //driver.switchTo().frame("Fancybox-frame");

        //driver.findElement(By.className("//*[@id="update-profile-prompt"]/div/div/div/span")).click();

        //driver.switchTo().defaultContent();

        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[3]/div[1]/div[1]/div[1]/span[1]"));
        WebElement cancelbutton = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[3]/div[1]/div[1]/div[1]/span[1]"));
        cancelbutton.click();
    }
}
