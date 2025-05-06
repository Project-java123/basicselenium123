package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//div[@class='_6lux']//input[@id='email']"));
		userName.sendKeys("Aswathi");
		WebElement password=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		password.sendKeys("12ghj");
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		//WebElement newAcct=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		//newAcct.click();
		

	}

}
