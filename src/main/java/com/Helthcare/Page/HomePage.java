package com.Helthcare.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class HomePage    {
public static  WebDriver driver;
//ClikingRequestDemo
	@FindBy(xpath = "//a[text()='Request Demo']")
	private WebElement RDemo;
	@FindBy(id = "hs-form-iframe-0")
	private WebElement iframe;
	@FindBy(name = "firstname")
	private WebElement Fname;
	@FindBy(name = "lastname")
	private WebElement Lname;
	@FindBy(name = "phone")
	private WebElement mobileNumber;
	@FindBy(xpath = "//div//select[@name='state_region___drop_down']")
	private WebElement region;
	@FindBy(name = "jobtitle")
	private WebElement job;
	@FindBy(name = "company")
	private WebElement Agencyname;
	@FindBy(xpath = "//select[@name=\"average_daily_census__adc_\"]")
	private WebElement ADC;
	@FindBy(xpath  = "//label//input[@id=\"0-2/line_of_business__c0-a54e6f0f-1f0b-426a-a776-3edcaecb7fc4\"]")
	private WebElement LineofBusiness;
	@FindBy(name = "email")
	private WebElement EmailId;
	@FindBy(xpath = "//input[@class=\\\"hs-button primary large\\\"]")
	private WebElement LoginBtn;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public void ClikingRequestDemo() {
		RDemo.click();
	}
	// PersonalizedFrom

	public void iframefrom() {
		driver.switchTo().frame(iframe);

	}

	public void FName( String firstname) {
		Fname.sendKeys(firstname);
		
		
	}

	public void LName(String lastname) {
		Lname.sendKeys(lastname);
	}

	public void MobileNumber() {
		
		mobileNumber.sendKeys("8296574063");
	
	}

	public void City() {
		// Handling the dropdwon_ Manu data by Select method in selenuim
		Select select = new Select(region);
		select.selectByVisibleText("New York");
		region.click();
	}

	public void WorkEmploree(String Docter) {
		job.sendKeys(Docter);
	}

	public void AgencyN(String NA) {
		Agencyname.sendKeys(NA);
	}

	public void AverageDailycansus() {
		Select select1 = new Select(ADC);
		select1.selectByVisibleText("1-100");
		ADC.click();
	}

	public void CheckboxTypes() {
		// // Handling the checkbox "Line(s) of Business"
		LineofBusiness.click();
	}

	public void ClientEmilId() {
	
		EmailId.sendKeys("neelamkw24@gmail.com");
	}

	public void Sumbitfrom() {
		LoginBtn.click();
	}
	
	
}
