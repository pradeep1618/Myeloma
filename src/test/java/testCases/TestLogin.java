package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe"); 
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.get("https://dev.healthtree.org");
			driver.findElement(By.xpath("//a[@class='primary sign_in']")).click();
			driver.findElement(By.xpath("//input[@id='username']")).click();
			driver.findElement(By.xpath("//input[@id='username']")).clear();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Cassandra");
			Thread.sleep(800);
			driver.findElement(By.xpath("//input[@id='password']")).clear();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
			driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
		    Thread.sleep(1000);
		    System.out.println(driver.getTitle());
		    
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 
	}

}
