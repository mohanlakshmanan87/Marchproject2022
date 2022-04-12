package com.Adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {

	
	public  WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	

	@FindBy(id="room_nos")
	private WebElement numberofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkindate;
	
	@FindBy(id="datepick_in")
	private WebElement checkoutdate;
	
	@FindBy(id="adult_room")
	private WebElement adultsperroom;
	
	@FindBy(id="child_room")
	private WebElement childperroom;
	
	
	@FindBy(id="Submit")
	private WebElement search;
	
	
	public SearchHotel(WebDriver driver2) {
		
	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
		
	}


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoomtype() {
		return roomtype;
	}


	public WebElement getNumberofrooms() {
		return numberofrooms;
	}


	public WebElement getCheckindate() {
		return checkindate;
	}


	public WebElement getCheckoutdate() {
		return checkoutdate;
	}


	public WebElement getAdultsperroom() {
		return adultsperroom;
	}


	public WebElement getChildperroom() {
		return childperroom;
	}


	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
