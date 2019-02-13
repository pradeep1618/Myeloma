package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import commonFun.CreateAccount;
import commonFun.Logout;
import config.Browser;

public class TC002 extends Browser
{
	/**
	 * Create patient account in HTR Myeloma
	 * @author pradeep.kumar
	 * @throws InterruptedException 
	 * @throws AWTException 
	 *
	 */
	@Test
	public void create() throws InterruptedException, AWTException {
		test= extent.createTest(" Create Account ");
		Logout out = new Logout();
		CreateAccount create = new CreateAccount();
		create.signUp(true, false, "987654321", "987654321", "http://www.yopmail.com");
		out.logout();
		
		
	}
	
}
