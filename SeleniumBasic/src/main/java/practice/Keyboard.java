package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
        driver.manage().window().maximize();
        
        Actions obj=new Actions(driver);
        WebElement doubleclickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
        obj.doubleClick(doubleclickme).perform();
        WebElement rightclickme=driver.findElement(By.xpath("//button[@class='btn btn-secondary']"));
        obj.contextClick(rightclickme).perform();
        
	}

}
