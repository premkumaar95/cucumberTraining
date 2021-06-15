package com.t3resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import screenshot.takeScreenShot;
import scroll.scrollPage;
import testCases.aboutUs;
import testCases.enrollAndEnrquire;
import testCases.headerText;
import testCases.softwareDevelopment;
import testCases.softwareDevelopment1;
import testCases.softwareDevelopment2;

public class mainTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\premr\\OneDrive\\Desktop\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t3-resources.com");
		//screenshot
		takeScreenShot capture = new takeScreenShot(driver);
		scrollPage scroll = new scrollPage();
		
		//click about us
		aboutUs abt = PageFactory.initElements(driver, aboutUs.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		abt.aboutUsLink("ABOUT US");
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "aboutus.png");
		
		//checking paraText
		headerText ht = new headerText(driver);
		ht.paraTextOne(args);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Who are we.png");
		ht.paraTextTwo(args);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		scroll.scrollPageDown(driver);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Our Success Story.png");
		ht.paraTextThree(args);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		scroll.scrollPageDown(driver);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Vision and Mission.png");
		ht.paraTextFour(args);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		scroll.scrollPageDown(driver);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Our services.png");
		
		//Software Development
		softwareDevelopment sd = PageFactory.initElements(driver, softwareDevelopment.class);
		sd.courses("COURSES");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Software Devolopment.png");
		
		//Software Development1
		softwareDevelopment1 sd1 = new softwareDevelopment1();
		sd1.courses1("SOFTWARE DEVELOPMENT");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Software Devolopment1.png");
				
		//Software Development2
		softwareDevelopment2 sd2 = PageFactory.initElements(driver, softwareDevelopment2.class);
		sd2.courses2("JAVA");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "Software Devolopment2.png");
		
		//Verify Enroll and Enquire
		enrollAndEnrquire ee = PageFactory.initElements(driver, enrollAndEnrquire.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ee.verifyEnrollEnquire("Enroll and Enquire");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		capture.screenShots("C:\\Users\\premr\\OneDrive\\Desktop\\Java\\screenshots\\project one", "enrollAndEnrquire.png");
	}

}

