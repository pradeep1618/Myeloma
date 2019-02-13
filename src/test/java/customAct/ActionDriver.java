package customAct;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import config.Browser;

public class ActionDriver {
	
	WebDriver driver;
	
	
	public ActionDriver()
	{
		driver=Browser.driver;
	}
	
	
	/**
	 * Used to launch the application
	 * @param url  --Application URL
	 * Example -- http://52.27.143.120:8000
	 */
	public void launchApplication(String url)
	{
		driver.get(url);
		
	}
	
	
	/**
	 * Used to click on the element
	 * @param locator
	 */
	public void click (By locator)
	{
		driver.findElement(locator).click();
	}

	/**
	 * Used to type text in the text box after clearing
	 * @param locator
	 * @param text
	 * @throws InterruptedException 
	 */
	public void type(By locator, String text) throws InterruptedException
	{
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}
	
	
	/**
	 * Used to move mouse to an element
	 * @param locator
	 */
	public void mouseover(By locator)
	{
		Actions a = new Actions(driver);
		WebElement mouse =  driver.findElement(locator);
		a.moveToElement(mouse).build().perform();
	}
	
/*	*//**
	 * Used to select values in drop down
	 * @param locator
	 *//*
	public void dropdown(By locator)
	{
		WebElement element = driver.findElement(locator);
		Select sel = new Select(element);
		
	}*/
	
	/**
	 * uses to select element by value
	 * @param element -- element
	 * @param value --value which we want to select
	 */
	public void selectbyValue(By element, String value){
		WebElement ele = driver.findElement(element);
		Select select = new Select(ele);
		select.selectByVisibleText(value);
	}
	
	/**
	 * Used when we want to wait until the wanted element is visible
	 * @param locator
	 * @param time
	 */
	public void waitUntilVisibilityOfElement(By locator, int time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.or(
		    ExpectedConditions.visibilityOfElementLocated(locator)
		    
		));
	}
	
	
	public void waitUntilElementIsPresent(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(locator));	
		
	}
	
	/**
	 * Generates 8 character length text
	 * @param text - what type of character do you want 
	 * Examp 1 -- abc for alphabets
	 * Examp 2 --123 for numbers
	 */
	public void randomChar(String text){
		String alphabet = text;
		String s = RandomStringUtils.random(8, alphabet);
	}
	
	/**
	 * Generates 10 digit random numbers 
	 * @param intr -- enter only INTIGERS
	 * Examp -- 123
	 */
	public void randomNum(String intr){
		String alphabet = intr;
		String s = RandomStringUtils.random(10, alphabet);
	}
	
	/**
	 * Waits until the pageloads
	 */
	 public void waitForLoad(WebDriver driver) {
	        ExpectedCondition<Boolean> pageLoadCondition = new
	                ExpectedCondition<Boolean>() {
	                    public Boolean apply(WebDriver driver) {
	                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("Complete");
	                    }
	                };
	        WebDriverWait wait = new WebDriverWait(driver, 30);
	        wait.until(pageLoadCondition);
	    }
	}
	
	
	

