package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//=================== obj repo ============================================
	@FindBy(xpath="//input[@id='sale1']")
	private WebElement reference_textbox;
	
	@FindBy(xpath="//textarea[@id='sale2']")
	private WebElement feedback_textbox;
	
	@FindBy(xpath="//input[@id='sale3']")
	private WebElement document_upload_btn;
	
	@FindBy(xpath="//a[@name='website_sale_main_button']")
	private WebElement continue_checkout_button;
	
	@FindBy(xpath="//button[contains(text(),'Pay now')]")
	private WebElement pay_button;
//=================== action methods ======================================
	//CommonMethods
	public void fillExtraInfo (String ref, String feedback, String path)
	{
		reference_textbox.sendKeys(ref);
		feedback_textbox.sendKeys(feedback);
		document_upload_btn.sendKeys(path);
	}
	public void clickOnCheckoutButton ()
	{
		continue_checkout_button.click();
	}
	public void clickOnPayButton()
	{
		pay_button.click();
	}
}
