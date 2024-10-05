package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createfbpage;

public class Createfb {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void test() {
		
		Createfbpage cp=new Createfbpage(driver);
		cp.createpageclick();
		cp.verification();
		cp.clicksignin();
		
		
	}

}
