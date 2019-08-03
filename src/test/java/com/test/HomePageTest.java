package com.test;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.base.Baseclass;
import com.main.HomePage;
//import com.main.Mercury;
import com.main.RegisterPage;
@Listeners(ListernerClass.class)
public class HomePageTest extends Baseclass {
	
	HomePage home;
	RegisterPage reg;
	
	public HomePageTest(){
		super();
	}
	
	@BeforeTest
	public void init(){
		invokebrowser();
		home=new HomePage();
		
	}
	@Test(priority=0)
	
	
	public void verifytitle(){
		
		String actual=home.verifytitle();
		Assert.assertEquals(actual,"Welcome: Mercury Tours");
	}
	
	
	
	
	@Test(priority=1)
	public void clickonregister(){
		System.out.println("Before clicking");
		reg=home.click();
	}
	
	
	
	@AfterTest
	public void close(){
		driver.close();
	}
}
