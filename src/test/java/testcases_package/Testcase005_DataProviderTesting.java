package testcases_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import baseclass_package.Baseclass_Fab;

public class Testcase005_DataProviderTesting {

	
	WebDriver driver;
  	@BeforeMethod
  	  public void setUp() throws InterruptedException {
           	  System.out.println("Start test");

      		System.setProperty("webdriver.gecko.driver","C:\\Firefox Driver\\geckodriver.exe");
        	  driver = new FirefoxDriver();
        	  String url = "https://www.google.com";
        	  driver.get(url);
        	  Thread.sleep(2000);
        	  driver.manage().window().maximize();
        	  Thread.sleep(2000);
        	 
  	  }
  	
  	@DataProvider(name ="excel-data")
  	public Object[][] excelDP() throws IOException{
        	//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
        	Object[][] arrObj = getExcelData("E:\\POM-Chozhan\\Testdata\\TestData.xlsx","TestData.xlsx");
        	return arrObj;
  	}
  	//This method handles the excel - opens it and reads the data from the respective cells using a for-loop & returns it in the form of a string array
  	public String[][] getExcelData(String fileName, String sheetName){
        	
        	String[][] data = null;  
        	String excelFilePath="E:\\POM-Chozhan\\Testdata\\TestData.xlsx";
        	
  	  	try
  	  	{
  	   	FileInputStream fis = new FileInputStream(excelFilePath);
  	   	XSSFWorkbook wb = new XSSFWorkbook(fis);
  	   	XSSFSheet sh = wb.getSheetAt(0);
  	   	XSSFRow row = sh.getRow(0);
  	   	int noOfRows = sh.getPhysicalNumberOfRows();
  	   	int noOfCols = row.getLastCellNum();
  	   	Cell cell;
  	   	data = new String[noOfRows-1][noOfCols];
  	   	
  	   	for(int i =1; i<noOfRows;i++){
  		     for(int j=0;j<noOfCols;j++){
  		    	   row = sh.getRow(i);
  		    	   cell= row.getCell(j);
  		    	   data[i-1][j] = cell.getStringCellValue();
  	   	 	   }
  	   	}
  	  	}
  	  	catch (Exception e) {
  	     	   System.out.println("The exception is: " +e.getMessage());
           	}
        	return data;
  	}
  	private String Sheet(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test(dataProvider ="excel-data")
  	public void search(String keyWord1, String keyWord2) throws InterruptedException{
        	WebElement txtBox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        	  txtBox.sendKeys(keyWord1," ",keyWord2);
        	  Thread.sleep(2000);
        	  Reporter.log("Keyword entered is : " +keyWord1+ " " +keyWord2);
        	  txtBox.sendKeys(Keys.ENTER);
        	  Thread.sleep(2000);
        	  Reporter.log("Search results are displayed.");
  	}
  	@AfterMethod
  	public void burnDown(){
        	driver.quit();
  	} 	
}

