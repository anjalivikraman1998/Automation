package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
WebDriver driver;
By continues=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/a/img");
By logout=By.xpath("//*[@id=\"headerMyAccountDropdownToggle\"]");
By close1=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/div[2]/div/div/a[5]");
public Logout(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void log()
{
	driver.findElement(continues).click();
	driver.findElement(logout).click();
	driver.findElement(close1).click();
}
}
