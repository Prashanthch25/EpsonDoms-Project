package com.DomsEpson.WelcomeTest;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.DomsEpson.GenericLibrary.BaseTest;
import com.DomsEpson.JavaLibrary.JavaUtility;
import com.DomsEpson.PageRepositoryLibrary.PageManagement;
import com.aventstack.extentreports.Status;

public class VerifyWelcomePageTest extends BaseTest {

	@Test(priority = 1)
	public void verifyWelcomepageWithValidInput() {

		// Create the Test Information
		test = report.createTest("verifyWelcomepageWithValidInput");

		// Steps information
		test.log(Status.INFO, "<----Execution Starts succesfully-->");

		// Execute the Precondition---->1.Launch the Browser,2.Navigate to URL
		test.log(Status.INFO, "Step1:Launching the Browser Successful");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the Welcome Page Using title

		Assert.assertEquals("Learning Selenium", webdriverobj.driver.getTitle());
		test.log(Status.PASS, "Title Verified");

		// Create object of the PageManager
		pageManagementobj = new PageManagement(webdriverobj.driver);

		// ---------------------------------------------------------------------------------------------------------------------------------//
		// Verify the Name TextField
		boolean result = pageManagementobj.initWelcomepage().getNametextfield().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "Element Verified:Name TextField is Displayed");

		// Step3:Perform Action--Clear
		pageManagementobj.initWelcomepage().getNametextfield().clear();
		test.log(Status.PASS, "Step3:Clear Action done succesfully-NameTextField");

		// Step4:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getNametextfield().sendKeys(username);
		test.log(Status.PASS, "Step4:SendKeys Action done succesfully-NameTextField");

		// See the execution
		JavaUtility.pause(3000);

		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the EmailTextField
		boolean result1 = pageManagementobj.initWelcomepage().getEmailtextfield().isDisplayed();
		if (result1) {
			test.log(Status.PASS, "Email TextField is Displayed");
		} else {
			test.log(Status.FAIL, "Email TextField is not Displayed");
		}
		// Step5:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getEmailtextfield().sendKeys("prashanthchinthalapati@gmail.com");
		test.log(Status.PASS, "Step5:SendKeys Action done succesfully-EmailTextField");
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the PasswordTextField
		boolean result2 = pageManagementobj.initWelcomepage().getPasswordtextfield().isDisplayed();
		if (result2) {
			test.log(Status.PASS, "Password TextField is Displayed");
		} else {
			test.log(Status.PASS, "Password TextField is not Displayed");
		}
		// Step6:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getPasswordtextfield().sendKeys("Prashanth@25");
		Reporter.log("Step6:SendKeys Action done succesfully-PasswordTextField", true);
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the PasswordTextField
		boolean result3 = pageManagementobj.initWelcomepage().getMobileNotextfield().isDisplayed();
		if (result3) {
			test.log(Status.PASS, "Mobilenum TextField is Displayed");
		} else {
			test.log(Status.PASS, "Mobilenum TextField is not Displayed");
		}
		// Step7:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getMobileNotextfield().sendKeys("8464944599");
		test.log(Status.PASS, "Step7:SendKeys Action done succesfully-MobileTextField");
		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the GenderField
		boolean result4 = pageManagementobj.initWelcomepage().getGendermalefield().isDisplayed();
		if (result4) {
			test.log(Status.PASS, "GenderField is Displayed");
		} else {
			test.log(Status.PASS, "GenderField is not Displayed");
		}

		// Step8:Perform Action--Click
		pageManagementobj.initWelcomepage().getGendermalefield().click();
		test.log(Status.PASS, "Step8:Click Action done succesfully-GenderField");

		// -------------------------------------------------------------------------------------------------------------------------------//
		// Verify the PlacesField
		boolean result5 = pageManagementobj.initWelcomepage().getPlacesbglrfield().isDisplayed();
		if (result5) {
			test.log(Status.PASS, "PlaceField is Displayed");
		} else {
			test.log(Status.PASS, "PlaceField is not Displayed");
		}

		// Step9:Perform Action--Undo click
		pageManagementobj.initWelcomepage().getPlacesgoafield().click();
		test.log(Status.PASS, "Step9:Undo Click Action done succesfully-GoaPlaceField");
		// Step10:Perform Action--Click
		pageManagementobj.initWelcomepage().getPlacesbglrfield().click();
		test.log(Status.PASS, "Step10:Click Action done succesfully-BanglorePlaceField");
		// -------------------------------------------------------------------------------------------------------------------------------//
		// Verify the CountryField
		boolean result6 = pageManagementobj.initWelcomepage().getCountry().isDisplayed();
		if (result6) {

			test.log(Status.PASS, "Country is Displayed");
		} else {
			test.log(Status.PASS, "Country is not Displayed");
		}

		// Step11:Create Select object reference for country
		Select s1 = new Select(pageManagementobj.initWelcomepage().getCountry());
		if (!s1.isMultiple()) {
			s1.selectByVisibleText("INDIA");
			test.log(Status.PASS, "Step11:INDIA option is selected successfully");
		}
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the CountryField2
		boolean result7 = pageManagementobj.initWelcomepage().getCountry2().isDisplayed();
		if (result7) {

			test.log(Status.PASS, "Country2 is Displayed");
		} else {
			test.log(Status.PASS, "Country2 is not Displayed");
		}

