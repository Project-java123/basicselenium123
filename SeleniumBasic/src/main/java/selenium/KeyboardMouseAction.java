package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
		
		Actions actObj=new Actions(driver);
		//double click
		WebElement doubleClickMe=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		actObj.doubleClick(doubleClickMe).perform();
	}

}
