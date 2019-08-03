package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Baseclass {

	public static WebDriver driver;
	
	public static void main(String[] args){ 
	
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    System.out.println("Web Driver initilization has started...");
	        

		driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
     	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
     	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("http://newtours.demoaut.com");
        }
	
			
}
