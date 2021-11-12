package hybrid_dataDriven_keyWordDriven;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib
{	
	public String getpageTitle()
	{
		String pageTitle = BaseTest.driver.getTitle();
		return pageTitle;
	}
	
	public void waitForTitle(String title)
	{
		 WebDriverWait wait=new WebDriverWait(BaseTest.driver, 50);
		 wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public void verify(String expected, String actual, String page)
	{
		if(actual.equals(expected))
		{
			System.out.println(page+"is displayed, Pass");
		}
		else
		{
			System.out.println(page+"is not displayed, Fail");
		}
	}	
}
