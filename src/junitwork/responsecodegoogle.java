package junitwork;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class responsecodegoogle {
ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void  test()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("The total number of links are: "+li.size());
		
		for (WebElement ele:li)
		{
			String link=ele.getAttribute("href");
			verifylink(link);
		}

}
	private void verifylink(String link) {
		
		try
		{
			URI ob=new URI(link);
			
			HttpURLConnection c=(HttpURLConnection) ob.toURL().openConnection();
			if(c.getResponseCode()==200)
			{
				System.out.println("suuccessful response code is 200 -----"+link);
			}
			else if(c.getResponseCode()==404)
			{
				System.out.println("broken link  response code is 404 -----"+link);
			}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

		
	}
		
	}
