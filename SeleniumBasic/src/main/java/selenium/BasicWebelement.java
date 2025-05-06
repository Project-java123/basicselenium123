package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebelement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		//tagName[@attribute='value']  //xpath synatx
        WebElement userNameField=driver.findElement(By.xpath("//div[@class='form-group field-loginform-username required has-error']/input[@class='form-control']"));
		
		WebElement passwordField=driver.findElement(By.xpath("//form[@id='login-form']//input[@id='loginform-password']"));
		passwordField.sendKeys("password");
		
		//tagName[text()='elementText']
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Login']"));
		
		String backgroundColor=loginButton.getCssValue("background-color");
		System.out.println(backgroundColor);
		
		String attributeType = loginButton.getAttribute("class");
		System.out.println(attributeType);
		
		String tagName = loginButton.getTagName();
		System.out.println(tagName);
		
		String elememtText = loginButton.getText();
		System.out.println(elememtText);
		loginButton.click();

	}

}
