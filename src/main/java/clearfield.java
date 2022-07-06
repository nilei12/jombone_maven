import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class clearfield {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new SafariDriver();

        driver.manage().window().maximize();
        driver.get("http://52.60.159.184/jobs");
        // driver.navigate().refresh();

        driver.findElement(By.name("jobTitle"));
        WebElement jobtitle = driver.findElement(By.name("jobTitle"));
        jobtitle.sendKeys("HR");

        driver.findElement(By.name("locationCity"));
        WebElement location = driver.findElement(By.name("locationCity"));
        location.sendKeys("toronto");

          driver.findElement(By.id("selectpicker1"));
         Select shift = new Select( driver.findElement(By.id("selectpicker1")));
        if(shift.isMultiple()) {
           shift.selectByVisibleText("MORNING");
          shift.selectByVisibleText("AFTERNOON");
           }

        driver.navigate().refresh();
        driver.findElement(By.name("jobTitle"));
        WebElement jobtitlefresh = driver.findElement(By.name("jobTitle"));
        String textInsideInputBox = jobtitlefresh.getAttribute("value");

        if (textInsideInputBox.isEmpty()){
            System.out.println("job field is empty after refreshing the page");
        }
        else{
            System.out.println("job field is not empty after refreshing the page, test cas failed");
        }

        driver.findElement(By.name("locationCity"));
        WebElement locationfresh = driver.findElement(By.name("locationCity"));
        String textInsidelocationBox = locationfresh.getAttribute("value");

        if(textInsidelocationBox.isEmpty())
        {
            System.out.println("location field is empty after refreshing the page");
        }
        else{
            System.out.println("job field is not empty after refreshing the page, test cas failed");
        }
    }
}