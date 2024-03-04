package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//================ object repository ================
	
	@FindBy(xpath="//a[contains(text(),\"Don't have an account?\")]")   //to navigate sign up page
	private WebElement dont_have_an_account_link;
	@FindBy(xpath="//input[@id='login']")
	private WebElement email_textbox;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	private WebElement login_button;
	
	//================ action methods ====================
	public void clickOnDontHaveAnAccountLink ()
	{
		dont_have_an_account_link.click();
	}
	public void enterEmail(String email)
	{
		email_textbox.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		password_textbox.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		login_button.click();
	}
	

}
