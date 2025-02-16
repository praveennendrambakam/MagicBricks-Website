package DriverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseSteps {

	public static WebDriver driver;
	public static ChromeOptions optionsChrome;

	public static WebDriver chromeOptions() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); // This will automatically manage the driver
		optionsChrome = new ChromeOptions();
		optionsChrome.addArguments("start-maximized");
		optionsChrome.addArguments("disable-popup-blocking");
		optionsChrome.addArguments("deny-permission-prompts");
		driver = new ChromeDriver(optionsChrome);
		driver.get("https://www.magicbricks.com/");
		return driver;
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static WebDriver chromedriver() {
		return driver; // Return the initialized driver
	}
}