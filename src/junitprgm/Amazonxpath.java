package junitprgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonxpath {
	ChromeDriver driver;
	
	@Before
	public void amzon()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void verification()
	{
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("mobiles");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']/span/input")).click();
		driver.findElement(By.xpath("//div[@class='layoutToolbarPadding']/a[4]/div/span")).click();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[7]")).click();
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@class='nav-sprite']/div/a/i")).click();
		
	}

}
