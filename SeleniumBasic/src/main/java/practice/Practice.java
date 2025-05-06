package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement signUp=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		signUp.click();
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("asw");
		WebElement secName=driver.findElement(By.xpath("//input[@name='lastname']"));
		secName.sendKeys("vas");
		WebElement fRadio=driver.findElement(By.xpath("//input[@value='1']"));
		fRadio.click();
		WebElement mobField=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobField.sendKeys("7558836728");
		WebElement passwordField=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		passwordField.sendKeys("vghjkj");
		WebElement signUp1=driver.findElement(By.xpath("//button[@name='websubmit']"));
		signUp1.click();
	
	
	}

}
