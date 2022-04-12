package com.pagemanager;

import org.openqa.selenium.WebDriver;

import com.Adactin.pom.BookingHotel;
import com.Adactin.pom.LoginPage;
import com.Adactin.pom.Logout;
import com.Adactin.pom.RadioButton;
import com.Adactin.pom.SearchHotel;
import com.pom.Terms;

public class AdactPage_object_manager {
	

	public WebDriver driver;
	
	private	LoginPage login;
	
	private SearchHotel hotel;
	
	private RadioButton b;
	
	private BookingHotel book;
	
	private Logout l;
	
	
public AdactPage_object_manager(WebDriver driver2) {
			
			this.driver = driver2;
			
		}
		
    public LoginPage getLogin() {
    	
	if(login==null) {
			
			login = new LoginPage(driver);
		}
    	
	return login;
}

public SearchHotel getHotel() {
	
	if(hotel==null) {
		
		hotel = new SearchHotel(driver);
	}
	
	return hotel;
}

public RadioButton getB() {
	
	if(b==null) {
		
		b = new RadioButton(driver);
	}	
	
	
	return b;
}

public BookingHotel getBook() {
	
	if(book==null) {
		
		book = new BookingHotel(driver);
	}
	
	return book;
}

public Logout getL() {
	
	if(l==null) {
		
		l = new Logout(driver);
	}
	
	return l;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}







































