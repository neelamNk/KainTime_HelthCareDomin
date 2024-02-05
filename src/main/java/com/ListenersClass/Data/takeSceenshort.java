package com.ListenersClass.Data;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Helthcare.base.Base;

public class takeSceenshort  extends Base {
	
public void GetScreenshort() throws IOException {
		/*
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		System.out.println("Screenshot is captured");
		*/
		Date d = new Date();
		String ScreenshortFileName = d.toString().replace(":", "_").replace(" ", "");
		try {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File(".//SceenshortData//" +ScreenshortFileName+".png"));
		}
			 catch (Exception e) {
           e.getMessage();
		}
		
}
}
