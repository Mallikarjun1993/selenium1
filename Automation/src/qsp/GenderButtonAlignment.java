package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderButtonAlignment {

		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://facebook.com");
			Thread.sleep(3000);
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(1000);
int x1 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]")).getLocation().getY();		
Thread.sleep(1000);
int x2 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[2]")).getLocation().getY();		
Thread.sleep(1000);
int x3 = driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).getLocation().getY();		
System.out.println(x1);
System.out.println(x2);
System.out.println(x3);
if((x1==x2)&&(x2==x3))
{
System.out.println("radio button is properly alligned");
}
else
System.out.println("radio button is properly not alligned");
driver.close();
		}
}
