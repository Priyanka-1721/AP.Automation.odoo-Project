package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.utility.CommonMethods;

public class HomePage {
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//=============object repository ====================================
	@FindBy(xpath = "(//a[text()='Sign in'])[1]")
	private WebElement signin_link;

	@FindBy(xpath = "(//*[text()='Shop'])[1]")
	private WebElement shop_link;
	
	@FindBy(xpath="//span[contains(text(),'My Cart')]")
	private WebElement my_cart_link;
//============== action method ==========================================	
	public void clickOnSignInLink()
	{
		signin_link.click();
	}
	public void clickOnShopLink()
	{
		shop_link.click();
	}
	public void clickMyCartLink()
	{
		CommonMethods.explicitWaitForElement(my_cart_link).click();
	}
}
