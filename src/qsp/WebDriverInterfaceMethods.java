package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverInterfaceMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		String pageUrl = driver.getCurrentUrl();
//		System.out.println(pageUrl);
		
//		String srcCode = driver.getPageSource();
//		System.out.println(srcCode);
		
		String title = driver.getTitle();
//		System.out.println(title);
/*		if(title.equals("Google"))
		{
			System.out.println("Google page is displayed, PASS");
		}
		else
		{
			System.out.println("Google page is not displayed, FAIL");
		}
*/
/*		
		String pageUrl = driver.getCurrentUrl();
		if(pageUrl.equals("https://www.monsterindia.com/"))
		{
			System.out.println("Monster India is Displayed, PASS");
		}
		else
		{
			System.out.println("Monster India is not Displayed, FAIL");
		}
*/
/*		
		String srcCode = driver.getPageSource();
		if(srcCode.contains("Gmail"))
		{
			System.out.println("Gmail is present on Google, PASS");
		}
		else
		{
			System.out.println("Gmail is not Present on Google, FAIL");
		}
*/

//		driver.manage().window().maximize();
/*		
		Thread.sleep(3000);
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		Point p = new Point(500,400);
		driver.manage().window().setPosition(p);
*/
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
