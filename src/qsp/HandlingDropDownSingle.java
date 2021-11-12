package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownSingle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///D:/HTML/singledropdown.html");
		Thread.sleep(2000);
		WebElement ddAddr = driver.findElement(By.id("novotel"));
		Select sel = new Select(ddAddr);
		//sel.selectByVisibleText("SAMOSA");
		//sel.selectByValue("idli");
		sel.selectByIndex(8);
		ddAddr.click();
		
		//We will not deselect in SIngle HandlingDropDown
		//The Go for Multi Select Handling DropDown for De-Selection Option
//		sel.selectByVisibleText("DOSA");
//		sel.deselectByVisibleText("DOSA");
		if(sel.isMultiple())
		{
			System.out.println("It is a Multi-Select DropDown");
		}
		else
		{
			System.out.println("It is a Single-Select DropDown");
		}
		
		 
		

	}

}
