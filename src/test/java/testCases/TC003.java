package testCases;

import org.testng.annotations.Test;

import commonFun.Login;
import config.Browser;
import objectRepo.Aboutme;
import objectRepo.PatientCreate;
import patientModules.AboutMe;

public class TC003 extends Browser
{
	/*
	 * Please change the boolean value to true if you are using a new registered user to sign in
	 */
	@Test (priority=1)
	public void aboutMe() throws Exception
	{
		test= extent.createTest(" About Me ");
		Login sin= new Login();
		AboutMe mi = new AboutMe();
	  	sin.signIn(PatientCreate.newname, "123456789",false);
	  	mi.me(Aboutme.firstName, Aboutme.tMiddleName, Aboutme.tlastName, "77357");
	  	
		
	}
	
	
	
}
