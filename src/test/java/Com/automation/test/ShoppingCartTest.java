package Com.automation.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.automation.testmain.TestMain;
import com.automation.webpages.HomePage;
import com.automation.webpages.SearchPage;

public class ShoppingCartTest extends TestMain{
	
	ShoppingCartTest shoppingCart;
	
	@Before
	public void setup()
	{
		initial();
		
	}
	
	@Test
	public void addTSelectProductTest()
	{
		
		shoppingCart.addTSelectProductTest();
		//org.junit.Assert.assertArrayEquals(home, actuals);		
	}

	@After
	public void tearDown(){
		driver.quit();
	}

}