package testcases_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseclass_package.Baseclass_Fab;
import pageobject_package.Foodpage_Fab;
import pageobject_package.Homepage_Fab;
import pageobject_package.Sugar;

public class Testcase004_Food_sugar extends Baseclass_Fab{

	
	

	@Test
    public void loginTest() throws IOException, InterruptedException {
		
		 BasicConfigurator.configure();
			driver.get(BaseURL);
				
			System.out.println("Page title is : " + driver.getTitle());
			
			driver.manage().window().maximize();
			captureScreen(driver,"Tescase004_Sugar");
			Homepage_Fab hp = new Homepage_Fab(driver);
			Thread.sleep(3000);
			
			hp.clicklogin();
			Thread.sleep(3000);
			
			hp.enteremail(Email);
			Thread.sleep(3000);
			captureScreen(driver,"Tescase004_Sugar");
			
			hp.enterpassword(Password);
			Thread.sleep(3000);
			
			captureScreen(driver,"Tescase004_Sugar");
			
			hp.clicksignin(); 		
	 	    Thread.sleep(3000);
 	    
 	
 	    hp.movetofood();
 	    
 		Foodpage_Fab fp = new Foodpage_Fab(driver);
 	    
 	    fp.clicksugar();
 	   Thread.sleep(3000);
 	   
 		captureScreen(driver,"Tescase004_Sugar");
 	 
 	    Sugar s = new Sugar(driver);
 	    
 	    s.clicksize();
 	   Thread.sleep(3000);
 	    s.clickcheckbox500();
 	   Thread.sleep(3000);
 		captureScreen(driver,"Tescase004_Sugar");
 	    Select category = new Select(driver.findElement(By.xpath("//select[@id='CC-product-listing-sortby']")));
 	   category.selectByVisibleText("Price: High to Low");
 	   
 	   Thread.sleep(6000);
 		captureScreen(driver,"Tescase004_Sugar");
 	   driver.findElement(By.xpath("//body/div[@id='page']/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/a[1]/i[1]")).click();
Thread.sleep(2000);
captureScreen(driver,"Tescase004_Sugar");
hp.clicksignout();
	
	}}
