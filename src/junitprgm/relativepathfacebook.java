package junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativepathfacebook {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void fb()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abhi@gmail.com");
	    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abhi");
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
