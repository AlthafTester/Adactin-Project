package com.baseclass.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserlaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\JKS\\eclipse-workspace\\Maven_Selenium_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("web", "path");
			driver = new FirefoxDriver();
		} else {
			System.out.println("INVALID BROWSER");
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendValues(WebElement element, String inputs) {
		element.sendKeys(inputs);
	}

	public static void delete(WebElement element) {
		element.clear();
	}

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}

	public static void actionsclick(WebElement element) {
		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void FrameByInt(int integer) {
		driver.switchTo().frame(integer);
	}

	public static void frameByString(String string) {
		driver.switchTo().frame(string);
	}

	public static void frameByWebelement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void defaultcontent() {
		driver.switchTo().defaultContent();
	}

	public static void screenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(path);
		FileUtils.copyFile(source, destination);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertSendValues(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	public static void robotDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void robotEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void windowHandleGetTitle() {
		Set<String> allid = driver.getWindowHandles();
		for (String id : allid) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println(title);
		}
	}

	public static void windowHandleActualTitle(String selectedtitle) {
		Set<String> allid = driver.getWindowHandles();
		String actualtitle = selectedtitle;
		for (String id : allid) {
			if (driver.switchTo().window(id).getTitle().contentEquals(actualtitle)) {
				break;
			}
		}
	}

	public static void multipleDropDown(WebElement element, int a, int b, int c) {
		Select s = new Select(element);
		List<WebElement> alloption = s.getOptions();
		int size = alloption.size();

		for (int i = 0; i < size; i++) {
			if (i == a || i == b || i == c) {
				s.selectByIndex(i);
			}
		}
	}

	public static void singleDropDownValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void singleDropDownInt(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void singleDropDownVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> alloption = s.getOptions();
		for (WebElement options : alloption) {
			System.out.println(options.getText());
		}
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println("is multiple" + multiple);
	}

	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);

		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselected : allSelectedOptions) {
			System.out.println(allselected.getText());
		}
	}

	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}

	public static void checkBox(WebElement element) {
		element.click();
	}

	public static void isEnabled(WebElement element) {
		System.out.println(element.isEnabled());
	}

	public static void isDisplayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}

	public static void isSelected(WebElement element) {
		System.out.println(element.isSelected());
	}

	public static void getTitle() {
		System.out.println(driver.getTitle());
	}

	public static void getCurrentUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void getAttribute(WebElement element, String attribute) {
		System.out.println(element.getAttribute(attribute));
	}

}
