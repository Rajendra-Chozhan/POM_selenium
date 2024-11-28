package testcases_package;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import baseclass_package.Baseclass_Fab;
import pageobject_package.Foodpage_Fab;
import pageobject_package.Homepage_Fab;

public class TestCase003_Food_Honey extends Baseclass_Fab{

	
	@Test
    public void food_honey() throws IOException, InterruptedException {
	
	 BasicConfigurator.configure();
		driver.get(BaseURL);
			
		System.out.println("Page title is : " + driver.getTitle());
		
		driver.manage().window().maximize();

		Homepage_Fab hp = new Homepage_Fab(driver);
		Thread.sleep(3000);
		captureScreen(driver,"Tescase003_Honey");
		hp.clicklogin();
		Thread.sleep(3000);
		
		hp.enteremail(Email);
		Thread.sleep(3000);
		captureScreen(driver,"Tescase003_Honey");
		
		hp.enterpassword(Password);
		Thread.sleep(3000);
		
		
		
		hp.clicksignin(); 		
	    Thread.sleep(3000);
	    
		captureScreen(driver,"Tescase003_Honey");
	    hp.food();
	    Thread.sleep(3000);
	    
	    Foodpage_Fab fp = new Foodpage_Fab(driver);
	    String parentwindowhandle = driver.getWindowHandle();
	    
	   fp.clicksweeterners();
	    Thread.sleep(3000);
    
		captureScreen(driver,"Tescase003_Honey");
	   fp.clickhoney();
	   Thread.sleep(3000);
	   
	   for(String ChildTab : driver.getWindowHandles()) {
       	
       	driver.switchTo().window(ChildTab);
       	
       } 
Thread.sleep(3000);
System.out.println(driver.getTitle()); 
	        
	     
	   	   
	   fp.clicknumberrequired();
	   Thread.sleep(3000);
	      
		captureScreen(driver,"Tescase003_Honey");   
	   fp.clickaddtocart();
	   Thread.sleep(3000);
	   fp.scrolldown();
	   Thread.sleep(1000);
	   fp.clickgotocart();
		captureScreen(driver,"Tescase003_Honey");
	   Thread.sleep(2000);
	   hp.clicksignout();
	   
}}
