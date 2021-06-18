package com.adactin.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {

	public static WebDriver driver;

	public Book_A_Hotel(WebDriver driver2) {
    this.driver = driver2;
    PageFactory.initElements(driver2, this);
	  }

	public static WebDriver getDriver() {
		return driver;
	}

	@FindBy(id = "first_name")
	private WebElement firstname;

	public WebElement getFirstname() {
		return firstname;
	}

	@FindBy(id = "last_name")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(id = "address")
	private WebElement billingaddress;

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	@FindBy(id = "cc_num")
	private WebElement creditcardnumber;

	public WebElement getCreditcardnumber() {
		return creditcardnumber;
	}

	@FindBy(id = "cc_type")
	private WebElement creditcardtype;

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement creditcardexpirymonth;

	public WebElement getCreditcardexpirymonth() {
		return creditcardexpirymonth;
	}

	@FindBy(id = "cc_exp_year")
	private WebElement creditcardexpiryyear;

	public WebElement getCreditcardexpiryyear() {
		return creditcardexpiryyear;
	}

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}

	@FindBy(id = "book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}

}