		// Step12:Create Select object reference for country2
		s1 = new Select(pageManagementobj.initWelcomepage().getCountry2());
		if (s1.isMultiple()) {
			s1.selectByVisibleText("INDIA");
			s1.selectByVisibleText("AUSTRALIA");
			s1.selectByVisibleText("USA");
			test.log(Status.PASS, "Step12:Options is selected successfully");
		}
		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the FeedbackTextField
		boolean result8 = pageManagementobj.initWelcomepage().getFeedback().isDisplayed();
		if (result8) {
			test.log(Status.PASS, "Feedback Field is Displayed");
		} else {
			test.log(Status.PASS, "Feedback Field is not Displayed");
		}

		// Step13:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getFeedback().sendKeys("Prashanth is a good boy");
		test.log(Status.PASS, "Step13:Perform Action done succesfully-FeedbackField");

		// ---------------------------------------------------------------------------------------------------------------------------//
		// Verify the FileuploadField
		boolean result9 = pageManagementobj.initWelcomepage().getFileupload().isDisplayed();
		if (result9) {
			test.log(Status.PASS, "Fileupload is Displayed");
		} else {
			test.log(Status.PASS, "Fileupload is not Displayed");
		}

		// Step14:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getFileupload()
				.sendKeys("C:/Users/DELL/Downloads/Chinthalapati_Prashanth_Resume.pdf");
		test.log(Status.PASS, "Step14:Perform Action done succesfully-Fileupload");
		// -----------------------------------------------------------------------------------------------//
		// see the Execution
		JavaUtility.pause(3000);
		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the DOBField
		boolean result10 = pageManagementobj.initWelcomepage().getDateofbirth().isDisplayed();
		if (result10) {
			test.log(Status.PASS, "DOB is Displayed");
		} else {
			test.log(Status.PASS, "DOB is not Displayed");
		}

		// Step15:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getDateofbirth().sendKeys("25-07-2000 / 22:10");
		test.log(Status.PASS, "Step15:Perform Action done succesfully-DOB");

		// --------------------------------------------------------------------------------------------------------------------------//
		// Verify the RegisterField
		boolean result11 = pageManagementobj.initWelcomepage().getRegister().isDisplayed();
		if (result11) {
			test.log(Status.PASS, "Register is Displayed");
		} else {
			test.log(Status.PASS, "Register is not Displayed");
		}

		// Step16:Perform Action--Click
		pageManagementobj.initWelcomepage().getRegister().click();
		test.log(Status.PASS, "Step16:Click Action done succesfully-Register");
		// --------------------------------------------------------------------------------------------------------------------------//
		// see the Execution
		JavaUtility.pause(3000);

		// SoftAssert Statement
		SoftAssert softassertobj = new SoftAssert();

		// Verify the "Contact Us" Hyperlink
		softassertobj.assertEquals("Contact Us", pageManagementobj.welcomepageobj.getContactus().getText());
		test.log(Status.PASS, "Step 18:Verified text Succesfully -Contact Us HyperLink");
		softassertobj.assertAll();

		// Execution Log or Status
		test.log(Status.INFO, "<----Execution completed succesfully--->");

	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "verifyWelcomepageWithValidInput")
	public void verifyWelcomepageWithInvalidInput() {

		// Create the Test Information
		test = report.createTest("verifyWelcomepageWithInvalidInput");

		// Execute the Precondition---->1.Launch the Browser,2.Navigate to URL
		test.log(Status.INFO, "<----Execution Starts succesfully-->");

		// Implicit wait
		webdriverobj.waitImplicitly(20);

		// Verify the Welcome Page Using title
		String exptitle = "Learning Selenium";
		String acttitle = webdriverobj.driver.getTitle();

		// Verify Title-HardAssertion
		Assert.assertEquals(acttitle, exptitle);
		test.log(Status.PASS, "Title Verified" + acttitle);

		// Create object of the PageManager
		pageManagementobj = new PageManagement(webdriverobj.driver);

		// Verify the Name TextField
		boolean result = pageManagementobj.initWelcomepage().getNametextfield().isDisplayed();

		Assert.assertTrue(result);
		test.log(Status.PASS, "Element Verified:Name TextField is Displayed");

		// Step3:Perform Action--Clear
		pageManagementobj.initWelcomepage().getNametextfield().clear();
		test.log(Status.PASS, "Step3:Clear Action done succesfully-NameTextField");

		// Step4:Perform Action--SendKeys
		pageManagementobj.initWelcomepage().getNametextfield().sendKeys("iiydfghjkuy654edfghj");
		test.log(Status.PASS, "Step4:SendKeys Action done succesfully-NameTextField");

		// See the execution
		JavaUtility.pause(3000);

		// To Make the Explicit TestScript Fail
		// Assert.fail();

		// Execute Post condition-->Terminate the browser
		// Execution Log or Status
		test.log(Status.INFO, "<----Execution completed succesfully-Test2-->");

	}

}
