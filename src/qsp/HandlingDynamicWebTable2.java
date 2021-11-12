package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable2 {
	
	public static void dynamicTable(WebDriver driver, int colNum)
	{
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='taskRowsTable']//tr[*]//td["+colNum+"]//div[@class='title']"));
		for(int i=0; i<=col.size()-1; i++)
		{
			System.out.println(col.get(i).getText());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		////table[@class='taskRowsTable']//tr[*]//td[2]//div[@class='title']
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		//clicking on tasks Option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		Thread.sleep(2000);
		
		//Handling Dynamic WebTable
		
		dynamicTable(driver,2);
		
		
		

	}

}
