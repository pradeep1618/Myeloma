package config;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Ext {
	
	
	public static ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeTest
	public void reports()
	{
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/HTMLRepors.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		
		extent.setSystemInfo("Operating Syatem", "Windows 10");
		extent.setSystemInfo("Environment", "Staging Server");
		
		htmlreporter.config().setReportName("LifeShareCare Application Test Results");
		htmlreporter.config().setTheme(Theme.DARK);
	}
	
	@AfterMethod
		public void getResult(ITestResult result )
	{
		if (result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test Case Failed Gue To ", ExtentColor.RED));
			test.pass(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case Pass", ExtentColor.GREEN));
			test.pass(result.getThrowable());
		}
		
		
		else
		{
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+ " Test case Skipped Due To ", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
	}
	
@AfterTest
public void teardown()
{
	extent.flush();
	
}

}
