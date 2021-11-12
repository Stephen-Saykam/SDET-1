package sere;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hybrid_dataDriven_keyWordDriven.BaseTest;

public class HandlingStaleElementReferenceException extends BaseTest {

	public static void main(String[] args) throws Throwable {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		
//		WebElement untb=driver.findElement(By.id("username"));
//		driver.navigate().refresh();
//		untb.sendKeys("admin");
		
		LoginPage lp=new LoginPage();
		driver.navigate().refresh();
		//lp.getUntb().sendKeys("admin");
		lp.typeUn("admin");
		
	}

}
