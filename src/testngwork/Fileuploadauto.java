package testngwork;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadauto {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testfile() throws IOException, InterruptedException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("\"C:\\Users\\Abhirami K R\\Desktop\\demo\\fileauto.exe\"");
		Thread.sleep(3000);
	}

}
