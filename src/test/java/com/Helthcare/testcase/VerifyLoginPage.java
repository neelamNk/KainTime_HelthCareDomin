package com.Helthcare.testcase;

import org.testng.annotations.Test;

import com.Helthcare.Page.AssertPage;
import com.Helthcare.base.Base;

public class VerifyLoginPage extends Base {
 public static 	AssertPage AP;
	
@Test(priority = 1)
	public void   AssertionClass() {
		
	AP = new AssertPage(driver);
	
	AP.VerifyCompanyRequestpage();
	
AP.RePage();

	}
}
