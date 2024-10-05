package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Createfbpage {
	
	WebDriver driver;
	
	By fbcreatepage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By signinbutton=By.xpath("//*[@id=\"facebook\"]/body");
 
	
	
	public Createfbpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void createpageclick()
	{
		driver.findElement(fbcreatepage).click();
	}
	public void verification()
	{
		String src=driver.getPageSource();
		if(src.contains("Create a Page"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
	}
	public void clicksignin()
	{
		driver.findElement(signinbutton).click();
	}

}
