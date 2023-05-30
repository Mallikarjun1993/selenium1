package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		int x1=driver.findElement(By.id("username")).getLocation().getX();
		int x2=driver.findElement(By.name("pwd")).getLocation().getX();
if(x1==x2) {
	System.out.println("Username and password textbox are properly aligned and pass");
}else
{
	System.out.println("Username and password textbox are not properly aligned and pass");
}
System.out.println(x1);
System.out.println(x2);
	}

}
