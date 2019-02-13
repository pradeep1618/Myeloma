package patientModules;

import config.Browser;
import customAct.ActionDriver;
import objectRepo.Aboutme;

public class AboutMe extends Browser
{
	/**
	 * Filling About Me page data
	 * @param firstName
	 * @param midName
	 * @throws InterruptedException
	 */
	public void me(String firstName, String midName, String lasName, String zip) throws InterruptedException 
	{
		ActionDriver driver1 = new ActionDriver();
		driver1.waitUntilVisibilityOfElement(Aboutme.afirstName, 500);
		driver1.type(Aboutme.afirstName, firstName);
		System.out.println(firstName);
		driver1.type(Aboutme.amiddleName, midName);
		System.out.println(midName);
		driver1.type(Aboutme.aLastName, lasName);
		System.out.println(lasName);
		driver1.type(Aboutme.zip, zip);
		System.out.println(zip);	
		
	}

}
