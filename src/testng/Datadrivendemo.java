package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivendemo {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void datadriven() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Abhirami K R\\Desktop\\RAMETTAN\\username.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row =sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String un=sh.getRow(i).getCell(0).getStringCellValue();
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(un+"---"+pswd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(un);
			driver.findElement(By.name("pass")).sendKeys(pswd);
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

}
