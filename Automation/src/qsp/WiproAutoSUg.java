package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WiproAutoSUg {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		Thread.sleep(2000);
	List<WebElement> allsug = driver.findElements(By.xpath("//span[contains(text(),'wipro')]"));
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
