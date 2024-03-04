package com.ap.testlayer;

import org.testng.annotations.Test;

import com.ap.pagelayer.AccountPage;
import com.ap.pagelayer.HomePage;
import com.ap.pagelayer.LoginPage;
import com.ap.pagelayer.PaymentMethodPage;
import com.ap.testbase.TestBase;

public class PaymentMethodTest extends TestBase {
    @Test
	public void validate_payment_method_with_valid_details () throws InterruptedException
	{
    	HomePage homepage_obj = new HomePage (driver);
    	LoginPage loginpage_obj = new LoginPage (driver);
    	AccountPage accountpage_obj = new AccountPage (driver);
		PaymentMethodPage paymentmethod_obj = new PaymentMethodPage (driver);
    	
    	homepage_obj.clickOnSignInLink();
    	
    	loginpage_obj.enterEmail("ap_odoo5@gmail.com");
    	loginpage_obj.enterPassword("odoo@1234");
    	loginpage_obj.clickOnLoginButton();
    	
    	accountpage_obj.clickOnPaymentMethodLink();
    	
    	paymentmethod_obj.enterPaymentDetails("0202 0206 0304 1234");
    	Thread.sleep(5000);
    	paymentmethod_obj.selectPaymentStatusDropdown("Successful");
    	Thread.sleep(5000);
    	paymentmethod_obj.clickOnSaveButton();
    	
	}
}
