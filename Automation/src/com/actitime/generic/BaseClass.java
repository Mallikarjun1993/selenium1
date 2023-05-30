package com.actitime.generic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	static{
	System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	public WebDriver driver;
	@BeforeClass(groups= {"smoketest"})
	public void OpenBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}
	@AfterClass(groups= {"smoketest"})
	public void CloseBrowser() {
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
	@AfterMethod(groups= {"smoketest"})
	public void Logout() {
		Reporter.log("Logout", true);
		driver.findElement(By.id("logoutLink")).click();
	}
	@BeforeMethod(groups= {"smoketest"})
	public void Login() {
		Reporter.log("Login",true);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	}	
}
