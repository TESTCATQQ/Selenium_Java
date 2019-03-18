package Se_2019;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

public class test_ng_01 {
	
	@BeforeTest
	public void bef() {
		System.out.println("BeforeTest");
	}
	
	@Test(groups= {"smoke"})
	@Parameters({"test"})
	public void test_01(String test) {
		System.out.println(test);
		Assert.assertEquals(test, "3");
	}
	
	@Test(groups= {"smoke"})
	@Parameters({"test0319","test"})
	public void test_02(String test0319,String test) {
		System.out.println(test0319);
		Assert.assertEquals(test0319, "Jun" ,"2.equals");
	}
	
	@AfterTest
	public void aft() {
		System.out.println("AfterTest");
	}
	

}
