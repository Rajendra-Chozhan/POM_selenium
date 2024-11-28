package testcases_package;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import baseclass_package.Baseclass_Fab;

public class HardAssert extends Baseclass_Fab {

	
		
		@Test
	    public void loginTest() {
					
			
			driver.navigate().to("https://www.browserstack.com/");
			String ActualTitle = driver.getTitle();
			String verifyAssertNull=null;
			String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
			Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
			Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
			assertEquals(ExpectedTitle, ActualTitle);
			assertNotEquals(ExpectedTitle, "browserstack");
			assertTrue(verifyTitleIsPresent);
			assertFalse(verifyTitleIsChanged);
			assertNotNull(verifyTitleIsPresent);
			assertNull(verifyAssertNull);
			}

}
