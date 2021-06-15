package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class softwareDevelopment1 {
	public WebDriver driver;
	
	public void mouseOver(WebDriver driver) {
		this.driver = driver;
	}	
//	Actions actionTest = new Actions(driver);
	WebElement findPartLinkTwoMouse = driver.findElement(By.xpath("/html/body/header/nav/div[3]/div/div[2]/ul/li[3]/a"));
	public void courses1 (String args) throws Exception {
		
	Select dropDown = new Select (findPartLinkTwoMouse);
			dropDown.selectByVisibleText("SOFTWARE DEVELOPMENT");
//		new Actions(driver).moveToElement(findPartLinkTwoMouse).build().perform();
//		findPartLinkTwoMouse.click();
	System.out.print("Done");
	}
	}
