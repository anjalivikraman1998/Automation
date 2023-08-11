package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select {
	WebDriver driver;
	By women=By.xpath("//*[@id=\"root\"]/div[1]/header/div[4]/div/nav/ul/li[2]/a");
	By dress=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[2]/div/div/section[2]/ul/li[4]/a");
	By seldress=By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[4]/div/article[1]/a");
	By dresssize=By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[2]/div[1]/div/div[1]/div[2]/div/div[2]/div/form/div[2]/fieldset/div/div[2]/label");
	By cartbutn=By.xpath("//*[@id=\"buyBoxForm\"]/div[3]/div/div/div/button");
	By search=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/div[1]/form/input");
	By close= By.xpath("/html/body/div[4]/div/div[1]/button");
	By searchbutn=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/div[1]/form/button");
	public Select(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void womenclk()
	{
		driver.findElement(women).click();
		driver.findElement(dress).click();
	}
	public void scroll()
	{
		WebElement w=driver.findElement(dress);
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,600);");
    	driver.navigate().refresh();
	}
	public void selectdress()
	{
		driver.findElement(seldress).click();
	}
	public void addcart()
	{
		WebElement o=driver.findElement(dresssize);
	   	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",o);
	   	   o.click();
	   	driver.findElement(cartbutn).click();
		driver.navigate().back();
		driver.navigate().back();
	   	   
	}
	public void searchitem()
	{
		driver.findElement(search).sendKeys("shoes for women");
		driver.findElement(close).click();
		driver.findElement(searchbutn).click();
	}
	public void shoewomen()
	{

		   WebElement w=driver.findElement(searchbutn);
	   	JavascriptExecutor js=(JavascriptExecutor)driver;
	   	js.executeScript("window.scrollBy(0,600);");
	   	driver.navigate().back();   	
	     
	}
}
