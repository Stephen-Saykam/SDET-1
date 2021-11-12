package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InspectionMethodsWithLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//		driver.get("file:///D:/HTML/link.html");
		//on the webpage find the element whose tagname is 'a'
//	    WebElement linkAddress=driver.findElement(By.tagName("a"));
	    //on the address perform click button
//	    linkAddress.click();
	    //on the webpage find the element whose id is 'i1' and click on address
//	    driver.findElement(By.id("i1")).click();
//		driver.findElement(By.name("n1")).click();
//		driver.findElement(By.className("c1")).click();
//		driver.findElement(By.linkText("Facebook")).click();
//		driver.findElement(By.partialLinkText("Fa")).click();
//		driver.findElement(By.cssSelector("a[title='t1']")).click();
		driver.get("https://www.google.com/");
    	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("dulquer salmaan");
    	
	    
	    

	}

}
