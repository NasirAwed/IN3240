package testautomation.assignmentIN3240;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {
	public static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		fileName = fileName + ".png";
		String directory = "/Users/nasirawed/Documents/in3240/in3240-exercises/oblig1"; //This path for Windows you need to change it for Mac/Linux
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		String destination = directory + fileName;
		return destination;
	}

}
