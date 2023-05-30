package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/gurus/OneDrive/Desktop/Disabled.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("d1")).sendKeys("admin");
	Thread.sleep(2000);
	JavascriptExecutor j= (JavascriptExecutor) driver;
	j.executeScript("document.getElementById(\"d2\").value=\"manager\"");
	Thread.sleep(2000);
	driver.findElement(By.id("d3")).click();
	Thread.sleep(2000);
	driver.close();
	
}
}
