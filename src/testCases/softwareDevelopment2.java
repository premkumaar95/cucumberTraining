package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class softwareDevelopment2 {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/li[3]/ul/li/a")
	WebElement findPartLinkThree;
	
	public void courses2 (String args) {
		findPartLinkThree.click();
	}
}
