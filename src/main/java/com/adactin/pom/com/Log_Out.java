package com.adactin.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_Out {

	public static WebDriver driver;

	public Log_Out(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	}

	

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "logout")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
}
