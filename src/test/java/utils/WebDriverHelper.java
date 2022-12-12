package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

public class WebDriverHelper extends base_Test{
	public static void getScreenShot(String value) throws IOException, WebDriverException {
		String path = System.getProperty("user.dir");
		File scrFile = null;
		try {
			scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileUtils.copyFile(scrFile, new File("./screenshots/" + value + ".png"));
	}
}
