package com.ap.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ap.pagelayer.HomePage;
import com.ap.pagelayer.LoginPage;
import com.ap.pagelayer.SignupPage;
import com.ap.testbase.TestBase;

public class SignupTest extends TestBase{
	@Test
	public void validate_signup_into_application_valid_details () throws InterruptedException
	{
String expected_result = "https://ap-automation.odoo.com/my";
		
		HomePage homepage_obj = new HomePage (driver);
		LoginPage loginpage_obj = new LoginPage (driver);
		SignupPage signuppage_obj = new SignupPage (driver);
		
		homepage_obj.clickOnSignInLink();
		loginpage_obj.clickOnDontHaveAnAccountLink();
		signuppage_obj.enterEmail("ap_odoo5@gmail.com");
		signuppage_obj.enterName("John");
		signuppage_obj.enterPassword("odoo@1234");
		signuppage_obj.enterConfirmPassword("odoo@1234");
		signuppage_obj.clickOnSignupButton();
		Thread.sleep(5000);
		
		String actual_result = driver.getCurrentUrl();
		Assert.assertEquals(actual_result, expected_result);	
	}

}
