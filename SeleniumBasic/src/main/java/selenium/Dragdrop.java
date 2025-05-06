package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
        driver.manage().window().maximize();
        
        Actions obj=new Actions(driver);
        WebElement sourceElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
        WebElement targetElement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
        obj.dragAndDrop(sourceElement, targetElement).perform();
        
        WebElement sourceElement1=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
        WebElement targetElement1=driver.findElement(By.xpath("//div[@id='mydropzone']"));
        obj.dragAndDrop(sourceElement1, targetElement1).perform();
        
        WebElement sourceElement2=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
        WebElement targetElement2=driver.findElement(By.xpath("//div[@id='mydropzone']"));
        obj.dragAndDrop(sourceElement2, targetElement2).perform();


        WebElement sourceElement3=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
        WebElement targetElement3=driver.findElement(By.xpath("//div[@id='mydropzone']"));
        obj.dragAndDrop(sourceElement3, targetElement3).perform();
        

	}

}
