package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Config.Screenshot;

public class HomePage_OwnerProperties {

	WebDriver driver; // Initialize the WebDriver
	JavascriptExecutor js;
	Screenshot ss;

	@FindBy(xpath ="//a[text()=\"Rent\"]/parent::li/child::a")
	WebElement rent;
	@FindBy(xpath = "//div[@id=\"staticSwiperSliderRent\"]/descendant::a[text()=\"Owner Properties\"]")
	WebElement OwnerProperties;
	@FindBy(xpath = "//input[@class=\"auto-suggest__input topCityLocality\"]")
	WebElement AddMore;
	@FindBy(xpath = "//div[@class=\"auto-suggest__tag-close\"]")
	WebElement Cross;
	@FindBy(xpath = "//div[@style=\"bottom: 4px;\" and text()=\"Done\"]")
	WebElement Done;
	@FindBy(xpath = "//h2[@title=\"  Office Space for Rent in Mount Road Chennai\"]")
	WebElement Chennai;
	@FindBy(xpath = "//a[@class=\"mb-ldp__action--btn large btn-white freecab\" and text()=\"Make Offer\"]")
	WebElement MakeOffer;
	@FindBy(xpath = "//a[@data-testid=\\\"header-logo-link\\\"]")
	WebElement logo;

	public HomePage_OwnerProperties(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		ss = new Screenshot(driver);
	}

	public void clickRent() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		rent.click();
		Thread.sleep(3000);
		OwnerProperties.click();
		Thread.sleep(2000);
		
		// Store the current window handle
		String originalWindow = driver.getWindowHandle();
//		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.numberOfWindowsToBe(2));

		// Switch to the new window
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(originalWindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Thread.sleep(2000); // Close the driver after a short delay to see the result
		Robot robot = new Robot();
		Thread.sleep(2000);
		AddMore.click();
		Thread.sleep(2000);
		Cross.click();
		AddMore.sendKeys("Chennai");
		Thread.sleep(2000);
		robot.mouseMove(160, 320);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		Done.click();
		js.executeScript("window.scrollBy(0,900)");  // JavaScript Using for Scrolling The Page 
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-900)");  // JavaScript Using for Scrolling The Page 
		Thread.sleep(3000);
		Chennai.click();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		MakeOffer.click();
		robot.mouseMove(1250,250);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		logo.click();
//		robot.mouseMove(539,260);
//		Thread.sleep(3000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		
		ss.captureScreenshot("TestCase1");                  // Test Case-1 Screenshot Capturing
	
	}
}
