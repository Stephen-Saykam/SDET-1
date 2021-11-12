package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		//Set the Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		//Open the Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the Browser Window
		driver.manage().window().maximize();
		//Enter the Test URL
		driver.get("https://www.facebook.com/");
		//Verify the Login Page is Displayed
/*		String expectedTitle ="Facebook – log in or sign up";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login page is Displayed,Pass");
		}
		else
		{
			System.out.println("Login Page is not Displayed,Fail");
		}
		*/
		Thread.sleep(3000);
		//Enter the Valid Username in Username TextBox
		driver.findElement(By.id("email")).sendKeys("9626539123");
		Thread.sleep(3000);
		//Enter valid Password in password TextBox
		driver.findElement(By.name("pass")).sendKeys("smileplease");
		Thread.sleep(3000);
		//Click on Login Button
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		//driver.findElement(By.xpath("//div[@class='_6ltg']")).click();
		
		//Verify Home Page is Displayed
		String expectedHomeTitle = "Facebook – log in or sign up";
		String actualHomeTitle = driver.getTitle();
		System.out.println("Actual Home Title : "+actualHomeTitle);
		if(actualHomeTitle.equals(expectedHomeTitle))
		{
			System.out.println("Home Page is Displayed, Pass");
		}
		else
		{
			System.out.println("Home Page is not Displayed, Fail");
		}
		
		
		

	}

}
