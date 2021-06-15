package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class softwareDevelopment{
	public WebDriver driver;
	
	@FindBy(xpath = "/html/body/header/nav/div[3]/div/div[2]/ul/li[3]/a")
	WebElement findPartLink;
//	@FindBy(xpath = "/html/body/header/nav/div[3]/div/div[2]/ul/li[3]/ul/li[3]/a")
//	WebElement findPartLinkTwo;
//	@FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/ul/li[3]/ul/li/a")
//	WebElement findPartLinkThree;
	
	
	
	
	public void courses (String findPartLinkText) {
		findPartLink.click();
//		Actions findPartLinkTwoMouse = actionTest.moveToElement(findPartLinkTwo);
//		findPartLinkTwoMouse.perform();
//		findPartLinkThree.click();
	}
	
	
}
