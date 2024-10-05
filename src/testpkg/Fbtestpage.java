package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fblogin;

public class Fbtestpage {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void test1()
	{
		Fblogin ob=new Fblogin(driver);
		ob.setvalues("abc@gmail.com", "abc");
		ob.loginclick();
	}

}
