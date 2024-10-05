package testng;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task2 {
	
ChromeDriver driver;

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://janasya.com/");
}

@Test
public void test1()
{
	String actualtitle=driver.getTitle();
	String exptitle="Janasya";
	System.out.println(actualtitle);
	if(actualtitle.equals(exptitle))
	{
		System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
}
@Test
public void test2count()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("total number of links "+li.size());
	int actualcount=li.size();
	int expcount=400;
	if(actualcount==expcount)
	{
		System.out.println("The link count is as per expectation");
	}
	else
	{
		System.out.println("The link count is not as per expectation");
	}
}
@Test
public void screenshot() throws IOException
{

	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(sc, new File("C:\\Users\\Abhirami K R\\Desktop\\screenshot.png"));
	
}
}
