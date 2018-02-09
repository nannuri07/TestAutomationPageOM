package com.automation.testmain;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMain {
	
	public static WebDriver driver;
	
	
	public TestMain()
	{
	System.setProperty("webdriver.chrome.driver", "<Web driver path>");
    driver = new ChromeDriver();

	}

public static void initial()
{

    driver.get("http://www.amazon.com");
   // Need to expand the code

}
}