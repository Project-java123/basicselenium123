package basicTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	@Test
	@Parameters("Data")
	public void testcase01(String s) {
		System.out.println(s);
	}
	@Test
	@Parameters("Data1")
	public void testcase02(String s) {
		System.out.println(s);
	}
}
