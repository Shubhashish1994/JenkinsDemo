package com.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.Baseclass;
import com.main.HomePage;
import com.main.RegisterPage;
@Listeners(ListernerClass.class)
public class RegisterPageTest extends Baseclass{

HomePage home;
RegisterPage reg;


		public RegisterPageTest(){
		super();
	}
	
	@BeforeTest
	public void init(){
		invokebrowser();
		home=new HomePage();
		reg=new RegisterPage();
		
	}
	
	@Test(priority=0)
	public void verifytitle(){
		
		String actual=reg.verifytitle();
		Assert.assertEquals(actual,"Welcome: Mercury Tours");
	}
	
	
	@Test(priority=1)
	public void register() throws IOException{
		System.out.println("Before Register");
		reg.register();
		Reporter.log("Step 1 is passed");
	}
	
	@AfterTest
	public void close(){
		//driver.close();
	}
}

	

