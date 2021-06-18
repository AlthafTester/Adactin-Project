package com.adactin.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {

	public static WebDriver driver;

	public Booking_Confirmation(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	}

	

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "my_itinerary")
	private WebElement myitinerary;

	public WebElement getMyitinerary() {
		return myitinerary;
	}
}
