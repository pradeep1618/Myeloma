package commonFun;

import java.awt.AWTException;
import config.Browser;
import customAct.ActionDriver;
import objectRepo.PatientCreate;
import objectRepo.PatientLogin;

public class CreateAccount extends Browser
{
	public static boolean mobile;
	public static boolean confirmMob;
	/**
	 * Sign in to the application
	 * @param url
	 * @param userName
	 * @param password
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	
	public void signUp (boolean mobile, boolean confirmOTP, String password, String conPassword,
			String emailDomain) throws InterruptedException, AWTException 
	{
		  ActionDriver driver1 = new ActionDriver();
		  driver1.waitUntilVisibilityOfElement(PatientCreate.createAccount, 1500);
		  driver1.click(PatientCreate.createAccount);
		  driver1.waitUntilVisibilityOfElement(PatientCreate.new_user_name, 500);
		  driver1.type(PatientCreate.new_user_name, PatientCreate.newname);
		  driver1.type(PatientCreate.new_email, PatientCreate.emailname);
		  if(mobile==true) 
		  {
			  driver1.type(PatientCreate.new_mobile, PatientCreate.mobiNo);
			
		  }
		  System.out.println(PatientCreate.emailname);
		  driver1.type(PatientCreate.password, password);
		  driver1.type(PatientCreate.confirmPassword, conPassword);
		  driver1.click(PatientCreate.createAccountBtn);
		  if(confirmMob==true) 
		  {
			  driver1.click(PatientCreate.textMess);
			  Thread.sleep(5000);
			  driver1.click(PatientCreate.confOtp);
		  }
		  else
		  {
			  driver1.click(PatientCreate.mailThro);
			  driver1.click(PatientCreate.continueaft);
			  
		  }
	   		
		   		driver.get(emailDomain);
	            driver1.type(PatientCreate.mailAccount, PatientCreate.newname);
	            System.out.println(PatientCreate.newname);
	            driver1.click(PatientCreate.checkinBox);
	            driver.switchTo().frame("ifmail");
	            driver1.click(PatientCreate.confirmLnk);
	            
	            for(String winHandle : driver.getWindowHandles())
	            {
	                driver.switchTo().window(winHandle);
	            }
	           driver.navigate().refresh();
	           driver1.waitUntilVisibilityOfElement(PatientLogin.userName, 1000);
	           driver1.type(PatientLogin.userName, PatientCreate.newname);
	           driver1.click(PatientLogin.password);
	           driver1.type(PatientLogin.password, password);
	           driver1.click(PatientLogin.signINbtn); 
	           System.out.println("Logged In");
	           Thread.sleep(5000);
	           driver1.click(PatientCreate.gotit); 
	          
	  
	}
	
	

}
