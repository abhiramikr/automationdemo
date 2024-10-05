package junitwork;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotdemo {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Abhirami%20K%20R/Desktop/demo/alert.html");
	}
	
	@Test
	public void screen() throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scr, new File ("D://alertscreenshot.png"));
		
		WebElement ele=driver.findElement(By.xpath("/html/body/input[1]"));
		File sc =ele.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(sc, new File ("./screenshot/button.png"));
	}

}
