package com.DomsEpson.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.DomsEpson.WebDriverLibrary.WebDriverUtility;

/**
 * This Class Provides the Reusable Method to Javascript Utility methods
 * 
 * 
 * @author DELL
 */
public class JavScriptUtility {

	public JavascriptExecutor javascriptobj;

	/**
	 * This Method Used To enter data for DisableElement
	 * 
	 * @param WebElement element,String Data
	 * @return void
	 */
	public void enterData_DisabledElement(WebElement element, String data) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].value='" + data + "'", element);
	}

	/**
	 * This Method Used To perform click action on DisableElement
	 * 
	 * @param WebElement element
	 * @return void
	 */
	public void click_DisabledElement(WebElement element) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].click()", element);

	}

	/**
	 * This Method Used To perform scrollBy opertions vertically
	 * 
	 * @return void
	 */

	public void defaultVerticalscrollBy() {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("window.scrollBy(1000, 1000)");
	}

	/**
	 * This Method Used To perform ScrollTo actions vertically
	 * 
	 * @return void
	 */

	public void defaultVerticalscrollTo() {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("window.scrollTo(1000, 1000)");
	}
	
	/**
	 * This Method Used To perform ScrollUsingView
	 * 
	 * @param WebElement element,boolean value
	 * @return void*/

	public void defaultscrollUsingView(WebElement element, boolean value) {
		javascriptobj = (JavascriptExecutor) WebDriverUtility.driver_static;
		javascriptobj.executeScript("arguments[0].scrollIntoView(" + value + ");", element);
	}

}
