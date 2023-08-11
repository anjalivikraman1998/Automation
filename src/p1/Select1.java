package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select1 {
WebDriver driver;
By sales=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[7]/a");
By sandals=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[7]/div/div/section[1]/ul/li[3]/a");
By sandalselct=By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[4]/div/article[1]/a");
By fav=By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/div/div/button");
By createfav=By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[2]/div[1]/div/div[1]/div[1]/div[1]/div/div/div/button");
By enterfav=By.xpath("/html/body/div[5]/div/div/div/form/div[1]/div[2]/input");
By createbutn=By.xpath("/html/body/div[5]/div/div/div/form/div[2]/button[2]");
By cart2=By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/a[2]");
By view=By.xpath("/html/body/div[5]/div/div[4]/form/button");
public Select1(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void salescategory()
{
	driver.findElement(sales).click();
	driver.findElement(sandals).click();
	
}
public void scroll3()
{
	WebElement o=driver.findElement(sandalselct);
   	   ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",o);
   	   o.click();
   	   
}
public void favourite()
{
	driver.findElement(fav).click();
	driver.findElement(createfav).click();
	driver.findElement(enterfav).sendKeys("MY FAV");
	driver.findElement(createbutn).click();
}
public void method()
{
	driver.findElement(cart2).click();
	driver.findElement(view).click();
}}
