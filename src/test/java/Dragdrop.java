import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Dragdrop {
    @Test
    public void drag(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
        Actions task =new Actions (driver);
//        WebElement a = driver.findElement(By.id("draggable"));
//        WebElement b = driver.findElement(By.id("droppable"));
//        task.dragAndDrop(a,b).perform();
        WebElement a =driver.findElement(By.id("dragBox"));
        WebElement b = driver.findElement(By.id("greedyDropBoxInner"));
        task.dragAndDrop(a,b).perform();

    }
}
