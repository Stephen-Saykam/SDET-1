package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ActiTIMELoginTest {

	public static void main(String[] args) throws InterruptedException {
		//Set the Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Open the Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the Browser Window
		driver.manage().window().maximize();
		//Enter the Test URL
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(2000);
		//Verify the Login is page is Displayed
		String expectedTitle="actiTIME - Login";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		System.out.println("Push  chesthunna");
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login Page is displayed, Pass");
		}
		else
		{
			System.out.println("Login Page is not Displayed, Fail");
		}
		
		Thread.sleep(2000);
		//Enter Valid Username in Username TextBox
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Thread.sleep(2000);
		//Enter the Password in Password TextBox
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		//Click on Login Button
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(2000);
		//Verify the Home Page is Displayed
		String expectedHomeTitle ="actiTIME - Enter Time-Track";
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
