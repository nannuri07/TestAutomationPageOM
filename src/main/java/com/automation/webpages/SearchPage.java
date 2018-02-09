package com.automation.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.testmain.TestMain;

public class SearchPage extends TestMain{
	
	// 4.Find and select the book titled “Shoe Dog” by author “Phil Knight” (need to match by both title and author)
    @FindBy(partialLinkText="Shoe Dog")
	WebElement bookTittle;

    @FindBy(linkText="Phil Knight")
	WebElement authorName;
  
   
	public SearchPage(){
		PageFactory.initElements(driver, this);
	}
	public ProductPage SearchPageForProduct(){

	    	bookTittle.click();
		
		    
		
		return new ProductPage();
	}
}