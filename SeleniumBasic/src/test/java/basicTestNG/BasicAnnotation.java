package basicTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicAnnotation extends AllAnnotationTest{
	  @Test(priority=-1)
	  public void testCase01() {
		  System.out.println("testCase01");
	  }
	  @Test(priority=2)
	  public void testCase02() {
		  System.out.println("testCase02");
	  }
	  @Test(enabled=false)
	  public void testCase03() {
		  System.out.println("testCase03");
	  }
	  @Test(priority=-1,enabled=true)
	  public void testCase04() {
		  System.out.println("testCase04");
	  }
	  @Test
	  public void testCase05() {
		  System.out.println("testCase05");
	  }
	  @DataProvider(name = "data-provider1")
	  public Object[][] dpMethod() {
	      return new Object[][] {{"data1",5,"Ash"}, {"data2",6,"Ash2"},{"data3",5,"Ash3"}, {"data4",6,"Ash4"}};
	  }
	}

