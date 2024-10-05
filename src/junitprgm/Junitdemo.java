package junitprgm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


public class Junitdemo {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(exptitle.equals(actualtitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	
	@Test
	public void textVerification()
	{
		String src=driver.getPageSource();
		if(src.contains("images"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not  present");
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
