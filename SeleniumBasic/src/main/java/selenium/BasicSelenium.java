package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasicSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");//wait till the page is loaded completely before any action is performed
		    //driver.navigate().to("https://www.google.com");

			driver.navigate().back();
			driver.navigate().refresh();
			driver.navigate().forward();
			
			driver.manage().window().minimize();
			driver.manage().window().maximize();
			
			
		
		String title=driver.getTitle();//return title bar name as string
		System.out.println(title);
		
		String url=driver.getCurrentUrl();//get page url
		System.out.println(url);
		
		String src= driver.getPageSource();//get html code
		System.out.println(src);
		
		driver.close();//--> current focus
		//driver.quit();//--> all windows
	}

}
