package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {


	public  WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
    @FindBy(id="cc_num")
	private WebElement creditcardno;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(xpath="(//input[@class='reg_input'])[4]")
	private WebElement cvvno;
	
	@FindBy(id="book_now")
	private WebElement booking;
	
	
	
	public BookingHotel(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}



	public WebElement getFname() {
		return fname;
	}



	public WebElement getLname() {
		return lname;
	}



	public WebElement getAddress() {
		return address;
	}



	public WebElement getCreditcardno() {
		return creditcardno;
	}



	public WebElement getCardtype() {
		return cardtype;
	}



	public WebElement getMonth() {
		return month;
	}



	public WebElement getYear() {
		return year;
	}



	public WebElement getCvvno() {
		return cvvno;
	}



	public WebElement getBooking() {
		return booking;
	}
	
	
	
	
	
	
	
	
}
