package com.Helthcare.base;


import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
public static  WebDriver driver;
	public static Properties		prop = new Properties();
	public static Properties		loc = new Properties();
	public static FileReader fR;
	public static FileReader fLocter;

	@BeforeTest
	public void setupBwoser() throws IOException {
		if(driver==null) {
		System.out.println("this project path"+System.getProperty("user.dir"));
			FileReader fr =new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\config.properties");
			prop.load(fr);
			FileReader LC =new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config\\Loceter.properties");
			loc.load(LC);
			
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			FirefoxOptions  opstion = new FirefoxOptions();
			opstion.addArguments("--remote-allow-origins=*");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		System.out.println("WebsiteTitle: " + driver.getTitle());
		System.out.println("Application currect URl: " + driver.getCurrentUrl());
	}

	@AfterTest
	public void teardwon() {
		 driver.quit();
		 System.out.println("tear dwon succesfull ");
	}
}