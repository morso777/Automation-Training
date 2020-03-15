package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends Base{
	
	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By userLocator= By.name("userName");
	By passLocator= By.name("password");
	By signInBtnLocator= By.name("login");
	By homePageLocator= By.xpath("//");
	
	
	
	public void signIn () {
		if(isDisplayed (userLocator)) {
			type ("qualityadmin", userLocator);
			type("pass1",passLocator);
			click(signInBtnLocator);
		}else{
		System.out.println("username textbox was not present");
		}
	}
	public boolean isHomePageDisplayed() {
		return isDisplayed (homePageLocator);
	}
}
	
