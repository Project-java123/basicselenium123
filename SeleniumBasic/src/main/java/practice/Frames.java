package practice;

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
		
		//switch to frame by id or name
		driver.switchTo().frame("frame1");  
		WebElement frameText=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameText.getText());
		
		//switch to frame by WebElement
		WebElement iframeElement=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(iframeElement);
		WebElement frameText1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameText.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		
		
		
	

	}

}
