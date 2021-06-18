package com.adactin.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;

	public Search_Hotel(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(id = "hotels")
	private WebElement hotels;

	public WebElement getHotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private WebElement roomtype;

	public WebElement getRoomtype() {
		return roomtype;
	}

	@FindBy(xpath = "//select[@id = 'room_nos']")
	private WebElement no_of_rooms;

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	@FindBy(id = "datepick_in")
	private WebElement checkin;

	public WebElement getCheckin() {
		return checkin;
	}

	@FindBy(id = "datepick_out")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(id = "adult_room")
	private WebElement adultperroom;

	public WebElement getAdultperroom() {
		return adultperroom;
	}

	@FindBy(id = "child_room")
	private WebElement childperroom;

	public WebElement getChildperroom() {
		return childperroom;
	}

	@FindBy(id = "Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
	}

}
