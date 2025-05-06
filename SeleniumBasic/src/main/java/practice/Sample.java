package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> tableHead=driver.findElements(By.xpath("//table[@id='countries']//tbody//tr/td[2]"));
		for(int i=0;i<tableHead.size();i++) {
			System.out.println(tableHead.get(i).getText()+" ");
		}	
		
	}
}
