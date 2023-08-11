package p2;

import org.testng.annotations.Test;

import p1.Select1;

public class Select1test extends Selecttest {
	@Test(priority=3)
	public void test2() throws InterruptedException
	{
		Select1 ob=new Select1(driver);
		ob.salescategory();
		Thread.sleep(3000);
		ob.scroll3();
		Thread.sleep(3000);
		ob.favourite();
		Thread.sleep(3000);
		ob.method();
		Thread.sleep(3000);
	}

}
