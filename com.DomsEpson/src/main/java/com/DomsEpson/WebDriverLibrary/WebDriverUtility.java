package com.DomsEpson.WebDriverLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 *This Class Provides the Reusable Method to Perform All Browser Related Actions
 *
 *
 *@author DELL*/
public class WebDriverUtility {

	public WebDriver driver;
	public static WebDriver driver_static;
	public Select selectobj;
	public Actions actionsobj;
	public Robot robotobj;
	public WebDriverWait wait;
	
	/**
	 * This Method Used To Launch The Specific Browser
	 * 
	 * @param String BrowserName
	 * @return void*/
	public void launchBrowser(String browser)
	{
		//Step1:Launch the browser-chrome,fire fox,edge
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver_static=driver;
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver_static=driver;
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver_static=driver;
			break;
		default:
			Reporter.log("You Have Entered incorrect Browser Name",true); 
			break;
		}
	}
	/**
	 * This Method is used to Navigate to the Application
	 * 
	 * @param String url
	 * @return void*/
	public void NavigateToApplication(String url)
	{
		driver.get(url);
	}
	
	/**
	 * This Method is used to Maximize the Browser
	 * 
	 * @param String url
	 * @return void*/
	
	public  void maximizeTheBrowser() 
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * This Method is used to Close the Browser
	 * 
	 * @return void*/
	
	public void closeTheBrowser()
	{
		driver.close();
	}
	
	/**
	 * This Method is used to Quit the Browser
	 * 
	 * @return void*/
	public void closeAllBrowsers()
	{
		driver.quit();
	}
	
	/**
	 * This Method is used to Wait Implicitly
	 * 
	 * @param long duration
	 * @return void*/
	public void waitImplicitly(long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration,TimeUnit.SECONDS);
	}
	
	/**
	 * This Method is used to Wait Explicitly
	 * 
	 * @param long duration,WebElement element
	 * @return void*/
	public void waitExplicitly(long duration,WebElement element)
	{
		wait = new WebDriverWait(driver,duration);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This Method is used to SelectoptionInDropdown by Index
	 * 
	 * @param WebElement element,long index
	 * @return void*/
	public void selectOptionInDropdown(WebElement element,int index)
	{
		selectobj.selectByIndex(index);;
	}
	
	/**
	 * This Method is used to SelectoptionInDropdown by VisibleText
	 * 
	 * @param WebElement element,String visible text
	 * @return void*/
	public void selectOptionInDropdown(WebElement element,String visibletext)
	{
		selectobj.selectByVisibleText(visibletext);
	}
	
	/**
	 * This Method is used to SelectoptionInDropdown by Value
	 * 
	 * @param String value,WebElement element
	 * @return void*/
	public void selectOptionInDropdown(String value,WebElement element)
	{
		selectobj.selectByValue(value);
	}
	/**
	 * This Method is used to Move to the element by MouseHovering
	 * 
	 * @param WebElement element
	 * @return void*/
	public void mouseHovering_movetoelement(WebElement element)
	{
		actionsobj.moveToElement(element).perform();
	}
	
	/**
	 * This Method is used to Left click the element by MouseHovering
	 * 
	 * @param WebElement element
	 * @return void*/
	public void mouseHovering_click(WebElement element)
	{
		actionsobj.click(element).perform();
	}
	
	/**
	 * This Method is used to right click operation by MouseHovering
	 * 
	 * @param WebElement element
	 * @return void*/
	public void mouseHovering_contextclick(WebElement element)
	{
		actionsobj.contextClick(element).perform();
	}
	
	/**
	 * This Method is used to double click element by MouseHovering
	 * 
	 * @param WebElement element
	 * @return void*/
	public void mouseHovering_doubleclick(WebElement element)
	{
		actionsobj.doubleClick(element).perform();
	}
	/**
	 * This Method is used to DragandDrop by MouseHovering
	 * 
	 * @param WebElement element
	 * @return void*/
	public void mouseHovering_Draganddrop(WebElement element1, WebElement element2)
	{
		actionsobj.dragAndDrop(element1, element2).perform();
	}
	
	/**
	 * This Method is used to pressTheKey_pageDown
	 * 
	 * @return void*/
	public void pressTheKey_pageDown()
	{
		robotobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Method is used to ReleaseTheKey_pageDown
	 * 
	 * @return void*/
	public void ReleaseTheKey_pageDown()
	{
		robotobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Method is used to Accept the alert Popup
	 * 
	 * @return void*/
	public void AlertPopupAccept()
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This Method is used to dismiss the alert Popup
	 * 
	 * @return void*/
	public void AlertPopupDismiss()
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This Method is used to switch the control to frame
	 * 
	 * @param int index
	 * @return void*/
	public void switchControlToFrame(int Index)
	{
		driver.switchTo().frame(0);
	}
	
	/**
	 * This Method is used to switch the control to frame
	 * 
	 * @param WebElement element
	 * @return void*/

	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This Method is used to switch the control to back to main
	 * 
	 * @return void*/

	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This Method is used to switch the control to window
	 * 
	 * @param String windowaddress
	 * @return void*/

	public void switchControlToWindow(String windowaddress)
	{
		driver.switchTo().window(windowaddress);
	}
	
}
