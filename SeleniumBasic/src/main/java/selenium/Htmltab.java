package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmltab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> tableHead=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		for(int i=0;i<tableHead.size();i++) {
			System.out.print(tableHead.get(i).getText()+" ");
			}
		System.out.println();
		
		List<WebElement> tableRow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int i=0;i<tableRow.size();i++) {
			System.out.print(tableRow.get(i).getText()+" ");
		}
		List<WebElement> tableColumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		for(int i=0;i<tableColumn.size();i++) {
			System.out.println(tableColumn.get(i).getText()+" ");
		}
		
		
		driver.quit();
	}

}
