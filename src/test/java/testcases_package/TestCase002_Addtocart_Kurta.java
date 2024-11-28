package testcases_package;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass_package.Baseclass_Fab;
import pageobject_package.Homepage_Fab;

public class TestCase002_Addtocart_Kurta extends Baseclass_Fab {

	
	

	@Test
    public void addtocart() throws IOException, InterruptedException {
		
    	 BasicConfigurator.configure();
		driver.get(BaseURL);
			
		System.out.println("Page title is : " + driver.getTitle());
		
		driver.manage().window().maximize();

		Homepage_Fab hp = new Homepage_Fab(driver);
		Thread.sleep(3000);
		captureScreen(driver,"Tescase002_AddtoCart");
		hp.clicklogin();
		Thread.sleep(3000);
		captureScreen(driver,"Tescase002_AddtoCart");
		hp.enteremail(Email);
		Thread.sleep(3000);
		
		
		hp.enterpassword(Password);
		Thread.sleep(3000);
		
		captureScreen(driver,"Tescase002_AddtoCart");
		
		hp.clicksignin(); 		
 	    Thread.sleep(3000);
	
	    hp.searchicon();
        Thread.sleep(1000);
        
        
        captureScreen(driver,"Tescase002_AddtoCart");
        hp.searchbar();
        Thread.sleep(1000);
    
        hp.clicksearch();
        Thread.sleep(1000);
        
               
        
        // Handle new tab 
        
        String parentwindowhandle = driver.getWindowHandle();
        captureScreen(driver,"Tescase002_AddtoCart");
        System.out.println(parentwindowhandle);
    
        hp.clickkurta();
        Thread.sleep(1000);
        
        for(String ChildTab : driver.getWindowHandles()) {
        	
        	driver.switchTo().window(ChildTab);
        	
        }
        Thread.sleep(3000);
       System.out.println(driver.getTitle()); 	
       Thread.sleep(3000);
       
   
       captureScreen(driver,"Tescase002_AddtoCart");
       hp.selectMsize() ;
       Thread.sleep(2000);
       
       captureScreen(driver,"Tescase002_AddtoCart");
       hp.addtocart();
       Thread.sleep(2000);
 hp.closeicon();
 Thread.sleep(2000);
     hp.carticon();
     Thread.sleep(2000);
      hp.clicksignout(); 
        
	}}
