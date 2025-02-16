package Config;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
 
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Screenshot {
	WebDriver driver;
 
    public Screenshot(WebDriver driver) {
        this.driver=driver;
    }
    public String captureScreenshot(String testName) {
        // Create a timestamp to append to the screenshot file name
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String fileName = testName + "_" + timestamp + ".png";
        // Ensure there's a separator before the file name
        String filePath = "C:\\Users\\PNENDRAM\\eclipse-workspace\\MagicBricksProject\\src\\test\\java\\Config\\Screenshots.java\\" + fileName;
 
        // Take the screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            // Copy the screenshot to the specified location
            FileUtils.copyFile(screenshotFile, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        return filePath; // Return the path of the saved screenshot
    }
}
