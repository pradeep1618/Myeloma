package testCases;

import org.testng.annotations.Test;
import commonFun.Login;
import config.Browser;


/**
 * Login to the application as Agency
 * @author pradeep.kumar
 * Please change the boolean value to true if you are using a new registered user to sign in
 */

public class TC001 extends Browser
{
	
  @Test	
  public void Loginto() throws Exception 
  {
	 
	test= extent.createTest(" Login ");
	Login sin= new Login();
  	sin.signIn("Cassandra", "123456789", false);
    	

}
}

