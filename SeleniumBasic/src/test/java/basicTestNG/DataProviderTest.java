package basicTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	//use DataProvider in a test
	@Test(dataProvider = "data-provider")
	public void testCase01(String data, int n) {
		System.out.println(data +" "+ n);
	}
	
	//define DataProvider
	@DataProvider(name = "data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "data1", 5 }, { "data2", 6 }, { "data3", 5 }, { "data4", 6 } };
	}

	@Test(dataProvider = "data-provider1", dataProviderClass = BasicAnnotation.class)
	public void testCase02(String data, int n, String s) {
		System.out.println(data +" "+n+" "+ s);
	}
 
  }

