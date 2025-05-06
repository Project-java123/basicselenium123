package assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		
		/*WebElement alert=driver.findElement(By.xpath("//button[@onclick='showAlert()']"));
		alert.click();
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();*/
		
	    WebElement clickMe=driver.findElement(By.xpath("//button[@onclick='myMessage()']"));
		clickMe.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		
		/*WebElement clickMe1=driver.findElement(By.xpath("//button[@onclick='myDesk()']"));
		clickMe1.click();
		driver.switchTo().alert().dismiss();*/
		
		
	}

}
