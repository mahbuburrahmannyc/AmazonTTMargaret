package com.genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GenereicClass {
	
	WebDriver driver;
	AmazonPageFactory pf;
	
	
	
	public void getSetup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\glori\\Downloads\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		pf=PageFactory.initElements(driver,AmazonPageFactory.class);
		driver.getUrl();
		driver.manage().window().maximize();
		
	}
public void signIn() {
	pf.getClickSignButton().click();
	pf.getUNameBox().sendKeys(pf.getUName());
	pf.getUPassBox().sendKeys(pf.getUPass());
	pf.getclickSignIn().click();
}
}
