package Reports;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import DriverSetup.BaseSteps;
import PageObject.Compare_Localities;
import PageObject.HomePage_OwnerProperties;
import PageObject.NewProjects;
import PageObject.SearchPageFactory;
import PageObject.VerifiedProperties;

public class ExtentReport {
	WebDriver driver;

	HomePage_OwnerProperties ownerproperties;
	SearchPageFactory searchfactory;
	Compare_Localities localities;
	VerifiedProperties verifiedproperties;
	NewProjects newproject;

	ExtentReports extent;
	ExtentTest test;
	ExtentSparkReporter htmlReporter;

	@BeforeClass
	public void beforeclass() throws IOException {
		driver = BaseSteps.chromeOptions();
		driver = BaseSteps.chromedriver();

		ownerproperties = new HomePage_OwnerProperties(driver);
		searchfactory = new SearchPageFactory(driver);
		localities = new Compare_Localities(driver);
		verifiedproperties = new VerifiedProperties(driver);
		newproject = new NewProjects(driver);

		// Initialize Extent Reports
		htmlReporter = new ExtentSparkReporter("C:\\Users\\PNENDRAM\\OneDrive - Capgemini\\Desktop\\ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@Test(priority = 2) // Test Case-2
	public void OwnerProperties() throws InterruptedException, AWTException {
		test = extent.createTest("Owner Properties Page Test");
		ownerproperties.clickRent();
		test.pass("Owner Properties Page Executed Success");

	}

	@Test(priority = 1) // Test Case-1
	public void Searchfact() throws InterruptedException, AWTException {
		test = extent.createTest("SearchFactory Page Test");
		searchfactory.searchUsingLocation();
		test.pass("SearchFactory Page Executed Success");
	}

	@Test(priority = 3) // Test Case-3
	public void Localities() throws InterruptedException, AWTException {
		test = extent.createTest("Localities Page Test");
		localities.CmpLocalities();
		test.pass("Localities Failure Page Executed Success");

	}

	@Test(priority = 4) // Test Case-4
	public void Localities1() throws InterruptedException, AWTException {
		test = extent.createTest("Localities1 Fail Page Test");
		localities.CmpLocalities1();
		test.pass("Localities1 Failure Page Executed Success");

	}

	@Test(priority = 6) // Test Case-6
	public void Verification() throws InterruptedException, AWTException {
		test = extent.createTest("verifiedproperties Page Test");
		verifiedproperties.Verify();
		test.pass("verifiedproperties Failure Page Executed Success");

	}

	@Test(priority = 5) // Test Case-5
	public void Newproj() throws InterruptedException, AWTException {
		test = extent.createTest("New Project Page Test");
		newproject.NewProject();
		test.pass("New project Failure Page Executed Success");
	}

	@AfterClass

	public void tearDown() {
		driver.quit();
		extent.flush(); // Finalize the report
	}
}
