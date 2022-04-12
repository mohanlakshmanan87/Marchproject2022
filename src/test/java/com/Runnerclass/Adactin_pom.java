package com.Runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Adactin.pom.BookingHotel;
import com.Adactin.pom.LoginPage;
import com.Adactin.pom.Logout;
import com.Adactin.pom.RadioButton;
import com.Adactin.pom.SearchHotel;
import com.March.Baseclass.Base_Class;
import com.pom.Login_Page;

public class Adactin_pom extends Base_Class{
	
	public static WebDriver driver = browser_configuration("chrome");
	
	public static LoginPage login= new LoginPage(driver);
	
	public static SearchHotel hotel= new SearchHotel(driver);
	
	public static RadioButton b = new RadioButton(driver);

	public static BookingHotel book = new BookingHotel(driver);
	
	public static Logout l = new Logout(driver);
	
	public static void main(String[] args){
		
	getUrl("https://adactinhotelapp.com/");
		
       //username
		inputvalueelement(login.getUsername(),"maddymohan");
	
	   //password
	     inputvalueelement(login.getPassword(), "tendulkar@200");
	    
	    //login
	      clickonElement(login.getlogin());
	    
	   //Select location
         dropdown("byindex", hotel.getLocation(), "1");
		
		//select Hotel
		dropdown("byindex", hotel.getHotel(), "2");

		// selectRoom type
		dropdown("bytext", hotel.getRoomtype(), "Deluxe");
		
		// No.of rooms
		dropdown("byvalue", hotel.getNumberofrooms(), "5");
		
		// Checkindate
		inputvalueelement(hotel.getCheckindate(), "16/02/2022");
		
       // Checkoutdate
	    inputvalueelement(hotel.getCheckoutdate(), "17/02/2022");
		
		//Adults per Room
        dropdown("byvalue", hotel.getAdultsperroom(), "2");			
			
		//Child per Room
        dropdown("byindex", hotel.getChildperroom(), "1");			
	
	   // Search
		clickonElement(hotel.getSearch());
		
		//select radiobution
		clickonElement(b.getRadiobutton());
		
		// continue
	    clickonElement(b.getNext());
		
        //Firstname
        inputvalueelement(book.getFname(), "Mono");
        
        //Lastname
        inputvalueelement(book.getLname(), "Mohan");
        
        //Address
        inputvalueelement(book.getAddress(), "No.504,cross street,t.nagar,chennai600087");
        
        //CreditCard number
        inputvalueelement(book.getCreditcardno(), "1234554321678909");
        
		//Credit Card Type
         dropdown("byindex", book.getCardtype(), "2");	
   
        // CC Expiry month
         dropdown("bytext", book.getMonth(), "October");
			
        // CC Expiry Year
         dropdown("bytext", book.getYear(), "2022");
	
		// Card CVV NO
        inputvalueelement(book.getCvvno(), "985");
		
		// Booking
        clickonElement(book.getBooking());
		
		// Logout
	    clickonElement(l.getLogout());
		
	
	}
}	
	   
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


