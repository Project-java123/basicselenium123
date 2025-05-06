package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
	/*	WebElement radioButton=driver.findElement(By.id("inlineRadio1"));
		boolean b=radioButton.isSelected();
		System.out.println(b);
		radioButton.click();
		boolean b1=radioButton.isSelected();
		System.out.println(b1);
		
		WebElement showSelectedValue=driver.findElement(By.id("button-one"));
		boolean b2=showSelectedValue.isDisplayed();
		System.out.println(b2);
        boolean b3=showSelectedValue.isEnabled();
        System.out.println(b3);
        showSelectedValue.click();*/
        
        WebElement radioButton1=driver.findElement(By.id("inlineRadio11"));
        //boolean b4=radioButton1.isSelected();
        //System.out.println(b4);
        radioButton1.click();
        
        WebElement radioButton2=driver.findElement(By.id("inlineRadio23"));
        //boolean b5=radioButton2.isSelected();
       // System.out.println(b5);
        radioButton2.click();
        
        WebElement getResultbutton=driver.findElement(By.id("button-two"));
        boolean b6=getResultbutton.isDisplayed();
        System.out.println(b6);
        boolean b7=getResultbutton.isEnabled();
        System.out.println(b7);
        getResultbutton.click();
        
		
	}

}
