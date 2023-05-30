package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VarifyTheUrl {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://www.seleniumhq.org/");
String Exceptedurl=("https://www.selenium.dev/");
String ActualUrl=driver.getCurrentUrl();
if (Exceptedurl.equals(ActualUrl))
{
	System.out.println("pass");
}
else
	System.out.println("fail");
driver.close();
	}
}