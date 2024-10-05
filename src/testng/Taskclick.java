package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Taskclick {
	String baseurl="https://demo.guru99.com/test/simple_context_menu.html";
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		WebElement d=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		Actions act=new Actions(driver);
		act.doubleClick(d);
		act.perform();
		Alert a= driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
	}
	@Test
	public void test2()
	{
		WebElement rc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rc).sendKeys(Keys.ENTER);
		act.perform();
		try
		{
			Alert a= driver.switchTo().alert();
			String alerttext=a.getText();
			System.out.println(alerttext);
			a.accept();

		}
		
		catch(Exception e) 
		{
			System.out.println("No alert present: " + e.getMessage());
		}
		
	}

}
