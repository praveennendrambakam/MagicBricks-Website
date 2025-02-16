package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Config.Screenshot;

public class Compare_Localities {
	WebDriver driver;
	Screenshot ss;

	// Locate the web element using XPath
	@FindBy(xpath = "//a[text()=\"Rent\"]/parent::li/child::a")
	WebElement rent;
	@FindBy(xpath = "//a[text()=\"PG in Chennai\"]") //// XPath locator to find the element
	WebElement mumbai;
	@FindBy(xpath = "(//div[@onclick=\"hidePostReqForm();\"])[1]")
	WebElement cross;

	public Compare_Localities(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		ss = new Screenshot(driver);

	}

	public void CmpLocalities() throws AWTException, InterruptedException {
		Thread.sleep(2000);
		rent.click();
		Thread.sleep(2000);
		mumbai.click();
		Thread.sleep(3000);

		// Simulate a mouse click to focus the comment input field
		Robot robot = new Robot();
		Thread.sleep(3000); // Share Requirement
		robot.mouseMove(500, 385);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left mouse button
		Thread.sleep(3000);
		String Name = " "; // Loop through each character in the string 'Name'

		for (char c : Name.toCharArray()) {
			// Get the extended key code for the current character 'c'
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c)); // Simulate pressing the key corresponding to the
																	// Character
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c)); // Simulate releasing the key after pressing it
		}

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Gmail>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		robot.mouseMove(550, 340);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		String gmail = "example@gmail.com";

		for (char c : gmail.toCharArray()) {
			if (Character.isLowerCase(c)) {
				robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
				robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			} else {
				switch (c) {
				case '@':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					break; // Exit the loop after closing the new window
				case '.':
					robot.keyPress(KeyEvent.VK_PERIOD);
					robot.keyRelease(KeyEvent.VK_PERIOD);
					break; // Exit the loop after closing the new window
				}
			}
		}

		// <<<<<<<<<<<<<<<<<<<<<<<Mobile Number>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		robot.mouseMove(600, 400);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		String mobileNumber = "8309197608";
		for (char c : mobileNumber.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
		}

		robot.mouseMove(485, 535);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		robot.mouseMove(600, 610);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);

		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for (String handle : window) {
			System.out.println(handle);
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(parentWindow);

				ss.captureScreenshot("TestCase4"); // Test Case-4 Screenshot Capturing
			}
		}

	}

	// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Next
	// TextCase>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

	public void CmpLocalities1() throws AWTException, InterruptedException {
		rent.click();
		Thread.sleep(2000);
		mumbai.click();
		Thread.sleep(3000);

		// Simulate a mouse click to focus the comment input field
		Robot robot = new Robot();
		Thread.sleep(3000); // Share Requirement
		robot.mouseMove(500, 385);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release left mouse button
		Thread.sleep(3000);

		robot.mouseMove(550, 300);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		String Name = "Praveen"; // Loop through each character in the string 'Name'

		for (char c : Name.toCharArray()) {
			// Get the extended key code for the current character 'c'
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c)); // Simulate pressing the key corresponding to the
																	// Character
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c)); // Simulate releasing the key after pressing it
		}

		robot.mouseMove(550, 340);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		String gmail = "example@gmail.com"; // Robots Using for Entering the Input values(Gmail)

		for (char c : gmail.toCharArray()) {
			if (Character.isLowerCase(c)) {
				robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
				robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
			} else {
				switch (c) {
				case '@':
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_SHIFT);
					break; // Exit the loop after closing the new window
				case '.':
					robot.keyPress(KeyEvent.VK_PERIOD);
					robot.keyRelease(KeyEvent.VK_PERIOD);
					break; // Exit the loop after closing the new window
				}
			}
		}
		robot.mouseMove(600, 400);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		String mobileNumber = "8309197608"; // Robots Using for Entering the Input values(Mobile Number)
		for (char c : mobileNumber.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
		}

		robot.mouseMove(485, 535);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		robot.mouseMove(600, 610);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);

		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for (String handle : window) {
			System.out.println(handle);
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(parentWindow);

				ss.captureScreenshot("TestCase3"); // Test Case-3 Screenshot Capturing
			}
		}
	}
}