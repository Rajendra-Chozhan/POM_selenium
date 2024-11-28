package testcases_package;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import baseclass_package.Baseclass_Fab;

public class Testcase_SanityTesting extends Baseclass_Fab{
	
	
	
	@Test
    public void loginTest() throws IOException, InterruptedException, ParserConfigurationException, SAXException {

		

		driver.get("https://www.google.com/");	
		Thread.sleep(3000);
			System.out.println("Page title is : " + driver.getTitle());
			
			driver.manage().window().maximize();
	
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		captureScreen(driver,"Testcase001");
		System.out.println(driver.getTitle());
	
	}

}
