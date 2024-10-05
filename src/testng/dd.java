package testng;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dd {
	
	ChromeDriver d;
	
	@BeforeTest
	public void beftest()
	{
		d=new ChromeDriver();
		
	}
	@Test
	public void test()
	{
		d.get("https//demo.guru99.com/popup.php");
		
		String parentwindow = d.getWindowHandle();
		
		System.out.println("Parent Window title " +d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click();
		
		
		Set<String>allwindowhandles =d.getWindowHandles();
		
		for(String handle: allwindowhandles)
		{
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				d.switchTo().window(handle);
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
				d.close();
			}
			d.switchTo().window(parentwindow);
		}
		
	}

}
