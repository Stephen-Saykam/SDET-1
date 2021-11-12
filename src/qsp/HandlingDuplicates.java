package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDuplicates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///D:/HTML/multidropdown.html");
		WebElement ddAddr = driver.findElement(By.id("SGH"));
		Select sel = new Select(ddAddr);
//		List<WebElement> allOptions = sel.getOptions();
//		
//		for(int i=0; i<=allOptions.size()-1; i++)
//		{
//			String text = allOptions.get(i).getText();
//			System.out.println(text);
//		}
		
		
		
		
//		List<WebElement> allOptions = sel.getOptions();
//		HashSet<String> allText = new HashSet<>();
//		
//		for(int i=0; i<=allOptions.size()-1; i++)
//		{
//			String text = allOptions.get(i).getText();
//			allText.add(text);
//		}
//		for(String oneText:allText)
//		{
//			System.out.println(oneText);
//		}
		
		
		
		
//		List<WebElement> allOptions = sel.getOptions();
//		LinkedHashSet<String> allText = new LinkedHashSet<>();
//		
//		for(int i=0; i<=allOptions.size()-1; i++)
//		{
//			String text = allOptions.get(i).getText();
//			allText.add(text);
//		}
//		for(String oneText:allText)
//		{
//			System.out.println(oneText);
//		}
		
		
		
		
		List<WebElement> allOptions = sel.getOptions();
		TreeSet<String> allText = new TreeSet<>();
		for(int i=0; i<=allOptions.size()-1; i++)
		{
			String text = allOptions.get(i).getText();
			allText.add(text);
		}
		for(String oneText:allText)
		{
			System.out.println(oneText);
		}
		
		

	}

}
