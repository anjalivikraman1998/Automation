package p2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import p1.Login1;

public class Logintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.zappos.com/");
		driver.manage().window().maximize();
	}
	@Test (priority=1)
	public void test() throws InterruptedException
	{
		Login1 ob=new Login1(driver);
		ob.signup();
		Thread.sleep(3000);
		ob.signup2();
		Thread.sleep(3000);
		ob.signin();
		Thread.sleep(3000);
}}
