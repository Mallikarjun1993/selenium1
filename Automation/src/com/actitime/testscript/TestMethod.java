package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMethod {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	@Test
	public void validLogin(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.SetLogin("admin", "manager");
		
	}
	

}
