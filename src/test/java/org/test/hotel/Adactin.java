package org.test.hotel;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin extends Baseclass{

	static LoginPojo lp;
	static Searchhotel sh;
	
	
	 @BeforeClass
	 public static void luanchBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\FrameWork\\Junit\\Junit\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
	}
	@AfterClass
	 public static void closeBrowser() {
		driver.close();
	}
	
	@Test
	public void login() {
		lp = new LoginPojo();
		fill(lp.getUsername(), "SurendranM");
		String uname = lp.getUsername().getAttribute("value");
		Assert.assertEquals("Username", "SurendranM", uname);
		fill(lp.getPassword(), "Sweetsure@25");
		String pwd = lp.getPassword().getAttribute("value");
		Assert.assertEquals("Password", "Sweetsure@25", pwd);
	}
	@Test
	public void loginBut() {
		buttonclick(lp.getBtnlogin());
	}
	
	@Test
	public void searchHotel() {
		 sh = new Searchhotel();
		 selectbyValue(sh.getLocation(), "Sydney");
		  
	}
	@Test
	public void searchBut() {
		 buttonclick(sh.getBtnsearch());
	}
	
	
	@Before
	public void startTime() {
		 Date d = new Date();
		 System.out.println(d);
	}
	@After
	public void EndTime() {
		 Date d = new Date();
		 System.out.println(d);
	}
	
}
