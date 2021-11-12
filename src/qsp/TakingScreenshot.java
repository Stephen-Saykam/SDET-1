package qsp;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakingScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://yuvadhwaja.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Initiatives']")).click();
		Thread.sleep(2000);
		
		//Thru TypeCasting
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\HTML\\Screenshots\\Initiatives.jpg");
		Files.copy(src, dest);
		Thread.sleep(2000);
		
		List<WebElement> pics = driver.findElements(By.xpath("//img[@class='img-fluid rounded mb-4']"));
		for(int i=0; i<=pics.size()-1; i++)
		{
			Thread.sleep(2000);
			WebElement img = pics.get(i);
			File sr = img.getScreenshotAs(OutputType.FILE);
			File des = new File("D:\\\\HTML\\\\Screenshots\\\\Images"+i+".jpg");
			Files.copy(sr, des);
		}
		
		

	}

}
