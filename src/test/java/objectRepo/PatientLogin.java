package objectRepo;

import org.openqa.selenium.By;

public class PatientLogin 
{
	public static By signLnk = By.xpath("//a[@class='primary sign_in']");
	
	public static By userName = By.xpath("//input[@id='username']");
	
	public static By password = By.xpath("//input[@id='password']");
	
	public static By signINbtn	=By.xpath("//button[@type='submit']");
	
	public static By userPic = By.xpath("//div[@class='user-pic']");
	
		
	public static By sigouts = By.xpath("//button[contains(.,'Logout')]");
	
}
