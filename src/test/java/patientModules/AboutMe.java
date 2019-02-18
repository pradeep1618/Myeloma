package patientModules;

import config.Browser;
import customAct.ActionDriver;
import objectRepo.Aboutme;

public class AboutMe extends Browser
{
	public void me(String firstName) throws InterruptedException 
	{
		ActionDriver driver1 = new ActionDriver();
		driver1.waitUntilVisibilityOfElement(Aboutme.afirstName, 500);
		driver1.type(Aboutme.afirstName, firstName);
		
	}

}
