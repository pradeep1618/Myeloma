package commonFun;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.Browser;

public class Logout extends Browser

{
	public void logout() 
	{
		WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.or(
	    ExpectedConditions.visibilityOfElementLocated
	    (By.xpath("//button[@class='btn blue_btn text-center hvr-bounce-to-top logout-btn']"))));
		driver.findElement(By.xpath("//div[@id='root']//following::a[contains(.,'Logout')]")).click();
	}
}
