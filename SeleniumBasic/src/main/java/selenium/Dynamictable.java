package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> tablename=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int i=0;i<tablename.size();i++)
		{
			if(tablename.get(i).getText().equals("Herrod Chandler")) 
			{
			String locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1) +"]//td[2]";         //html value starts from 1 and loop starts from 0 so (i+1) is given
			System.out.println(locator);
			WebElement element=driver.findElement(By.xpath(locator));
			System.out.println(element.getText());
			//String position=element.getText();
			//System.out.println(position);
			break;
		    }
	    }
	}
}
