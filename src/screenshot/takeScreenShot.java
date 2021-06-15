package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class takeScreenShot {
	public WebDriver driver;
	

public takeScreenShot(WebDriver driver) {
	this.driver = driver;
}
public void screenShots(String destinationfile, String filename) throws Exception {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File (destinationfile+"\\"+filename));
}
}
