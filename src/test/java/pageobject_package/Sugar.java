package pageobject_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass_package.Baseclass_Fab;

public class Sugar extends Baseclass_Fab {
	
	
WebDriver ldriver;
	
	public Sugar(WebDriver rdriver)
	
	{
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	@FindBy(xpath="//a[@id='CC-guidedNavigation-dimensionHeader-0']")
	public WebElement SIZE;
	
	@FindBy(xpath="//*[@id=\"CC-headerWidget-Search\"]")
	public WebElement SEARCH;
	
public void clicksize() throws InterruptedException {
	
	Actions action = new Actions(driver);
	action.moveToElement(SEARCH).build().perform();
	highLighterMethod(driver,SIZE);
	Thread.sleep(2000);
	SIZE.click();
	}




@FindBy(xpath="//body/div[@id='page']/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/ul[1]/li[2]/div[1]/label[1]/span[3]\r\n" + 
		"")
public WebElement CHECKBOX500;

public void clickcheckbox500() throws InterruptedException {
highLighterMethod(driver,CHECKBOX500);
Thread.sleep(2000);
CHECKBOX500.click();
}
}
