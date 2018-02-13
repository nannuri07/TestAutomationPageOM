package com.automation.testmain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestMain {

    static WebDriver driver;
    
 	public static WebDriver startBrowser(String browserName, String url)
	
	{
	    
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			 System.out.println("ChromeDriver");
			 // set browser property
			 System.setProperty("webdriver.chrome.driver", "<chrome driver path>");
             driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
             driver = new InternetExplorerDriver();
		}
		else
		{
			System.out.println("unable to find browser:");
		}
		
		driver.get(url);
		return driver;
	}
}
