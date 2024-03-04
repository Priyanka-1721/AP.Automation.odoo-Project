package com.ap.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ap.pagelayer.CartPage;
import com.ap.pagelayer.CheckoutPage;
import com.ap.pagelayer.HomePage;
import com.ap.pagelayer.LoginPage;
import com.ap.pagelayer.shopPage;
import com.ap.testbase.TestBase;

public class ProductTest extends TestBase{
    @Test
	public void validate_sequence_of_byuing_product () throws InterruptedException
	{
    	String expected_result = "https://ap-automation.odoo.com/payment/status";
    	
    	HomePage homepage_obj = new HomePage (driver);
    	LoginPage loginpage_obj = new LoginPage (driver);
    	shopPage shoppage_obj = new shopPage (driver);
    	CartPage cartpage_obj = new CartPage(driver);
    	CheckoutPage checkoutpage_obj = new CheckoutPage (driver);
    	
    	homepage_obj.clickOnSignInLink();
    	
    	logger.info("-----Landed on signin page-----");
    	
    	loginpage_obj.enterEmail("ap_odoo5@gmail.com");
    	loginpage_obj.enterPassword("odoo@1234");
    	loginpage_obj.clickOnLoginButton();
    	
    	logger.info("-----Logged in successfully-----");
    	
    	homepage_obj.clickOnShopLink();
    	Thread.sleep(5000);
    	
    	shoppage_obj.clickOnSortBy();
    	shoppage_obj.clickOnoption();
    	
    	shoppage_obj.clickOnListSymbolButton();
    	//Thread.sleep(5000);
    	//shoppage_obj.clickOnGridSymbolButton();
    	
    	shoppage_obj.clickOnHPLaptopLink();
    	shoppage_obj.clickOnAddToCartButton();
    	Thread.sleep(5000);
    	
    	logger.info("-----Product added to the cart-----");
    	
    	homepage_obj.clickMyCartLink();
    	
    	cartpage_obj.clickOnPlusSymbolButton();
    	
    	cartpage_obj.clickOnCheckoutButton();
    	
    	checkoutpage_obj.fillExtraInfo("David", "Very good","D:\\Testing\\google drive link for recoreded video.docx");
    	checkoutpage_obj.clickOnCheckoutButton();
    	checkoutpage_obj.clickOnPayButton();
    	Thread.sleep(10000);
    	
    	logger.info("-----Order placed-----");
    	
    	String actual_result = driver.getCurrentUrl();
    	System.out.println(actual_result);
    	Assert.assertEquals(actual_result, expected_result);
	//	Assert.assertEquals(driver.getTitle(), "Payment Status | testing");
    	
	}
}
