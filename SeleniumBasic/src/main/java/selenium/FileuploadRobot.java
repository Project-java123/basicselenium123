package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadRobot {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement uploadButton=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		//uploadFile.click();
		Actions obj=new Actions(driver);
		obj.moveToElement(uploadButton).click().perform();
		StringSelection ss = new StringSelection("C:\\Users\\Acer\\Downloads\\pdfexample.pdf"); 
  	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
  	    
  	     Robot robot = new Robot();
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.delay(250);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.delay(250);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
