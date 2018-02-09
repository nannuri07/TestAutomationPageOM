package com.automation.testmain;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	
	public static WebDriver driver;
	
	
	public TestMain()
	{
	System.setProperty("webdriver.chrome.driver", "<Web driver path>");
    WebDriver driver = new ChromeDriver();

	}



public static void initial()
{
	/*try
	{*/


    driver.get("http://www.amazon.com");
    
    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    //driver.quit();
/*	}
	catch(Exception e)
	{
		e.printStackTrace();
	}*/
}
}