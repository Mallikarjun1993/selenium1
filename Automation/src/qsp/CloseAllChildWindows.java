package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllChildWindows {

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
		String pwh = driver.getWindowHandle();
		Set<String> alwh = driver.getWindowHandles();
		for(String wh:alwh) {
			if(wh.equals(alwh)) {
			}
			else {
				driver.close();

				}
			}	
	}
}
