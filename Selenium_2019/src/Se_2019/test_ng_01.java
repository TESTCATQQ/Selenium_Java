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
	
	@Test
	public void test_01() {
		Assert.assertEquals("2", "3");
	}
	
	@Test
	public void test_02() {
		Assert.assertEquals("2", "2");
	}
	
	@AfterTest
	public void aft() {
		System.out.println("AfterTest");
	}
	

}
