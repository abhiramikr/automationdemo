package junitprgm;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleresponse {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("total number of links "+li.size());
		for(WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verifylink (link);
			
		}
	}
	private void verifylink(String link) {
		try
		{

			URI ob=new URI(link);
			HttpURLConnection ca=(HttpURLConnection) ob.toURL().openConnection();
			if(ca.getResponseCode()==200)
			{
				System.out.println("Successfull response code is 200----"+link);
			}
			else if (ca.getResponseCode()==404)
			{
				System.out.println("Successfull response code is 404----"+link);
			}

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
