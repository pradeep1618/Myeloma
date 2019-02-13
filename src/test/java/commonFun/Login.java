package commonFun;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import config.Browser;
import customAct.ActionDriver;
import objectRepo.HomePage;
import objectRepo.PatientCreate;
import objectRepo.PatientLogin;

public class Login extends Browser
{

public static boolean newu;
	/**
	 * Sign in to the application
	 * @boolean New User
	 * @param url
	 * @param userName
	 * @param password
	 * @throws Exception 
	 */
	public void signIn(String userName, String password, boolean newu) throws Exception
	{
		  
		  ActionDriver driver1 = new ActionDriver();
		  driver1.waitUntilVisibilityOfElement(PatientLogin.signLnk, 1000);
		  driver1.click(PatientLogin.signLnk);
		  driver1.type(PatientLogin.userName, userName);
		  Thread.sleep(800);
		  driver1.click(PatientLogin.password);
		  driver1.type(PatientLogin.password, password);
		  driver1.click(PatientLogin.signINbtn);
		  if(newu==true)
		  {
			   System.out.println("Logged In");
	           Thread.sleep(5000);
	           driver1.click(PatientCreate.gotit); 
		  }
		  else
		  {
			  System.out.println(driver.getTitle());
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		  }
		 
		 
	}
	

	

}
