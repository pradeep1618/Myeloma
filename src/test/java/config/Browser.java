package config;


import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
 
		public static WebDriver driver;

		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static ExtentTest test;
		
		@BeforeSuite
		public void repos(){
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Records/HealthTreeTestReport.html");
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("HealthTree", "Staging Server");
			extent.setSystemInfo("Host Name", "Pradeep K Reddy");
			
			htmlReporter.config().setDocumentTitle("HealthTree Test Result");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTheme(Theme.DARK);
			
		}
		
		@AfterMethod
		public void result(ITestResult resul)
		{
			if(resul.getStatus() == ITestResult.FAILURE)
			{
				test.fail(MarkupHelper.createLabel(resul.getName()+ " Test Case Is Failed", ExtentColor.RED));
				test.fail(resul.getThrowable());
				test.log(Status.INFO, "Test Case Failed");
				test.info(MarkupHelper.createLabel("***FAIL***", ExtentColor.RED));
			}
			else if (resul.getStatus()==ITestResult.SUCCESS)
			{
				test.pass(MarkupHelper.createLabel(resul.getName()+" Test Case Is Pass ", ExtentColor.GREEN));
				test.log(Status.INFO, "Test Case Passed");
				test.info(MarkupHelper.createLabel("***PASS***", ExtentColor.GREEN));
				
			}
			else if(resul.getStatus()==ITestResult.SKIP)
			{
				test.skip(MarkupHelper.createLabel(resul.getName()+ " Test Case Skip ", ExtentColor.ORANGE));
				test.skip(resul.getThrowable());
				test.log(Status.INFO, "Test Case Skip");
				test.info(MarkupHelper.createLabel("***SKIP***", ExtentColor.BLUE));
			}
			
			
			
		}
		
  @BeforeClass
  public void beforeClass() 
  {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/Drivers/chromedriver.exe"); 
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://dev.healthtree.org");
	  
  }
  
  @AfterClass
  public void quite() throws Exception
  {
	  extent.flush();
	  driver.quit();
  }

  

}
