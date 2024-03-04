package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.utility.CommonMethods;


public class PaymentMethodPage 
{
		public PaymentMethodPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
//=============object repository ====================================
		
		@FindBy(xpath = "//input[@id='customer_input']")
		private WebElement payment_details_txtbox;
		
		@FindBy(xpath = "//select[@id='simulated_payment_state']")
		private WebElement payment_status_dropdown;
		
		@FindBy(xpath = "//button[contains(text(),'Save')]")
		private WebElement save_button ;
		
		
//============= action methods ====================================	
		public void enterPaymentDetails(String testdata)
		{
			payment_details_txtbox.sendKeys(testdata);
		}
		public void selectPaymentStatusDropdown(String paymentstatus)
		{
			com.ap.utility.CommonMethods.selectDropdownMethod(payment_status_dropdown, paymentstatus);
		}
		public void clickOnSaveButton()
		{
			CommonMethods.explicitWaitForElement(save_button).click();
		}
}