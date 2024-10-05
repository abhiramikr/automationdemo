package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Doubletaskmiss {
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
		WebElement right=driver.findElement(By.xpath(""));
		
	}

}
