package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogin {
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		
		String expurl="https://www.facebook.com/profile";
		String actualurl=driver.getCurrentUrl();
		
		if(expurl.equals(actualurl))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("invalid login");
		}
	}

}
