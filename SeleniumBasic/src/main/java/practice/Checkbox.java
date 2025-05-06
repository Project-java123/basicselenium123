package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement singleCheck=driver.findElement(By.id("gridCheck"));
		boolean b=singleCheck.isSelected();
		System.out.println(b);
		singleCheck.click();
		WebElement multiCheckbox1=driver.findElement(By.id("check-box-one"));
		multiCheckbox1.click();
		
		WebElement multiCheckbox2=driver.findElement(By.id("check-box-two"));
		multiCheckbox2.click();
		
		WebElement multiCheckbox3=driver.findElement(By.id("check-box-three"));
		multiCheckbox3.click();
		
		WebElement multiCheckbox4=driver.findElement(By.id("check-box-four"));
		multiCheckbox4.click();
		
		WebElement selectAll=driver.findElement(By.id("button-two"));
		boolean b1=selectAll.isDisplayed();
		System.out.println(b1);
		boolean b2=selectAll.isEnabled();
		System.out.println(b2);
		selectAll.click();
	}

}
