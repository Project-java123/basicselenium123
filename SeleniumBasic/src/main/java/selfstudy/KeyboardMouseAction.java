package selfstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().window().maximize();
        
        //double click
        Actions obj=new Actions(driver);
        WebElement doubleClickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        obj.doubleClick(doubleClickme).perform();
        
        //right click
        WebElement rightClickme=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
        obj.contextClick(rightClickme).perform();
        
        //mouse hovering
        WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        obj.moveToElement(clickme).perform();
        
        //keyboard events
        obj.sendKeys(Keys.ARROW_LEFT);
        
        
        
       
        
        
        
        
	}

}
