package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

class AmazonPageFactory {
	private String url= "https://www.Amazon.com/";
	private String Uname="83margaret@gmail.com";
	private String Upass="hridoy123";
	
	
	@FindBy(xpath="//*[@class='nav-a nav-a-2']")
	private WebElement ClickSignInButton;
	
	

	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement UNameBox;
	
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement UPassBox;
	

	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ClickSignIn;

	

	public String getUrl() {
		return url;
	}


	public String getUname() {
		return Uname;
	}


	public String getUpass() {
		return Upass;
	}


	public WebElement getClickSignInButton() {
		return ClickSignInButton;
	}


	

	public WebElement getUNameBox() {
		return UNameBox;
	}


	


	public WebElement getUPassBox() {
		return UPassBox;
	}


	public WebElement getClickSignIn() {
		return ClickSignIn;
	}


	
	
	
	}


