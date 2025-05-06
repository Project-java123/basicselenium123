package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltab {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-sort-search.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> tableHead=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		for(int i=0;i<tableHead.size();i++) {
			System.out.print(tableHead.get(i).getText()+" ");
		}
		
		List<WebElement> tablecolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int i=0;i<tablecolumn.size();i++) {
			System.out.println(tablecolumn.get(i).getText());
		}
			System.out.println();
			
			List<WebElement> tableRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
			for(int j=0;j<tableRow.size();j++) {
				System.out.print(tableRow.get(j).getText()+" ");
		}

	}
	}

