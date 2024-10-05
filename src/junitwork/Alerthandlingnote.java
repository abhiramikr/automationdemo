package junitwork;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerthandlingnote {
	
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("C:\\Users\\Abhirami K R\\Desktop\\demo");
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abhi");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sbh");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
		
	}
	
	

}
