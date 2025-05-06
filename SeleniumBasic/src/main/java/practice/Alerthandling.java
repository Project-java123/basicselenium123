package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		/*WebElement Alert=driver.findElement(By.xpath("//button[text()='Click me!']"));
		Alert.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();*/

		WebElement confirmbox=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		confirmbox.click();
		driver.switchTo().alert().dismiss();
		
		/*WebElement prompt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		prompt.click();
	    prompt.sendKeys("aswathi");
		driver.switchTo().alert().accept();*/
	}

}
