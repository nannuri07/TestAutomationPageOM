package com.automation.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.testmain.TestMain;

public class ShoppingCart extends TestMain{
	

    @FindBy(xpath="//span[text()='Cart']")
	WebElement to_cart;

    
	public ShoppingCart(){
		PageFactory.initElements(driver, this);
	}
	public ProductPage addProductToShoppingCart(){

	     to_cart.click();
		 return new ProductPage();
	}
}

