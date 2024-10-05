package junitprgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void  test()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are: "+li.size());
		
		for (int i = 0; i < li.size(); i++)
		{
			System.out.println(li.getText().getAttribute("href"));
		}
	}

}
