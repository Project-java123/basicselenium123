package selfstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement clickmeButton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickmeButton.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		
		WebElement clickmeButton1=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickmeButton1.click();
		String confirmtext=driver.switchTo().alert().getText();
		System.out.println(confirmtext);
		driver.switchTo().alert().dismiss();
	}

}
