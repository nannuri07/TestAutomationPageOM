package Com.automation.test;

import org.junit.Before;
import org.junit.Test;

import com.automation.testmain.TestMain;
import com.automation.webpages.HomePage;
import com.automation.webpages.ProductPage;
import com.automation.webpages.SearchPage;

public class ProductPageTest extends TestMain{
	
	ProductPage productPage;
	
	/*@Before
	public void setup()
	{
		initial();
		
	}*/
	
	@Test
	public void addToCartPoductTest3()
	{
		
		productPage.SearchPageForProduct();
		//Need to assert the test
		//org.junit.Assert.assertArrayEquals(sourc, target);		
	}

}