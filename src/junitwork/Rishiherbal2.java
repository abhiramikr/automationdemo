package junitwork;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal2 {
	
	ChromeDriver driver;
	private Object Link;
	
	@Before
	public void rishi()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	
	@Test
	public void textverification()
	{
		String atualtitle=driver.getTitle();
		String exptitle="rishiherbal";
		
		if(atualtitle.equals(exptitle))
		{
			System.out.println("Expected title");
		}
		else
		{
			System.out.println("Error in title");
		}
	}
	@Test
	public void linkno()
	{
		List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links are : "+li.size());
		int num=li.size();
		int exp=100;
		
		if(exp==num)
		{
			System.out.println("The number of links are as per expectation");
		}
		else
		{
			System.out.println("The number of links are not as per expectation");
		}
	}
	
	@Test
	public void textverification9()
	{
		String s=driver.getPageSource();
		if(s.contains("FOOD"))
		{
			System.out.println(" the site contains the text");
		
		}
		else
		{
			System.out.println("the site donot contain the text");
		}
	}
	@Test
	public void health()
	{
		driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
		
	}

}
