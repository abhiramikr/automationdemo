package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddropdemo {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver ();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void dragndrop()
	{
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement acct=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement amtsource=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amtdestin=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		
		WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement saleacct=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement amtso=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amtdes=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions a=new Actions(driver);
		
		a.dragAndDrop(bank, acct).perform();
		a.dragAndDrop(amtsource, amtdestin).perform();
		a.dragAndDrop(sales, saleacct).perform();
		a.dragAndDrop(amtso, amtdes).perform();
		
	}
	@Test
	public void but()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		if(button.getText().equalsIgnoreCase("perfect"))
		{
			System.out.println("perfect");
		}
		
		
	}
	
	
	 

}
