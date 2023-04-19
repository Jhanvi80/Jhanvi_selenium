import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelector {
    @Test
    public void css(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("jhanvi");
        driver.findElement(By.cssSelector("input[id=lastName]")).sendKeys("khatri");
        driver.findElement(By.cssSelector("input#userEmail")).sendKeys("jhanvi@gmail.com");
        //suffix
        //driver.findElement(By.cssSelector("input[id$=ber]")).sendKeys("8475578457");
        //substring
        driver.findElement(By.cssSelector("input[id*=rNum]")).sendKeys("9542289815");

    }

}
