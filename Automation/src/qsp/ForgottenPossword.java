package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottenPossword {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://facebook.com/");
			String color=driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");			
	System.out.println(color);
	driver.close();
		}
}
