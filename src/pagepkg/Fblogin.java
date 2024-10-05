package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fblogin {
	
	WebDriver driver;
	
	By fbemail=By.id("email");
	By fbpwd=By.id("pass");
	By fbbutton=By.name("login");


public Fblogin(WebDriver driver)
{
	this.driver=driver;
}

public void setvalues(String email,String pswd)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpwd).sendKeys(pswd);
}


public void loginclick() 
{
	driver.findElement(fbbutton);
}
}
