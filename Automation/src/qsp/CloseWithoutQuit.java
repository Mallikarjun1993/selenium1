package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseWithoutQuit {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("login-google-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("apple-signin-button")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("login-facebook-button")).click();
		Thread.sleep(3000);

		Set<String> GetTl = driver.getWindowHandles();
		Thread.sleep(3000);

		for( String wh:GetTl) {
		driver.switchTo().window(wh);
		Thread.sleep(3000);

		driver.close();
		Thread.sleep(3000);

		}
		}
	}
