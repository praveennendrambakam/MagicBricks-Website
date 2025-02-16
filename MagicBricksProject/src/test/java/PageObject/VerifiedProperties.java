package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.w3c.dom.DOMException;
import Config.Screenshot;

public class VerifiedProperties {
	WebDriver driver;
	JavascriptExecutor js;
	Screenshot ss;

	@FindBy(xpath = "//a[text()=\"Rent\"]/parent::li/child::a")
	WebElement rent;
	@FindBy(xpath = "//div[@id=\"staticSwiperSliderRent\"]/descendant::a[text()=\"Verified Properties\"]")
	WebElement VerifiedProperties;
	@FindBy(xpath = "//h2[@title=\"5 BHK Villa for Rent in Defence Colony New Delhi\" and text()=\"5 BHK Villa for Rent in Defence Colony New Delhi\"]")
	WebElement Apartment;
	@FindBy(xpath = "(//div[@class=\"mb-srp__card__info mb-srp__card__info-withoutburger\"])[1]")
	WebElement Chennai;
	@FindBy(xpath = "//button[@class=\"contact-form__btn freecab\"]")
	WebElement PhoneNumber;
	@FindBy(xpath = "//button[@class=\"contact-form__btn\" and text()=\"Get Contact Details\"]")
	WebElement submit;
	@FindBy(xpath = "//div[@class=\"contact-form__close\"]")
	WebElement Cross;

	public VerifiedProperties(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		ss = new Screenshot(driver);
	}

	public void Verify() throws AWTException, InterruptedException, DOMException {

		Thread.sleep(2000);
		rent.click();
		Thread.sleep(3000);
		VerifiedProperties.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.mouseWheel(6);
		Thread.sleep(3000);
		Apartment.click();
		Thread.sleep(3000);
		robot.mouseMove(400, 325); // Choosing Apartment
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		robot.mouseMove(450, 450); // Choosing chennai
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


//		Robot robot = new Robot();
//		robot.mouseWheel(1);
//		Thread.sleep(5000); 	
//		robot.mouseMove(450, 450); // Choosing chennai
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//		Thread.sleep(8000); // click on Get Phone No
//		robot.mouseMove(1100, 370);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(3000);
//		
//		//<<<<<<<<<<<<<<<<<<<<Name input>>>>>>>>>>>>>>>>>>>>
//
//		robot.mouseMove(520, 350);
//		Thread.sleep(3000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		// Press Backspace to delete the selected text
////		robot.keyPress(KeyEvent.VK_BACK_SPACE);
////		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//
//		String YourName = "Praveen Nendrambakam";
//		for (char c : YourName.toCharArray()) {
//			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
//			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
//		}
//		Thread.sleep(5000);
//
//		robot.mouseMove(520, 420);
//		Thread.sleep(500);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//
//		// Press Backspace to delete the selected text
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//
//		String gmail = "truitryy@gmail.com";
//
//		for (char c : gmail.toCharArray()) {
//			if (Character.isLowerCase(c)) {
//				robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
//				robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
//			} else {
//				switch (c) {
//				case '@':
//					robot.keyPress(KeyEvent.VK_SHIFT);
//					robot.keyPress(KeyEvent.VK_2);
//					robot.keyRelease(KeyEvent.VK_2);
//					robot.keyRelease(KeyEvent.VK_SHIFT);
//					break; // Exit the loop after closing the new window
//				case '.':
//					robot.keyPress(KeyEvent.VK_PERIOD);
//					robot.keyRelease(KeyEvent.VK_PERIOD);
//					break; // Exit the loop after closing the new window
//				}
//			}
//		}
//		
//		robot.mouseMove(600, 490);
//		Thread.sleep(500);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//		// Press Backspace to delete the selected text
//		robot.keyPress(KeyEvent.VK_BACK_SPACE);
//		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
//
//		String mobileNumber = "7603983358";
//		for (char c : mobileNumber.toCharArray()) {
//			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
//			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
//		}
//		robot.mouseMove(650, 600);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		//submit.click();
//		Thread.sleep(6000);
//		robot.mouseMove(600, 400);
//		Thread.sleep(2000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		
//		Thread.sleep(3000);
//		robot.mouseMove(539, 260);
//		Thread.sleep(3000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//
//		robot.mouseMove(50, 140);
//		Thread.sleep(3000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		ss.captureScreenshot("TestCase5");
//		
//		String parentWindow = driver.getWindowHandle();
//		Set<String> window = driver.getWindowHandles();
//		for (String handle : window) {
//			System.out.println(handle);
//			if (!window.equals(parentWindow)) {
//				driver.switchTo().window(parentWindow);
//				Thread.sleep(2000);
//			}
//		}

	}
}