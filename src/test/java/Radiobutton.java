import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Radiobutton {
    @Test
    public void Radio(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver .get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
        driver.findElement(By.xpath("//lable[@for='hobbies-checkbox-2']")).click();

    }
}
