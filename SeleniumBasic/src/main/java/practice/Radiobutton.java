package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement radioBtn=driver.findElement(By.id("inlineRadio1"));
		radioBtn.click();
		//WebElement radioBtn1=driver.findElement(By.id("inlineRadio2"));
		//radioBtn1.click();
		WebElement showSelect=driver.findElement(By.id("button-one"));
		showSelect.click();
		
		WebElement grpRadioBtn1=driver.findElement(By.id("inlineRadio11"));
		grpRadioBtn1.click();
		
		WebElement grpRadioBtn2=driver.findElement(By.id("inlineRadio22"));
		grpRadioBtn2.click();
		
		WebElement getResult=driver.findElement(By.id("button-two"));
		boolean b=getResult.isDisplayed();
		System.out.println(b);
		boolean b1=getResult.isEnabled();
		System.out.println(b1);
		getResult.click();
		
		
	}

}
