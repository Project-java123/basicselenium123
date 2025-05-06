package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
	/*	WebElement dropDown=driver.findElement(By.id("single-input-field"));
		Select obj = new Select(dropDown);//create object for select class
		//obj.selectByIndex(1);
		obj.selectByVisibleText("Red");
		//obj.selectByValue("Green");
		
		WebElement selectedElement=obj.getFirstSelectedOption();
		String selectedElementText=selectedElement.getText();
		System.out.println(selectedElementText);*/
		
		WebElement multiDropdown=driver.findElement(By.id("multi-select-field"));
		Select multiObject=new Select(multiDropdown);
		for(int i=0;i<3;i++)
		{
			multiObject.selectByIndex(i);
		}
		
		List<WebElement> dropList = multiObject.getAllSelectedOptions();//list all the elements in the dropdown
		for(int j=0;j<dropList.size();j++) {
			System.out.println(dropList.get(j).getText());
		}

}
}
