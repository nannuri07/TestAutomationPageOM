package Com.automation.test;

import org.junit.Before;
import org.junit.Test;

import com.automation.testmain.TestMain;
import com.automation.webpages.HomePage;

public class HomePageTest extends TestMain{
	
	HomePage homePage;
	
	@Before
	public void setup()
	{
		initial();
		
	}
	
	@Test 
	public void homePageSeachTest1()
	{
		
		homePage.HomePageSearch();
		//org.junit.Assert.assertArrayEquals(home, actuals);		
	}

}


