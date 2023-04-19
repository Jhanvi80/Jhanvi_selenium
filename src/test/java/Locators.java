import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
    @Test
    public void locator(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.id("pass")).click();
        //or
        WebElement a= driver.findElement(By.id("pass"));
        a.sendKeys("Hello");
        WebElement b =driver.findElement(By.name("email"));
        b.sendKeys("jhanvi");
       // driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.name("login")).click();

    }


}
