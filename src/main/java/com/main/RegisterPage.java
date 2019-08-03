package com.main;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class RegisterPage extends Baseclass {

	@FindBy(xpath ="//*[@name='firstName']")
	WebElement firstname;
	
	@FindBy(xpath ="//*[@name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath ="//*[@name='phone']")
	WebElement phone;
	
	@FindBy(xpath ="//*[@name='address1']")
	WebElement address1;
	
	@FindBy(xpath ="//*[@name='city']")
	WebElement city;
	
	@FindBy(xpath ="//*[@name='state']")
	WebElement state;
	
	@FindBy(xpath ="//*[@name='country']")
	WebElement country;
	
	
	@FindBy(xpath ="//*[@id='email']")
	WebElement username;
	

	@FindBy(xpath ="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath ="//*[@name='confirmPassword']")
	WebElement confirmPassword;
	
	
	public  RegisterPage(){
		PageFactory.initElements(driver, this);
	}

public String verifytitle(){
		
		return driver.getTitle();
	}
	
	
	public void register() throws IOException{
		
		System.out.println("start reading excel file ");		
		ExcelReader reader= new ExcelReader();
	
		reader.readExcel();
		System.out.println("after reading excel");
		
		
	}
	
	
}
