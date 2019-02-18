package objectRepo;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class Aboutme 
{
	public static String firstName = RandomStringUtils.randomAlphabetic(8); 
	public static String middleName = RandomStringUtils.randomNumeric(8);
	public static String lastName = RandomStringUtils.randomAlphabetic(8); 
	public static String mobileNUm= RandomStringUtils.randomNumeric(10);
	public static String upin = RandomStringUtils.randomNumeric(7);	
	
	
	public static By companylogo = By.xpath("//a[@class='logo']");
	public static By afirstName= By.xpath("//input[@id='about_first']");
	public static String tFirstName = ""+firstName+"";
	public static By amiddleName = By.xpath("//input[@id='about_middle']");
	public static String tMiddleName = ""+middleName+"";
	public static By aLastName = By.xpath("//input[@id='Last']");
	
	public static By gender = By.xpath("//div/child;;input[@id='gender']");
	
	public static By zip = By.xpath("//input[@id='zip-code']");
	
	
	
	
	
	
	
	

}
