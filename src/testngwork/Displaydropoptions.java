package testngwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Displaydropoptions {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement path=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select se=new Select(path);
		List<WebElement>p=se.getOptions();
		int len=p.size();
		System.out.println(len);
		
		for (int i=0;i<len;i++)
		{
			String options=p.get(i).getText();
			System.out.println(options);
		}
	}

}
