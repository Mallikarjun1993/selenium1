package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyLogo {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
			public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean Logo=driver.findElement(By.xpath("//img[@all='facebook']")).isDisplayed();
		if (Logo) {
			System.out.println("Logo is displayed");}
			else {
				System.out.println("Logo is not displayed");
		}}
}
