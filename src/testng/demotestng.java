package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demotestng {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Beforetest");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("Beforemethod");
	}
	
	
	@Test(priority=3,dependsOnMethods= {"test2"}, groups = {"smoke"})
	public void test1()
	{
		System.out.println("teat 1");
	}
	
	@Test(priority=4,invocationCount=3,groups= {"sanity", "smoke"})
	public void test2()
	{
		System.out.println("test 2");
	}
	
	@Test(priority=1, groups= {"regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	
	@Test(priority=2,groups= {"smoke","regression"})
	public void test4()
	{
		System.out.println("test 4");
	}
	
	
	@AfterMethod
	public void after()
	{
		System.out.println("Aftermethod");
	}
	@AfterTest
	public void aftest()
	{
		System.out.println("After test");
	}

}
