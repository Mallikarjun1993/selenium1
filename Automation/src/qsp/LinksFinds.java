package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksFinds {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amozon.in/");
	List<WebElement> alllinks= driver.findElements(By.xpath("//a"));
		int count=alllinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text =alllinks.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}
}
