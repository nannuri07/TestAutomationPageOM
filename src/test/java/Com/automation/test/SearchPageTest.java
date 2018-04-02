package Com.automation.test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.testmain.TestMain;
import com.automation.webpages.ProductPage;
import com.automation.webpages.SearchPage;
import com.automation.webpages.HomePage;

public class SearchPageTest extends TestMain {
	WebDriver driver;
	String hard_cover_price_expected;
	
	@BeforeClass
	public void setUp()
	{
		//BrowserHome will return webDriver
		//1. Launch Chrome
		//2. Navigate to www.amazon.com
	    System.out.println("Launch Browser");
	    driver = TestMain.startBrowser("Chrome", "http://www.amazon.com");
        driver.manage().window().maximize();
		//Creating object using pageFactory
	    //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) 
	}
	@Test(priority=1)
	public  void searchBookTest()
	{
		HomePage hp =  PageFactory.initElements(driver, HomePage.class);
		System.out.println("pagefactory initializing the objects");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
		//3. Select “Books” under search dropdown
		//4. Search for “Nike”
		hp.searchBook("Books", "Nike");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	}

	@Test(priority=2)
	public  void addToCartTest()
	{	
		//5. Find and select the book titled “Shoe Dog” by author “Phil Knight” 
		//6. In the product page, note the price of Hardcover edition
		//7. Add the hardcover version to shopping cart
		SearchPage sp = PageFactory.initElements(driver, SearchPage.class);
		hard_cover_price_expected = sp.addToCart();
	    //8. Navigate to shopping cart
	}
	
	@Test(priority=3)
	public void shoppingCartTest()
	{
        ProductPage pp = PageFactory.initElements(driver, ProductPage.class);
		String shopping_cart_price = pp.shoppingCart();
		//9. Assert that the Subtotal amount matches the hardcover price from the product page	
	    Assert.assertEquals(hard_cover_price_expected, shopping_cart_price, "Unable to match the price");
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	
	}
}
