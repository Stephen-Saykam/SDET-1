package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTest {

	public static void main(String[] args) throws InterruptedException {
		//Set the Property
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Open the Browser
		WebDriver driver=new ChromeDriver();
		//Maximize the Browser Window
		driver.manage().window().maximize();
		//Enter the Test URL
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(10000);
		String expectedTitle = "YouTube";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title : "+actualTitle);
		//Verify Home Page is Displayed
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Home Page is Displayed, Pass");
		}
		else
		{
			System.out.println("Home Page is not Displayed, Fail");
		}
		
		Thread.sleep(2000);
		//Enter the Valid Song Name in Search TextBox
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("butta bomma song");
		Thread.sleep(2000);
		
		//Click on Search Button
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//yt-formatted-string[text()='#AlaVaikunthapurramuloo - ButtaBomma Full Video Song (4K) | Allu Arjun | Thaman S | Armaan Malik']/ancestor::div[@id='dismissible']")).click();
		
		//Play the Video in Full-Screen Mode
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		
		String exptdTitle="Skip Ads";
		String actlTitle = driver.getTitle();
		if(actlTitle.equals(exptdTitle))
		{
			System.out.println("Click on Skip Button");
		}
//		else
//		{
//			System.out.println("Wait until Add is closed");
//		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Skip Ads']")).click();
		
		
		
		
		
	}

}
