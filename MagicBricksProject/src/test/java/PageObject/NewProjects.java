package PageObject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Config.Screenshot;

public class NewProjects {
	WebDriver driver = null;
	JavascriptExecutor js;
	Screenshot ss;

	@FindBy(xpath = "//a[@onclick=\"fireSrpRedirectionGa()\"]")
	WebElement Project;
	@FindBy(xpath = "//span[@class=\"projdis__banner__city\"]")
	WebElement city;
	@FindBy(xpath = "(//img[@class=\"selctcity__block__img\"])[9]")
	WebElement Thane;
	@FindBy(xpath = "(//span[@class=\"projdis__prjcard__cta projdis__prjcard__cta--trans  \"])[1]")
	WebElement DownloadBrouchure;
	@FindBy(id = "userName")
	WebElement YourName;
	@FindBy(xpath = "//input[@name=\"userEmail\"]")
	WebElement Email;
	@FindBy(id ="userMobile")
	WebElement MobNum;
	@FindBy(xpath = "//div[@class=\"contact-form__close\"]")
	WebElement Cross;
	@FindBy(xpath = "//body[@class=\"no-overflow\"]")
	WebElement otp;

	public NewProjects(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		ss = new Screenshot(driver);
}


	public void NewProject() throws AWTException, InterruptedException {

		// >>>>>>>>>>>>>>>>>>>>>>>>>Assert<<<<<<<<<<<<<<<<<<<<<<<<<

		

		Project.click();
		Thread.sleep(2000);
		city.click();
		Thread.sleep(2000);
		Thane.click();
		Thread.sleep(3000);
		for (int i = 0; i < 10; i++) { // Adjust the number of increments as needed
			js.executeScript("window.scrollBy(0,100);"); // Scroll down 100 pixels
			Thread.sleep(200); // Small delay to allow rendering
		}
		DownloadBrouchure.click();
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.mouseMove(600, 430);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		String YourName = "Praveen Nendrambakam";
		for (char c : YourName.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
		}
		Thread.sleep(3000);
		
		robot.mouseMove(600, 500);
		Thread.sleep(500);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);

		String gmail = "truitryy@gmail.com";
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
		
		robot.mouseMove(600, 430);
		Thread.sleep(3000);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		
		String mobileNumber = "8309197608";
		for (char c : YourName.toCharArray()) {
			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
		}

	
//		Thread.sleep(2000);
//		String mobileNumber = "8309197608";
//		for (char c : mobileNumber.toCharArray()) {
//			robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
//			robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
//		}
//		robot.mouseMove(800, 500);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(6000);
//		robot.mouseMove(600, 400);
//		Thread.sleep(2000);
//		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//		Thread.sleep(2000);
//		Cross.click();
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-980);");
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
		ss.captureScreenshot("TestCase6");
		
	}
}