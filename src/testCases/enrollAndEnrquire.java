package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class enrollAndEnrquire {
	
	public WebDriver driver;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div/a[1]")
	WebElement enroll;
	
	@FindBy(xpath = "/html/body/section[1]/div/div/div/a[2]")
	WebElement enquire;
	
	public void verifyEnrollEnquire(String verify) {
		if(enroll.isDisplayed()) {
			System.out.print("Enroll link is available");
		}
		if(enquire.isDisplayed()) {
			System.out.print("Enquire link is available");
		}
	}
	

}
