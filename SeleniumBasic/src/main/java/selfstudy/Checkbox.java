package selfstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement gridCheckbox=driver.findElement(By.id("gridCheck"));
		boolean b=gridCheckbox.isSelected();
		System.out.println(b);
		gridCheckbox.click();
		boolean b1=gridCheckbox.isSelected();
		System.out.println(b1);
		WebElement selectAllPresent=driver.findElement(By.id("button-two"));
		boolean b2=selectAllPresent.isDisplayed();
		System.out.println(b2);
		boolean b3=selectAllPresent.isEnabled();
		System.out.println(b3);
		
	}

}
