package Se_2019;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class test_ng_01 {
	
	@BeforeTest
	public void bef() {
		System.out.println("BeforeTest");
	}
	
	@Test(groups= {"smoke"})
	public void test_01() {
		Assert.assertEquals("2", "3");
	}
	
	@Test(groups= {"smoke"})
	public void test_02() {
		Assert.assertEquals("2", "2" ,"2.equals");
	}
	
	@AfterTest
	public void aft() {
		System.out.println("AfterTest");
	}
	

}
