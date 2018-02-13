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

	@FindBy(id="searchDropdownBox")
	WebElement selectElement;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchTextBox;
		
	@FindBy(className="nav-input")
	WebElement submit;
	
	@FindBy(partialLinkText="Shoe Dog")
	WebElement bookname;
	
	@FindBy(linkText="Phil Knight")
	WebElement author;
	
	@FindBy(xpath="//span[text()='Hardcover']")
	WebElement hard_cover;
	
	@FindBy(id="add-to-cart-button")
	WebElement add_cart;
	
	@FindBy(xpath="//*[@id=\'a-autoid-6-announce\']/span[2]/span")
	WebElement hard_coverCost;
	
	@FindBy(xpath="//span[text()='Cart']")
	WebElement shopping_cart;
	
	@FindBy(xpath="//*[@id='sc-subtotal-amount-activecart']/span")
	WebElement sub_total;

	public void searchBook(String sel, String searchTBox)
	{
		selection = new Select(selectElement);
		selection.selectByVisibleText(sel);
		searchTextBox.sendKeys(searchTBox);
		submit.click();	
		bookname.click();
	}

	public String addToCart()
	{
	    hard_cover.click();
	    //need to implement @cache
	    hard_cover_price = hard_coverCost.getText();
	    add_cart.click();
	    return hard_cover_price;
	}
	 	
	public String shoppingCart()
	{

        shopping_cart.click();
    	String cart_sub_total = sub_total.getText();
	   	return cart_sub_total;
	}

}
