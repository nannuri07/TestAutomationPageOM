package com.automation.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.testmain.TestMain;

public class ProductPage extends TestMain{

	WebDriver driver;
	Select selection;
	String hard_cover_price;
	public ProductPage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath="//span[text()='Cart']")
	WebElement shopping_cart;
	
	@FindBy(xpath="//*[@id='sc-subtotal-amount-activecart']/span")
	WebElement sub_total;

	public String shoppingCart()
	{

        shopping_cart.click();
    	String cart_sub_total = sub_total.getText();
	   	return cart_sub_total;
}
}

