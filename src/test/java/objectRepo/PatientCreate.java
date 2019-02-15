package objectRepo;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class PatientCreate {
	
	public static String uuid = RandomStringUtils.randomAlphabetic(8); 
	public static String uint = RandomStringUtils.randomNumeric(3);
	public static String uid= RandomStringUtils.randomNumeric(10);
	public static String upin = RandomStringUtils.randomNumeric(7);	
	
	
	public static String newname = "test"+uuid+"";
	public static String mobiNo ="512"+upin+"";
	public static String emailname = "test"+uuid+"@yopmail.com";
	
	public static By createAccount = By.xpath("//a[contains(.,'Create an Account')]");
	public static By new_user_name = By.xpath("//input[@id='caUsername']");
	public static By new_email = By.xpath("//input[@id='caEmail']");
	public static By new_mobile=By.xpath("//input[@type='tel']");
	public static By password=By.xpath("//input[@id='caPassword']");
	public static By confirmPassword=By.xpath("//input[@id='caConfirmPassword']");
	public static By createAccountBtn = By.xpath("//button[contains(.,'Create Account')]");
	public static By gotit = By.xpath("//div[@class='modal-footer']/child::button");
	public static By mailThro = By.xpath("//div[@class='left-icon2']/child::span[contains(.,'Email')]");
	public static By textMess = By.xpath("//div[@class='left-icon2']/child::span[contains(.,'Text Message')]");
	
	public static By otp = By.xpath("//input[@id='caPassword']");
	public static By confOtp=By.xpath("//button[contains(.,'Submit')]");
	
	
	public static By welcMSG = By.xpath("//div[@class='modal-footer']");
	
	public static By mailAccount = By.xpath("//input[@id='login']");
	public static By checkinBox = By.xpath("//input[@type='submit']");
	public static By latestEmail = By.xpath("//div[@id='e1']/following::span[contains(.,'HealthTree')][1]");
	public static By emailSubj = By.xpath("//div[@id='mailhaut']/div[1]");
	public static By confirmLnk = By.xpath("//p/child::a");
	
	public static By emailVeri = By.xpath("//div[@class='left-icon1']//following::div[contains(.,'Email')]");
	public static By message = By.xpath("//div[@class='left-icon2']//following::span[contains(.,'Text Message')]");
	
	public static By continueaft = By.xpath("//button[contains(.,'Continue')]");
	
	
	
	
	
	
	
	
}
 	