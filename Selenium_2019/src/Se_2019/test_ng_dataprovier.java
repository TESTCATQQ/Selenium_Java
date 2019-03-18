package Se_2019;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test_ng_dataprovier {
	
	@DataProvider(name="user")
	public Object[][] users(){
		return new Object[][] {
			{"t01","t01"},
			{"t02","t03"},
			{"t03","t03"}
		};
	}
	
	@Test(dataProvider="user")
	public void testdata(String name1,String name2) {
		System.out.println(name1+name2);
		Assert.assertEquals(name1, name2,"name1=name2");
	}
}
