import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dragdrop2 {
    @Test
    public void sele() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        WebElement iframe = driver.findElement(By.xpath("//iframe[@src='data:image/gif;base64,R0lGODlhAQABAAAAACH5BAEKAAEALAAAAAABAAEAAAICTAEAOw==']"));
        driver.switchTo().frame(iframe);
        WebElement a = driver.findElement(By.xpath("//img[@src='images/high_tatras4_min.jpg']"));
        WebElement b = driver.findElement(By.id("trash"));
        Actions act = new Actions(driver);
        act.dragAndDrop(a, b).perform();
    }
}
