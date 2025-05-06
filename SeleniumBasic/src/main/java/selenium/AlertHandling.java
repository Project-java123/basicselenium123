package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement ClickmeButton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		ClickmeButton.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
	/*	WebElement ClickmeButton2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		ClickmeButton2.click();
		driver.switchTo().alert().dismiss();			*/
	}
}
//https://www.tutorialspoint.com/selenium/practice/alerts.php  Assignment