
package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	public CartPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//========================== obj repo ===========================================
	
	@FindBy(xpath="//i[@class='fa fa-plus position-relative z-index-1']")
	private WebElement plus_symbol_button;
	
	@FindBy(xpath="//button[contains(text(),'Pay with Demo')]")
	private WebElement pay_with_demo_button;
	
	@FindBy(xpath="//button[@name='o_payment_submit_button']")
	private WebElement pay_button;
	
	@FindBy(xpath="//a[@name='website_sale_main_button']")
	private WebElement checkout_button;
	
//========================== action method =======================================	
	public void clickOnPlusSymbolButton ()
	{
		plus_symbol_button.click();
	}
	public void clickOnPayWithDemoButton ()
	{
		pay_with_demo_button.click();
	}
	public void clickOnPayButton ()
	{
		pay_button.click();
	}
	public void clickOnCheckoutButton ()
	{
		checkout_button.click();
	}
	
	
}
