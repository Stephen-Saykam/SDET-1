package methodDrivenFramework;

public class ValidLoginTest {

	public static void main(String[] args) throws Throwable {
		// Open Browser, enter URL & Verify LoginPage
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		LoginPage lp= new LoginPage();
	
		
		//Enter Valid UserName in UserName TextBox

		lp.setUntb("admin");
		
		//Enter Valid Password in Password TextBox
		lp.setPwtb("manager");
		
		
		//Click on Login Button
		lp.clickLoginBtn();
		
		//Verify Home Page
	//	lp.login("admin", "manager");

	}

}

    