package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagsOfTestNG {

	@Test(priority = 1)
	public void run() {
		// System.out.println("I am SOP Message");
		Reporter.log("Run the m/c", true);

	}

	@Test(priority = 2, enabled = true)
	public void bun() {
		Reporter.log("rockon", true);
	}

	@Test(priority = 3, invocationCount = 10)
	public void gun() {
		Reporter.log("Gun Loaded", true);
	}

}
