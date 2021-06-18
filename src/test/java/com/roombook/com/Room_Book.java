package com.roombook.com;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.com.Book_A_Hotel;
import com.adactin.pom.com.Booking_Confirmation;
import com.adactin.pom.com.Log_In;
import com.adactin.pom.com.Log_Out;
import com.adactin.pom.com.Search_Hotel;
import com.adactin.pom.com.Select_Hotel;
import com.baseclass.com.Base_Class;

public class Room_Book extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = browserlaunch("chrome");
		geturl("https://adactinhotelapp.com/");

		implicitwait();

		Log_In lg = new Log_In(driver);

		sendValues(lg.getUsername(), "JKSAlthaf");
		sendValues(lg.getPassword(), "35HA7L");
		clickOnElement(lg.getLogin());

		sleep(5000);

		Search_Hotel sh = new Search_Hotel(driver);

		singleDropDownValue(sh.getLocation(), "New York");
		singleDropDownValue(sh.getHotels(), "Hotel Sunshine");
		singleDropDownValue(sh.getRoomtype(), "Super Deluxe");
		singleDropDownValue(sh.getNo_of_rooms(), "1");
		delete(sh.getCheckin());
		sendValues(sh.getCheckin(), "11/06/2021");
		delete(sh.getCheckout());
		sendValues(sh.getCheckout(), "13/06/2021");
		singleDropDownValue(sh.getAdultperroom(), "1");
		singleDropDownValue(sh.getChildperroom(), "1");
		clickOnElement(sh.getSubmit());

		Select_Hotel sh1 = new Select_Hotel(driver);
		explicitwait(sh1.getRadiobutton());

		clickOnElement(sh1.getRadiobutton());
		clickOnElement(sh1.getContinuebutton());

		sleep(4000);

		Book_A_Hotel bh = new Book_A_Hotel(driver);

		sendValues(bh.getFirstname(), "JMD");
		sendValues(bh.getLastname(), "TESTER");
		sendValues(bh.getBillingaddress(), "No-007, washington Dc, new york, usa.");
		sendValues(bh.getCreditcardnumber(), "1234567887654321");
		singleDropDownValue(bh.getCreditcardtype(), "VISA");
		singleDropDownValue(bh.getCreditcardexpirymonth(), "11");
		singleDropDownValue(bh.getCreditcardexpiryyear(), "2022");
		sendValues(bh.getCvv(), "000");
		clickOnElement(bh.getBooknow());

		sleep(5000);

		Booking_Confirmation bc = new Booking_Confirmation(driver);

		clickOnElement(bc.getMyitinerary());

		sleep(5000);

		Log_Out lo = new Log_Out(driver);

		clickOnElement(lo.getLogout());

	}

}
