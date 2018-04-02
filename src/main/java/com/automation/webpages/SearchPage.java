package com.automation.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	
	WebDriver driver;
	Select selection;
	String hard_cover_price;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[text()='Hardcover']")
	WebElement hard_cover;
	
	@FindBy(id="add-to-cart-button")
	WebElement add_cart;
	
	@FindBy(xpath="//*[@id=\'a-autoid-6-announce\']/span[2]/span")
	WebElement hard_coverCost;

	public String addToCart()
	{
	    hard_cover.click();
	    //need to implement @cache
	    hard_cover_price = hard_coverCost.getText();
	    add_cart.click();
	    return hard_cover_price;
	}
	
}
