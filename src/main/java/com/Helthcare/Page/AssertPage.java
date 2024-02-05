package com.Helthcare.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class AssertPage  {
	public static  WebDriver driver;
	@FindBy(xpath = "//*[@id=\"post-35\"]/div/div/div/div[1]/div/div[1]/div[1]/div/h1/b/text()[1]")
	private WebElement Pagedata;
	@FindBy(xpath = "//*[@id=\"post-35\"]/div/div/div/div[1]/div/div[1]/div[2]/div/h2")
	private WebElement EMR ;
	
	
	public AssertPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyCompanyRequestpage() {
		Assert.assertTrue(Pagedata.isDisplayed());
		
	}
	public void  RePage() {
		Assert.assertTrue(EMR.isDisplayed());
	}
}
