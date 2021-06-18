package com.adactin.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public static WebDriver driver;

	public Select_Hotel(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(id = "continue")
	private WebElement continuebutton;

	public WebElement getContinuebutton() {
		return continuebutton;
	}
}
