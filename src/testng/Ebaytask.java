package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebaytask {
	String baseurl="https://www.ebay.com/";
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
	 driver=new ChromeDriver();
	 driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
		WebElement smartphone=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics).perform();
		//smartphone.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a"))).click();
	}
	

}
