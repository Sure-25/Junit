package org.test.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	static WebDriver driver;
	
	public static void luanch() {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	//get
	public static void luanchURL(String url) {
		driver.get(url);
	}
	//find element by id
	public static WebElement findid(WebElement w,String s) {
		return driver.findElement(By.id(s));
	}
	//find element by name
	public static WebElement findname(WebElement w,String s) {
		return driver.findElement(By.name(s));
	}
	//find element by name
	public static WebElement findclassname(WebElement w,String s) {
		return driver.findElement(By.className(s));
	}
	//xpath
	public static WebElement xpath(WebElement w,String s) {
		return driver.findElement(By.xpath(s));
	}
	//fill
	public static void fill(WebElement w,String v) {
		 w.sendKeys(v);
	}
	//button
	public static void buttonclick(WebElement btn) {
		btn.click();
	}
	//Quit
	public static void quitBrowser() {
		driver.quit();
	}
	//close
	public static void closeBrowser() {
		driver.quit();
	}
	//select by index
	public static void selectbyIndex(WebElement w,int v) {
		Select s = new Select(w);
		s.selectByIndex(v);
	}
	//select by value
	public static void selectbyValue(WebElement w,String v) {
		Select s = new Select(w);
		s.selectByValue(v);
	}
	//select by visible Text
	public static void selectbyVisibletext(WebElement w,String v) {
		Select s = new Select(w);
		s.selectByVisibleText(v);
	}

	
	
}
