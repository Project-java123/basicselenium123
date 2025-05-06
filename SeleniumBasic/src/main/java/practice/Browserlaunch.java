package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String src=driver.getPageSource();
		System.out.println(src);
		driver.close();
		driver.quit();

	}

}
