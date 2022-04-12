package com.Testing.Annotation;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Groups_concept {
	

	@Test(priority=-1,groups="Books")
	private void books() {
		System.out.println("Books");

	}
	
	
	@Test(priority=-5,groups="Social Media")
	 private void whatsapp() {
	System.out.println("Whatsapp");

	}
	
	@Test(priority=1,groups="Social Media")
	  private void instagram() {
	  System.out.println("Instagram");

	}
	
	@Test(priority=5,groups="Music")
	  private void spotify() {
		System.out.println("spotify");
	}
	
	@Test(priority=-3,groups="Music")
	  private void wynkmusic() {
		System.out.println("Wynk Music");

	}
	  
	  

}
