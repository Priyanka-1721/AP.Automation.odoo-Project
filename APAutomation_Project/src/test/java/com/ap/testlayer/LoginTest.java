package com.ap.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ap.pagelayer.HomePage;
import com.ap.pagelayer.LoginPage;
import com.ap.testbase.TestBase;

public class LoginTest extends TestBase{
	
@Test	
public void validate_login_functinality_with_valid_credentials () throws InterruptedException
{
	String expected_result = "https://ap-automation.odoo.com/my";
	HomePage homepage_obj = new HomePage (driver);
	LoginPage loginpage_obj = new LoginPage (driver);
	
	homepage_obj.clickOnSignInLink();
	loginpage_obj.enterEmail("ap_odoo5@gmail.com");
	loginpage_obj.enterPassword("odoo@1234");
	loginpage_obj.clickOnLoginButton();
	Thread.sleep(5000);
	
	String actual_result = driver.getCurrentUrl();
	Assert.assertEquals(actual_result, expected_result);
}

}
