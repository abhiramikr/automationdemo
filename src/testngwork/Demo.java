package testngwork;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("Berforetest");
	}
	@BeforeMethod
	public void urlloding()
	{
		System.out.println("BEfore method");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	@Test
	public void test5()
	{
		System.out.println("test5");
	}
	@AfterMethod
	public void aftmethod()
	{
		System.out.println("After method");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("Aftertest");
	}





}
