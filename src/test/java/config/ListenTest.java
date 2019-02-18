package config;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenTest implements ITestListener{

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
			try 
			{
				ScreenIMG.screen(result.getName());
			} catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		
	}

	public void onTestSkipped(ITestResult result) {
		try 
		{
			ScreenIMG.screen(result.getName());
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		try 
		{
			ScreenIMG.screen(result.getName());
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
