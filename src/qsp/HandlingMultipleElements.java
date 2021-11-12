package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/HTML/MultipleElements.html");
		List<WebElement> allLinksAddr = driver.findElements(By.tagName("a"));
		
		//Count the number of Links
		int noOfLinks=allLinksAddr.size();
		System.out.println("No of Links : "+noOfLinks);
		
		//Print the text of all Links
		for(int i=0; i<=allLinksAddr.size()-1; i++)
//			oneLinkAddress=allLinksAddr.get(i);
//		String text = oneLinkAddress.getTagName();
//		System.out.println(text);
			// Or
		System.out.println(allLinksAddr.get(i).getText());
		
		//Click on last Link
		allLinksAddr.get(allLinksAddr.size()-1).click();
		
		
		
		 

	}

}
