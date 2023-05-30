package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchContextException;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			try {
			driver.get("https://demo.actitime.com/login.do");
			System.out.println("Page loaded within the 1 Seconds");
	}
catch(Exception e){
	System.out.println("Page didnt load within the 1 seconds");
}}
}
