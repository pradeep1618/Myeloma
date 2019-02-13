package config;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenIMG extends Browser{
	
	public static String screen(String ScreenShotName) throws IOException
	{
		TakesScreenshot sn = (TakesScreenshot)driver;
		File source = sn.getScreenshotAs(OutputType.FILE);
		String destin = System.getProperty("user.dir") + "/ScreenShots/" + ScreenShotName +".png";
		File destination = new File (destin);
		FileUtils.copyFile(source, destination);
		return destin;
	}
}
