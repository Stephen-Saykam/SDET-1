package methodDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import hybrid_dataDriven_keyWordDriven.FileLib;
import hybrid_dataDriven_keyWordDriven.IAutoConsts;

public class BaseTest implements IAutoConsts {
	
	public static WebDriver driver;
	
	public void openBrowser() throws Throwable
	{
		FileLib flib = new FileLib();
		String browserValue = flib.readPropertyData(PROP_PATH, "browser");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
			
		}
		
		else
		{
			System.out.println("Enter Proper Browser Name");
			
		}
		
		driver.manage().window().maximize();
		String appUrl = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appUrl);
		
		
/*		WebDriverCommonLib wlib=new WebDriverCommonLib();
		FileLib flib1=new FileLib();
		wlib.verify(flib1.readPropertyData(PROP_PATH, "loginTitle"), wlib.getpageTitle(), "Login Page");*/
			
	}
	public void closeBrowser()
	{
		driver.quit();
	}

}
