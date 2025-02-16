package StepDefinition;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import DriverSetup.BaseSteps;
import PageObject.Compare_Localities;
import PageObject.HomePage_OwnerProperties;
import PageObject.NewProjects;
import PageObject.SearchPageFactory;
import PageObject.VerifiedProperties;
import java.awt.AWTException;
import org.openqa.selenium.WebDriver;

public class StepDefinition {
	WebDriver driver;
	HomePage_OwnerProperties ownerproperties;
	SearchPageFactory searchfactory;
	Compare_Localities localities;
	VerifiedProperties verifiedproperties;
	NewProjects newproject;

	@BeforeClass
	public void beforeClass() {
		driver = BaseSteps.chromeOptions();
		ownerproperties = new HomePage_OwnerProperties(driver);
		searchfactory = new SearchPageFactory(driver);
		localities = new Compare_Localities(driver);
		verifiedproperties = new VerifiedProperties(driver);
		newproject = new NewProjects(driver);
	}

	@Test(priority = 2 ) // Test Case-2
	public void Homepage() throws InterruptedException, AWTException {
		ownerproperties.clickRent();
	}

	@Test(priority = 1) // Test Case-1
	public void Searchfactory() throws InterruptedException, AWTException {
		searchfactory.searchUsingLocation();

	}

	@Test(priority = 3) // Test Case-3
	public void Locality() throws InterruptedException, AWTException {
		localities.CmpLocalities();
	}

	@Test(priority = 4) // Test Case-4
	public void Locality1() throws InterruptedException, AWTException {
		localities.CmpLocalities1();
	}

	@Test(priority = 5) // Test Case-6
	public void Verify() throws InterruptedException, AWTException {
		verifiedproperties.Verify();
	}

	@Test(priority = 6) // Test Case-5
	public void Newproj() throws InterruptedException, AWTException {
		newproject.NewProject();
	}
}