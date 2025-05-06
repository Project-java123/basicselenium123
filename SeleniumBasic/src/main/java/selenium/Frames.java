package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//step 1 switch to frame
		//switch by name or id
		/*driver.switchTo().frame("frame1");
		WebElement frameText=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	    System.out.println(frameText.getText())*/
		
		//switch by WebElement
		WebElement iframeElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		
		//step 2 Action
		WebElement frameText=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameText.getText());
		
		//step 3 back to main frame
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent(); //both switchTo parent and defaultcontent will switch back to main frame
	}

}
