package junitwork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fcebook2 {
	
	ChromeDriver driver;
	@Before
	public void intro()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void fb()
	{
		driver.findElement(By.id("email")).sendKeys("abhirami@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("abhi");
		driver.findElement(By.name("login")).click();
		
	}
	
}
