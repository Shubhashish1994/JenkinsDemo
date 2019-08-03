package com.main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Baseclass;

public class HomePage extends Baseclass{

	
	@FindBy(xpath="//*[text()='REGISTER']")
	WebElement register;
	
	
	public  HomePage(){
		PageFactory.initElements(driver, this);
	}
	
  public String verifytitle(){
		
		return driver.getTitle();
	}
	
	
	public RegisterPage click(){
		
		register.click();
		
		return new  RegisterPage();
		
	}
	
}
