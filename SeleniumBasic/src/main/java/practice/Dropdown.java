package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//single element select
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select obj=new Select(dropDown);
		obj.selectByIndex(2);
		WebElement selectedElement=obj.getFirstSelectedOption();
		String selectedElementText=selectedElement.getText();
		System.out.println(selectedElementText);
		
		//multiple element select
		WebElement multiDropdown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select mulObj= new Select(multiDropdown);
	     
		for(int i=0;i<3;i++) {	    	 
	       mulObj.selectByIndex(i);	    	
	     }
		List<WebElement> droplist=mulObj.getAllSelectedOptions();
		for(int j=0;j<droplist.size();j++) {
			System.out.println(droplist.get(j).getText());
		}

	}

}
