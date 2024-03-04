package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.utility.CommonMethods;

public class AccountDetailsPage {
	public AccountDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//=============object repository ====================================
	@FindBy(xpath = "//input[@name='name']")
	private WebElement name_txtbox;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath = "//input[@name='company_name']")
	private WebElement company_txtbox;
	
	@FindBy(xpath = "//input[@name='vat']")
	private WebElement GST_txtbox;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone_txtbox;
	
	@FindBy(xpath = "//input[@name='street']")
	private WebElement street_txtbox;
	
	@FindBy(xpath = "//input[@name='city']")
	private WebElement city_txtbox;
	
	@FindBy(xpath = "//input[@name='zipcode']")
	private WebElement zipcode_txtbox;
	
	@FindBy(xpath = "//select[@name='country_id']")
	private WebElement country_dropdown;
	
	@FindBy(xpath = "//select[@name='state_id']")
	private WebElement State_dropdown;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement save_btn;
//============== action method ==========================================	
	
	public void fillAllAddressDetails(String name,String email,String company_name,String phone_number,String street_add,String city,String zipcode,String country,String state)
	{
		name_txtbox.clear(); //optional if we need to previous data and enter new data
		name_txtbox.sendKeys(name);
		
		email_txtbox.clear();
		email_txtbox.sendKeys(email);
		
		company_txtbox.clear();
		company_txtbox.sendKeys(company_name);
		
		GST_txtbox.clear();
		GST_txtbox.sendKeys("12AAAAA1234AAZA");
		
		phone_txtbox.clear();
		phone_txtbox.sendKeys(phone_number);
		
		street_txtbox.clear();
		street_txtbox.sendKeys(street_add);
		
		city_txtbox.clear();
		city_txtbox.sendKeys(city);
		
		zipcode_txtbox.clear();
		zipcode_txtbox.sendKeys(zipcode);
		
		com.ap.utility.CommonMethods.selectDropdownMethod(country_dropdown, country);
		com.ap.utility.CommonMethods.selectDropdownMethod(State_dropdown, state);
	}
	
	public void clickOnSaveButton()
	{
		save_btn.click();
	}
	
	
}
