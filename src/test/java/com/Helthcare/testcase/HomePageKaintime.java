package com.Helthcare.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.Helthcare.Page.HomePage;
import com.Helthcare.base.Base;

import Utils.ReadExcelSheetData;

public class HomePageKaintime extends Base {
	
	public static HomePage hp;
	
	@Test(priority = 1)
	public void ClikingRequestDemo() {
	System.out.println("All the Loceter are  working Fine");
		hp = new HomePage(driver);
		hp.ClikingRequestDemo();
	}
	
@Test(priority = 2 ,dataProviderClass = ReadExcelSheetData.class,dataProvider = "Exceltestdata")
	//@Test(priority = 2 ,dataProvider =    "testdata")
	public void RequestDemo(String firstname, String lastname ) throws InterruptedException {
		
		hp.iframefrom();
		Thread.sleep(1000);
		hp.FName(firstname);


		hp.LName(lastname);

		hp.MobileNumber();

		hp.City();

		hp.WorkEmploree("Docter");

		hp.AgencyN("NA");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");

		hp.AverageDailycansus();

		Thread.sleep(1000);
		hp.CheckboxTypes();

		hp.ClientEmilId();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-550)", "");
		Assert.assertTrue(false);
		

	}
	@Test(priority = 3)
	public void SumbitButton() {
		// hp.Sumbitfrom();
	}
	/*
	@DataProvider(name ="testdata")
	public Object [ ] [ ] tdata(){
		return  new  Object [] []
		{
		{"Nick",""},
			{"","a" },
			{"Neelam" ,"Kushwaha"}
		
		}	;
		
}
*/
	
}

