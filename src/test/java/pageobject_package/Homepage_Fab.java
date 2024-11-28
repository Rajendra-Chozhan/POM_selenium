package pageobject_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass_package.Baseclass_Fab;

public class Homepage_Fab extends Baseclass_Fab{
	 
	
	
WebDriver ldriver;
	
	public Homepage_Fab(WebDriver rdriver)
	
	{
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	@FindBy(xpath="//*[@id=\"CC-loginHeader-login\"]/img")
	public  WebElement LOGIN;
	
public  void clicklogin() {
		
		LOGIN.click();
	}
		
	
	@FindBy(xpath= " //input[@id='CC-login-input']")
 WebElement ENTEREMAIL;
	
public void enteremail(String email) {
	highLighterMethod(driver,ENTEREMAIL);	
	{ENTEREMAIL.sendKeys(email);}
	}
	
	
	@FindBy(xpath= "//*[@id=\"CC-login-password-input\"]")
	WebElement ENTERPASSWORD;
	
	
	public void enterpassword(String password) {
		highLighterMethod(driver,ENTERPASSWORD);
	
		ENTERPASSWORD.sendKeys(password);
		}
	

	@FindBy(xpath= "//*[@id=\"CC-userLoginSubmit\"]")
	WebElement CLICKLOGIN;
	
	
	public void clicksignin() {
		highLighterMethod(driver,CLICKLOGIN);
		CLICKLOGIN.click();
		}
	

	
	
	
	
	@FindBy(xpath= "//*[@id=\"CC-loginHeader-logout\"]")
	WebElement SIGNOUT;

	
	public void clicksignout() {
		highLighterMethod(driver,SIGNOUT);
		SIGNOUT.click();
		
	
		}
	
	
	
	@FindBy(xpath= "/html/body/div[3]/header/div/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[3]/div/span[2]/a/span/img")
	WebElement SEARCHICON;
	
	
	public void searchicon() {
			SEARCHICON.click();
		}
	
	
	@FindBy(id= "CC-headerWidget-Search")
	WebElement SEARCHBAR;
	
	public void searchbar() {
		highLighterMethod(driver,SEARCHBAR);
		SEARCHBAR.click();
		SEARCHBAR.clear();
		SEARCHBAR.sendKeys("KURTA FOR MEN");
		
		}
	
	
	@FindBy(xpath= "/html/body/div[3]/header/div/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[4]/div/div/div/div/div/form/div[1]/button/span[2]/img")
	WebElement CLICKSEARCH;
	
	public void clicksearch() {
		
		CLICKSEARCH.click();
		
		}
	
	
	
	
	
	
	@FindBy(xpath= "//p[contains(text(),'Linen Dobby Weave Long Kurta')]")
	WebElement LinenDobbyWeaveLongKurta;
	

	public void clickkurta() {
		

	    highLighterMethod(driver,LinenDobbyWeaveLongKurta);
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ; 
	    WebDriverWait wait = new WebDriverWait(driver, 30);

		
	    LinenDobbyWeaveLongKurta.click();
		
		}
	
	

	@FindBy(xpath= "//body/div[@id='page']/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[2]/div[1]/div[1]/ul[1]/li[3]/button[1]")
	WebElement SELECT_M_SIZE;
	
	
public void selectMsize() throws InterruptedException  {
		
		highLighterMethod(driver,SELECT_M_SIZE);
		
		SELECT_M_SIZE.click();
		
		}


@FindBy(xpath= "//body/div[@id='page']/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[6]/div[2]/div[1]/button[1]")
WebElement ADDTOCART;


public void addtocart()  {
	
	highLighterMethod(driver,ADDTOCART);
	ADDTOCART.click();
}


@FindBy(xpath= "//body[1]/div[3]/header[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
WebElement CLOSEICON;


public void closeicon()  {
	
	highLighterMethod(driver,CLOSEICON);
	CLOSEICON.click();
}

@FindBy(xpath= "//header/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
WebElement CARTICON;


public void carticon()  {
	
	highLighterMethod(driver,CARTICON);
	CARTICON.click();
}





@FindBy(xpath= "//*[@id=\"cat100137\"]")
WebElement FOOD;

public void movetofood() throws InterruptedException {
	
	highLighterMethod(driver,FOOD);
	Actions action = new Actions(driver);
	action.moveToElement(FOOD).build().perform();
	Thread.sleep(3000);
	
}

public void food()  {
	
	highLighterMethod(driver,FOOD);
	FOOD.click();
}


}