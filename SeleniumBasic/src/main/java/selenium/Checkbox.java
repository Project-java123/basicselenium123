package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement gridCheckBox = driver.findElement(By.id("gridCheck"));
		boolean b =gridCheckBox.isSelected();     //checks if the checkbox is selected using isSelected()
		System.out.println(b);                    //if not selected false value is printed
		gridCheckBox.click();                     //click the checkbox to toggle the status
		boolean b1 =gridCheckBox.isSelected();    //again checked if its selected
		System.out.println(b1);                   //prints the updated value now
		
		
		WebElement selectAllPresnt = driver.findElement(By.id("button-two"));
		boolean b2= selectAllPresnt.isDisplayed();
		System.out.println(b2);
		boolean b3 = selectAllPresnt.isEnabled();
		System.out.println(b3);
	}

}






//https://selenium.qabible.in/radio-button-demo.php
