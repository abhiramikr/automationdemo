package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Hardassertion {
	
	ChromeDriver driver;
	
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void tes()
{
	driver.get("https://www.google.com");
	String actualtitle=driver.getTitle();
	String exptitle="Google";
	
	System.out.println("title= "+ actualtitle);
	
	Assert.assertEquals(exptitle, actualtitle,"verified");
	System.out.println("verified");
	
}

}
