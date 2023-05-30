package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggetion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
	List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=allsug.size();
	System.out.println(allsug); 
	System.out.println(count);
	for(int i=0;i<count;i++) {
		String text=allsug.get(i).getText();
	System.out.println(text);
	}
	allsug.get(0).click();
	driver.close();
		}
}
