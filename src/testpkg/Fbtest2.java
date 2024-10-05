package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbpage;

public class Fbtest2 {
	WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	
	@Test
	public void test() 
	{
		Fbpage o=new Fbpage(driver);
		o.setvalues("abv@gmail.com", "nn");
		o.loginclick();
	}

}
