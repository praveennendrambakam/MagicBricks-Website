package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Config.Screenshot;

public class SearchPageFactory {
	WebDriver driver = null;
	JavascriptExecutor js;
	private Actions actions;
	Screenshot ss;

	// marks a field on the Page Object for locating the WebElement or a list of
	// WebElements.

	@FindBy(xpath = "//div[@onclick=\"fireChangeCategoryGTM(event,'Rent');openPgTabUrl(this);\"]")
	WebElement Rent;
	@FindBy(xpath = "//div[@class='mb-search__tag-t']")
	WebElement Value;
	@FindBy(xpath = "//div[@class=\'mb-search__tag-close\']")
	WebElement cross;
	@FindBy(xpath = "//input[@class='mb-search__input']")
	WebElement location;
	@FindBy(xpath = "//div[@onclick='selectSearch(\"Mumbai\",4320,4320,\"city\")']")
	WebElement Mumbai;
	@FindBy(xpath = "//div[@onclick=\"showPropertyDropDown(event, this);fireSearchBoxClickedGTM();\"]")
	WebElement Flat;
	@FindBy(xpath = "//div[text()='Residential']")
	WebElement Residential;
	@FindBy(xpath = "//div[@onclick=\'openPropertyType(this);\']")
	WebElement Commercial;
	@FindBy(xpath = "//div[text()='Other Property Types']")
	WebElement OtherPropertyTypes;
	@FindBy(xpath = "//span[@class='buy_budget_lbl']")
	WebElement Budget;
	@FindBy(xpath = "//input[@id='budgetMin']")
	WebElement minPrice;
	@FindBy(xpath = "//input[@id='budgetMax']")
	WebElement maxPrice;
	@FindBy(xpath = "//div[@class='mb-search__btn']")
	WebElement search;
	@FindBy(xpath = "//a[@data-testid=\"header-logo-link\"]")
	WebElement logo;

	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		this.actions = new Actions(driver);
		PageFactory.initElements(driver, this);
		ss = new Screenshot(driver);
	}

	public void searchUsingLocation() throws AWTException, InterruptedException {

		// Actions automating mouse and keyboard events in web applications
//		Actions action = new Actions(driver);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(Rent));
//		action.moveToElement(Rent);
//		wait.until(ExpectedConditions.elementToBeClickable(Rent)).click();
		Thread.sleep(2000);
		Rent.click();
		Thread.sleep(2000);
		Value.click();
		cross.click();
		location.click();
		Thread.sleep(2000);
		location.sendKeys("Mumbai");
		Thread.sleep(1000);
		Mumbai.click();
		Thread.sleep(1000);
		Flat.click();
		Thread.sleep(1000);
		Residential.click();
		Commercial.click();
		OtherPropertyTypes.click();
		Thread.sleep(1000);
		Budget.click();
		minPrice.sendKeys("50000");
		maxPrice.sendKeys("85000");
		search.click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(350,350)", "");

		logo.click();
//
//		// This screenshot shows the output of the program under certain conditions.
		ss.captureScreenshot("TestCase1"); // Test Case-2 Screenshot Capturing

	}
}