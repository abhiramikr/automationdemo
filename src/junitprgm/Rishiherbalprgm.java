package junitprgm;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbalprgm {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="rishiherbal";
		if( exptitle.equals(actualtitle))
		{
			System.out.println("Title displayed as expected");
		}
		else
		{
			System.out.println("Title not displayed as expected");
		}
	}
		
		@Test
		public void count()
		{
			List<WebElement> li=driver.findElements(By.tagName("a"));
			System.out.println(" Total number of links are: "+li.size());
			int num=li.size();
			int exp=100;
			if( exp==num)
			{
				System.out.println("Tototal number of links as expected");
			}
			else
			{
				System.out.println("Tototal number of links is not as expecte");
			}
		}
		@Test
		public void testverification()
		{
			String s=driver.getPageSource();
			if(s.contains("FOOD"))
					{
				System.out.println("TEXT IS PRESENT");
					}
			else
			{
				System.out.println("TEXT IS NOT PRESENT");
				
			}
		}
		@Test
		public void health()
		{
			driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
		}
		
	}
	


