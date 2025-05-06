package basicTestNG;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(priority=-1)
	  public void testCase20() {
		  System.out.println("testCase20");
	  }
	  @Test(priority=2,groups="Smoke")
	  public void testCase21() {
		  System.out.println("testCase21");
	  }
	  @Test(groups="Smoke")
	  public void testCase22() {
		  System.out.println("testCase22");
	  }
	  @Test(priority=-1,enabled=true)
	  public void testCase23() {
		  System.out.println("testCase23");
	  }
	  @Test
	  public void testCase24() {
		  System.out.println("testCase24");
	  }
  }
