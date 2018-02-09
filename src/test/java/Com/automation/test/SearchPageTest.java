package Com.automation.test;

import org.junit.Test;

import com.automation.testmain.TestMain;
import com.automation.webpages.SearchPage;

public class SearchPageTest extends TestMain{
	
	SearchPage searchPage;
	
	/*@Before
	public void setup()
	{
		initial();
		
	}*/
	
	@Test
	public void SelectProductTest2()
	{
		
		searchPage.SearchPageForProduct();
		//asset the test
		//org.junit.Assert.assertArrayEquals(source, taget);		
	}



}