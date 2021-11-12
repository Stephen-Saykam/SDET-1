package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphismInSelenium {

	public static void main(String[] args) {
		
		System.out.println("Hey User,Enter Browser: ");
		WebDriver driver = null;
		Scanner sc = new Scanner(System.in);
		String browserName = sc.next();
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		else {
			System.out.println("Dabba Fellow, Give Proper browser name");
		}
		sc.close();

	}

}
