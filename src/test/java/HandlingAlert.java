import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAlert {
    @Test
    public void popup(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
//        driver.findElement(By.id("alertButton")).click();
//        Alert a = driver.switchTo().alert();
//        a.accept();
        driver.findElement(By.id("confirmButton")).click();
        Alert A = driver.switchTo().alert();
        A.dismiss();
        driver.findElement(By.id("promtButton")).click();
        Alert B= driver.switchTo().alert();
        B.sendKeys("Jhanvi");
        B.accept();
    }
}
