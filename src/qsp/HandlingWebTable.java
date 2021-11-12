package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/HTML/WebTable%201.html");
		List<WebElement> alltrs = driver.findElements(By.tagName("tr"));
		System.out.println("Total rows on WebPage :"+alltrs.size());
		
		WebElement table2 = driver.findElement(By.id("t2"));
		List<WebElement> table2Rows = table2.findElements(By.tagName("tr"));
		System.out.println("Table 2 rows :"+table2Rows.size());
		

	}

}
