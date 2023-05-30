package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrames {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.id("name")).sendKeys("PMk");
driver.switchTo().frame("frm1");
WebElement list = driver.findElement(By.id("course"));
Select s=new Select(list);
s.selectByVisibleText("Java");
driver.switchTo().defaultContent();
driver.findElement(By.id("name")).clear();
driver.findElement(By.id("name")).sendKeys("kalki");

	}

}
