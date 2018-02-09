package com.automation.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.testmain.TestMain;

public class ProductPage extends TestMain{


    @FindBy(xpath="//span[text()='Hardcover']")
	WebElement bookType;

    @FindBy(linkText="add-to-cart-button")
	WebElement add_to_bttun;
    
	public ProductPage(){
		PageFactory.initElements(driver, this);
	}
	public ShoppingCart SearchPageForProduct(){

	    	bookType.click();
		
		    
		
		return new ShoppingCart();
	}
}

