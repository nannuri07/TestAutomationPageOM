package com.automation.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.testmain.TestMain;


public class HomePage {

	WebDriver driver;
	Select selection;
	String hard_cover_price;
	public HomePage(WebDriver driver)
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


	public void searchBook(String sel, String searchTBox)
	{
		selection = new Select(selectElement);
		selection.selectByVisibleText(sel);
		searchTextBox.sendKeys(searchTBox);
		submit.click();	
		bookname.click();
	}

}