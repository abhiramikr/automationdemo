package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Fbpage {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpswrd;
	
	@FindBy(name="login")
	WebElement button;
	
	public Fbpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void setvalues(String email, String pswrd)
	{
		fbemail.sendKeys(email);
		fbpswrd.sendKeys(pswrd);
	}
	public void loginclick()
	{
		button.click();
	}

}
