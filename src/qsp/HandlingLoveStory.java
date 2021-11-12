package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandlingLoveStory {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Not Now']")).click();
		driver.findElement(By.xpath("//img[@alt='HYD']")).click();
		WebElement mv = driver.findElement(By.xpath("//span[@id=\"4\"]"));
		mv.click();
		Thread.sleep(2000);
		//mv.sendKeys("Love Story (Telugu)");
		driver.findElement(By.xpath("//input[@class='sc-bqjOQT bEsook']")).sendKeys("Love Story");
		Thread.sleep(2000);
//		Robot r=new Robot();
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@class='sc-gleUXh dbWdWs']//strong[text()='Love Story']/ancestor::span[text()=' (Telugu)']")).click();
		Thread.sleep(2000);
		
		//Capturing director Photo
		
		WebElement writer = driver.findElement(By.xpath("//h5[text()='Sekhar Kammula']/ancestor::a[@class='styles__CircularItemLink-sc-17p4id8-0 ggVMyG']/descendant::img[@class='style__Image-sc-eykeme-1 dWIxSp']"));
		Thread.sleep(10000);
		//TakesScreenshot t = (TakesScreenshot)driver;
		File src = writer.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File des = new File("D:\\HTML\\ScreenShot\\picture.jpg");
		Files.copy(src, des);
		Thread.sleep(2000);
		
		// Print the reviews Text
		
		driver.findElement(By.xpath("//span[text()='31.7K reviews']")).click();
		Thread.sleep(3000);
		List<WebElement> txt = driver.findElements(By.xpath("//div[@class='style__ReviewWrapper-sc-r6zm4d-1 hFVfWf']"));
		System.out.println("No of links :"+txt.size());
		Thread.sleep(2000);
		for(int i=0; i<=txt.size()-1; i++)
		{
			System.out.println(txt.get(i).getText());
			System.out.println(" ");
		}
		
		Thread.sleep(2000);
		
		// Watch the First Trailer
		
		driver.navigate().to("https://in.bookmyshow.com/hyderabad/movies/love-story/ET00124288/user-reviews");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='styles__SVGFrame-sc-xta4k3-0 bxWgHp']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='style__Image-sc-eykeme-1 dWIxSp']/ancestor::div[@id='WZUH2QTB-yw']")).click();
		
		
		
		
		
		
		

	}

}
