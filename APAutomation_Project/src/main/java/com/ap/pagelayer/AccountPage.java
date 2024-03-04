package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public AccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//----------- Obj repo --------------	
	@FindBy(xpath = "//a[@title='Addresses']")
	private WebElement add_address_link;
	
	@FindBy(xpath = "//p[@class='mb-0 text-muted']")
	private WebElement company_text;
	
	@FindBy(xpath="//span[contains(text(),'Payment methods')]")
	private WebElement payment_method_link;
	
//--------- action methods -------------

	public void clickOnAddressLink()
	{
		add_address_link.click();
	}
	public String getTextFromPage()
	{
		return company_text.getText();
	}
	public void clickOnPaymentMethodLink()
	{
		payment_method_link.click();
	}
}
