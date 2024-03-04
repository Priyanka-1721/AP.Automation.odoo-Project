package com.ap.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ap.pagelayer.AccountDetailsPage;
import com.ap.pagelayer.AccountPage;
import com.ap.pagelayer.HomePage;
import com.ap.pagelayer.LoginPage;
import com.ap.testbase.TestBase;

public class AddressTest extends TestBase {
	@Test
	public void addNewAddress() throws InterruptedException
	{
		HomePage homepage_obj = new HomePage (driver);
		LoginPage loginpage_obj = new LoginPage (driver);
		AccountPage accountpage_obj = new AccountPage (driver);
		AccountDetailsPage acdetailspage_obj = new AccountDetailsPage (driver);
		
		homepage_obj.clickOnSignInLink();
		loginpage_obj.enterEmail("ap_odoo5@gmail.com");
		loginpage_obj.enterPassword("odoo@1234");
		loginpage_obj.clickOnLoginButton();
		
		accountpage_obj.clickOnAddressLink();
		acdetailspage_obj.fillAllAddressDetails("John", "ap_odoo4@gmail.com", "Odoo Company", "0123456789", "Canal Road", "Surat", "123456", "India", "Gujarat");
		Thread.sleep(2000);
		acdetailspage_obj.clickOnSaveButton();
	
		Assert.assertEquals(accountpage_obj.getTextFromPage(), "Odoo Company");
	}

}
