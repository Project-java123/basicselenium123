package selfstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		
		
	}

}
