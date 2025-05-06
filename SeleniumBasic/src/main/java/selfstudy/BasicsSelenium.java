package selfstudy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicsSelenium {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		String title=driver.getTitle();
		System.out.println("title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("current url is "+ url);
		String src=driver.getPageSource();
		System.out.println(src);
		driver.close();
		driver.quit();
		
	}
	
}
