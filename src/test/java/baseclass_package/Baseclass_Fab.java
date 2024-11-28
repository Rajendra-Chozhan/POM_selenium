package baseclass_package;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities_package.Readconfigfile;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;



public class Baseclass_Fab {

	
Readconfigfile read = new Readconfigfile();
	
	
	public String BaseURL=read.getApplicationURL();
	public String Email=read.getEmail();
	public String Password=read.getPassword();
	
	public static WebDriver driver =null;
	


	 public static void highLighterMethod(WebDriver driver, WebElement element){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid green;');", element);
		}
	 
	 
	 
	 static public  void captureScreen(WebDriver driver, String tname) throws IOException {
		 try {
			TakesScreenshot ts = (TakesScreenshot) driver; // interface
			File source = ts.getScreenshotAs(OutputType.FILE); // method
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" +"/Snapshots/" + tname + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
		}
	 
		 catch(Exception e) {
			 
			 System.out.println("Exception while taking screenshot" +e.getMessage());
		 }
	 }
     @Parameters("Browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException {
    
		BasicConfigurator.configure();	
		
	
		
		if (br.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver",read.getFirefoxpath());
			driver = new FirefoxDriver();	
		
					
			
			}
	else
		
		if (br.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver",read.getIEpath());
		driver = new InternetExplorerDriver();	
	}
		else 	
			if(br.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",read.getChromepath());
						driver = new ChromeDriver();
					
			
	}

		else if (br.equals("edge")) {
			{
			System.setProperty("webdriver.edge.driver",read. getEdgepath());
		driver = new EdgeDriver();	
	}}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
     
     
     }
	
	@AfterClass
	public void Exit() {

driver.quit();}
public static void generateexcelreport() throws ParserConfigurationException, IOException, SAXException {
	
	// ExcelReportGenerator.generateExcelReport("MyProject.xls", "E:\\POM-Chozhan\\ExcelReport");

}
}
	
