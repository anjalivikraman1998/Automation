package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1 {
	WebDriver driver;
	By signin=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/div[2]/div/a");
	By signinwithzapoos=By.xpath("/html/body/div[7]/div/div/section/div/div[1]/a[1]");
	By emailid=By.xpath("//*[@id=\"ap_email\"]");
	By password=By.xpath("//*[@id=\"ap_password\"]");
	By signbutn=By.xpath("//*[@id=\"signInSubmit\"]");
	public Login1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void signup()
	{
		driver.findElement(signin).click();
	}
	public void signup2()
	{
		driver.findElement(signinwithzapoos).click();
	}
	public void signin()
	{
		driver.findElement(emailid).sendKeys("anjalivikraman0413@gmail.com");
		driver.findElement(password).sendKeys("@anju123");
		driver.findElement(signbutn).click();
	}
}
