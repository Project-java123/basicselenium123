package selfstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		WebElement userNameField= driver.findElement(By.xpath("//input[@id='loginform-username']"));
		userNameField.sendKeys("aswathi");
		
		WebElement passwordField=driver.findElement(By.id("loginform-password"));
		passwordField.sendKeys("ash123");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		//loginButton.click();
		
		String backgroundColor=loginButton.getCssValue("background-color");
		System.out.println(backgroundColor);
		String attributeType=loginButton.getAttribute("name")	;
		System.out.println(attributeType);

		String tagName = loginButton.getTagName();
		System.out.println(tagName);
		
		String elememtText = loginButton.getText();
		System.out.println(elememtText);
				
		
		
			

	}

}
