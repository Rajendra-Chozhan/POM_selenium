package testcases_package;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseclass_package.Baseclass_Fab;
import pageobject_package.Homepage_Fab;

public class TestCase001_Login_Logout_Fab extends Baseclass_Fab {

	
	

	@Test
    public void loginTest() throws IOException, InterruptedException {
		
    	 BasicConfigurator.configure();
		driver.get(BaseURL);
			
		System.out.println("Page title is : " + driver.getTitle());
		
		driver.manage().window().maximize();
		
		Homepage_Fab hp = new Homepage_Fab(driver);
		Thread.sleep(3000);
		captureScreen(driver,"Tescase001_LoginandLogout.1");
		hp.clicklogin();
		Thread.sleep(3000);
		
		hp.enteremail(Email);
		Thread.sleep(3000);
		captureScreen(driver,"Tescase001_LoginandLogout.2");
		
		hp.enterpassword(Password);
		Thread.sleep(3000);
		captureScreen(driver,"Tescase001_LoginandLogout.3");
		
		
		hp.clicksignin(); 		
 	    Thread.sleep(3000);
 	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ; 	    
 	 
 	    Thread.sleep(3000);
		captureScreen(driver,"Tescase001_LoginandLogout.4");
 	    
 	   hp.clicksignout();



 	

 	Thread.sleep(3000);
}}
