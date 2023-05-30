package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuntheticationPopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
Thread.sleep(3000);
String CU = driver.getCurrentUrl();
System.out.println(CU);
driver.close();
	}
}
