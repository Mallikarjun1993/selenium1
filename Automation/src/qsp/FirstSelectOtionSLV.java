package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectOtionSLV {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/gurus/OneDrive/Desktop/SLV.html");
WebElement Slv=driver.findElement(By.id("SLV"));
Select s=new Select(Slv);
String text= s.getFirstSelectedOption().getText();
System.out.println(text);
driver.close();
}}
