package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	public void run()
	{
		System.out.println("I am SOP Message");
		Reporter.log("I am report Message");
		
	}
	
	

}
