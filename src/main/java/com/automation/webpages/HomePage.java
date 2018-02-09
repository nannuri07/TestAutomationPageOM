package com.automation.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.testmain.TestMain;


public class HomePage extends TestMain {

		@FindBy(id="searchDropdownBox")
	        WebElement dropBoxText;
		
		Select oSelect = new Select(driver.findElement(By.id("searchDropdownBox")));
		 
		
		
		@FindBy(id="twotabsearchtextbox")
		WebElement searchTextBox;
		    	

		@FindBy(className="nav-input")
		WebElement submitInput;

		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		public SearchPage HomePageSearch(){

			oSelect.selectByVisibleText("Books");
			dropBoxText.sendKeys("Books");
			searchTextBox.sendKeys("Nike");
			submitInput.click();
			    
			
			return new SearchPage();
		}
}