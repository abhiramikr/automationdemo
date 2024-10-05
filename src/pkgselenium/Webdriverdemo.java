package pkgselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverdemo {

	public static void main(String[] args) {
		
		
		///chromedriver
		ChromeDriver driver=new ChromeDriver();//open browser
		driver.get("https://www.google.com");///open google
		 
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.close();

	}

}
