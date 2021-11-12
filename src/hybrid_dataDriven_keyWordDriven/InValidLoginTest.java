package hybrid_dataDriven_keyWordDriven;

import org.openqa.selenium.By;

public class InValidLoginTest extends BaseTest {

	public static void main(String[] args) throws Throwable {
		 BaseTest bt = new BaseTest();
		 bt.openBrowser();
		 
		 FileLib flib = new FileLib();
		 int rc = flib.getRowCount(EXCEL_PATH, "Invalid");
		 for(int i=1; i<=rc; i++)
		 {
			 String un = flib.readExcelData(EXCEL_PATH, "Invalid", i, 0);
			 String pw = flib.readExcelData(EXCEL_PATH, "Invalid", i, 1);
			 
			 driver.findElement(By.id("username")).sendKeys(un);
			 driver.findElement(By.name("pwd")).sendKeys(pw);
			 driver.findElement(By.xpath("//div[text()='Login ']")).click();
			 Thread.sleep(6000);
			 
			 
			 
		 }
		 

	}

}
