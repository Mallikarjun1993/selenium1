package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAlignment {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/");
		int x1 = driver.findElement(By.id("inProgressText")).getLocation().getX();
			int y1 = driver.findElement(By.id("inProgressText")).getLocation().getY();
			System.out.println(x1);
			System.out.println(y1);
driver.close();
		}
}
