package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///D:/HTML/multidropdown.html");
		Thread.sleep(2000);
		WebElement ddAddr = driver.findElement(By.id("SGH"));
		Select sel = new Select(ddAddr);
		if(sel.isMultiple())
		{
			System.out.println("It is a Multi-Select Dropdown");
		}
		else
		{
			System.out.println("It is a Single-Select DropDown");
		}
		sel.selectByVisibleText("DOSA");
		List<WebElement> allOptions = sel.getOptions();
//		for(int i=0; i<=allOptions.size()-1; i++)
//		{
//			System.out.println(allOptions.get(i).getText());
//		}
		
//		for(int i=0; i<=allOptions.size()-1; i++)
//		{
//			sel.selectByIndex(i);
//			Thread.sleep(1000);
//		}
		
		
		//Thread.sleep(3000);
		//sel.deselectByVisibleText("DOSA");
		//sel.deselectByValue("dosa");
		//sel.deselectByIndex(2);
		//sel.deselectAll();
		
		
		for(int i=1; i<=4; i++)
		{
			sel.selectByIndex(i);
		}
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println(sel.getAllSelectedOptions().size());
		System.out.println(sel.getWrappedElement().getText());

	}

}
