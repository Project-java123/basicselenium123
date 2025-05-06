package basicTestNG;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollTest {
  @Test
  public void scroll() {
	  WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,1000)");
  }
  public void clickJavaScriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
public void sendValueUsingJavaScript(WebDriver driver, WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '" + value + "'", element);
	}
public void blurThePlaceHolder(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].blur()", element);
	}
}

