package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class headerText {
	
	public WebDriver driver;
	
	public  headerText(WebDriver driver) {
		this.driver = driver;
	}
	
	public void paraTextOne(String[] args) {
		List<WebElement> getClass = driver.findElements(By.tagName("h3"));
		for(WebElement e : getClass) {
			String classValue = e.getText();
			if(classValue.equals("WHO WE ARE")) {
				System.out.print(true + classValue);
			}
		}
			}
	
		public void paraTextTwo(String[] args) {
			List<WebElement> getClass2 = driver.findElements(By.tagName("h3"));
			for(WebElement e : getClass2) {
				String classValue2 = e.getText();
				if(classValue2.equals("OUR SUCCESS STORY")) {
					System.out.print(true   +   classValue2);
				}
			}
				}
			public void paraTextThree(String[] args) {
				List<WebElement> getClass3 = driver.findElements(By.tagName("h3"));
				for(WebElement e : getClass3) {
					String classValue3 = e.getText();
					if(classValue3.equals("VISION AND MISSION")) {
						System.out.print(true   +   classValue3);
					}
				}
					}
				public void paraTextFour(String[] args) {
					List<WebElement> getClass4 = driver.findElements(By.tagName("h3"));
					for(WebElement e : getClass4) {
						String classValue4 = e.getText();
						if(classValue4.equals("OUR SERVICES")) {
							System.out.print(true   +   classValue4);
						}
						}
		}
		
	}
	

