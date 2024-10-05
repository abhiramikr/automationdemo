package junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void fb()
	{
		driver.findElement(By.id("email")).sendKeys("abhi@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("abhi");
	    driver.findElement(By.name("login")).click();
	}

}
