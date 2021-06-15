package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aboutUs {
	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")
	WebElement linker;
	
	public void aboutUsLink(String linktext) {
		linker.click();
	}
}
