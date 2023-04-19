import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Uploadfile {
    @Test
    public void upload() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        WebElement a = driver.findElement(By.id("uploadPicture"));
        a.sendKeys("C:\\Users\\jhanv\\OneDrive\\Desktop\\firstpic\\photo.png");

    }
}
