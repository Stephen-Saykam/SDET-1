package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable {
	
	public static void dynamicTable(WebDriver driver, int colNum)
	{
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='t1']//tr[*]//td["+colNum+"]"));
		System.out.println(col.size());
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Handling Dynamic WebTable
		driver.get("file:///D:/HTML/Dynamic%20WebTable.html");
		dynamicTable(driver,3);
		

	}

}
