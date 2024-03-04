package com.ap.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ap.utility.CommonMethods;

public class shopPage {

	public shopPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//=============object repository ====================================
	@FindBy(xpath = "(//a[@class='dropdown-toggle btn btn-light'])[2]")
	private WebElement sort_by_button;
	
	@FindBy(xpath = "//span[contains(text(),'Newest Arrivals')]")
	private WebElement newest_button;

	@FindBy(xpath = "//label[@class='btn btn-light  o_wsale_apply_list']")
	private WebElement list_symbol_button;
	
	@FindBy(xpath = "//label[@class='btn btn-light active o_wsale_apply_grid']")
	private WebElement grid_symbol_button;
	
	@FindBy(xpath="//a[contains(text(),'HP Laptop 15s, 12th Gen Intel')]")
	private WebElement hp_laptop_link;
	
	@FindBy(xpath="//a[@id='add_to_cart']")
	private WebElement add_to_cart_button;
//============== action method ==========================================	
	public void clickOnSortBy()
	{
		sort_by_button.click();
	}
	public void clickOnoption()
	{
		newest_button.click();
	}
	public void clickOnListSymbolButton()
	{
		list_symbol_button.click();
	}
	public void clickOnGridSymbolButton()
	{
		CommonMethods.explicitWaitForElement(grid_symbol_button).click();
	}
	public void clickOnHPLaptopLink()
	{
		hp_laptop_link.click();
	}
	public void clickOnAddToCartButton()
	{
		add_to_cart_button.click();
	}
}
