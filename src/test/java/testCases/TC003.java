package testCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import commonFun.Login;
import config.Browser;
import objectRepo.PatientCreate;

public class TC003 extends Browser
{
	/*
	 * Please change the boolean value to true if you are using a new registered user to sign in
	 */
	@Test (priority=1)
	public void aboutMe() throws InterruptedException, AWTException
	{
		test= extent.createTest(" About Me ");
		Login sin= new Login();
	  	sin.signIn(PatientCreate.newname, "123456789",false);
	  	
		
	}
	
	
	
}
