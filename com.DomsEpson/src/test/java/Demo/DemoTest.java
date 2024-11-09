package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DemoTest {

	@Test
	public void demoTesting() {
		// Create the SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the sparkReport Information
		spark.config().setDocumentTitle("Regression Testing for the learningSeleniumPage");
		spark.config().setReportName("RegressionSuite||Verification of the Welcomepage");
		spark.config().setTheme(Theme.DARK);

		// Create the extent report
		ExtentReports report = new ExtentReports();

		// Attach the Spark Report and ExtentReport
		report.attachReporter(spark);

		// Configure the System Information in ExtentReport
		report.setSystemInfo("DeviceName:", "Prashanth Chinthalapati");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 10");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-130.0.6723.92");

		// Create the Test Information
		ExtentTest test = report.createTest("Regressiontest");

		// Steps information
		test.log(Status.INFO, "Step1:Launching the Browser Successful");

		test.log(Status.INFO, "Step2:Navigating To Application via URl Successful");

		test.log(Status.PASS, "Step1:Verified the Webpage Successful");

		if ("Prashanth Chinthalapati".equals("Prashanth Chinthalapati")) {
			test.log(Status.PASS, "Step4: verified the WebElement is Displayed");
		} else {
			test.log(Status.FAIL, "Step4:verified th WebElement is Not Displayed");
		}

		//test.log(Status.SKIP, "Step5:Element is Hidden");

		// Flush the Report Information
		report.flush();

		System.out.println("Execution done");

	}

	@Test
	public void DemoTesting2() {

	}
	
	@Test
	public void DemoTesting3() {

	}
	
	@Test
	public void DemoTesting4() {

	}
	
	@Test
	public void DemoTesting5() {

	}

}
