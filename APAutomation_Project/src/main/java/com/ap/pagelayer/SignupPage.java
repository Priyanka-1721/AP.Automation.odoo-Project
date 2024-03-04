package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//=============object repository ====================================
	@FindBy(xpath="//input[@id='login']")
	private WebElement email_textbox;
	@FindBy(xpath="//input[@id='name']")
	private WebElement your_name_textbox;
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	@FindBy(xpath="//input[@id='confirm_password']")
	private WebElement confirm_password_textbox;
	@FindBy(xpath="//button[contains(text(),' Sign up')]")
	private WebElement signup_button;	
//============== action method ==========================================	
	public void enterEmail (String email)
	{
		email_textbox.sendKeys(email);
	}
	public void enterName (String name)
	{
		your_name_textbox.sendKeys(name);
	}
	public void enterPassword (String password)
	{
		password_textbox.sendKeys(password);
	}
	public void enterConfirmPassword (String confirm_password)
	{
		confirm_password_textbox.sendKeys(confirm_password);
	}
	public void clickOnSignupButton()
	{
		signup_button.click();
	}
	
	
}
