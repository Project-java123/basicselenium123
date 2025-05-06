package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFile.sendKeys("C:\\Users\\Acer\\Desktop\\manual");
	}

}
