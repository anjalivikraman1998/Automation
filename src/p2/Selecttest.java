package p2;

import org.testng.annotations.Test;

import p1.Select;

public class Selecttest extends Logintest{
	@Test(priority=2)
	public void test1() throws InterruptedException
	{
		Select ob=new Select(driver);
	
	ob.womenclk();
	Thread.sleep(3000);
	ob.scroll();
	Thread.sleep(3000);
	ob.selectdress();
	Thread.sleep(3000);
	ob.addcart();
	Thread.sleep(3000);
	ob.searchitem();
	Thread.sleep(3000);
	ob.shoewomen();
	Thread.sleep(3000);
}}
