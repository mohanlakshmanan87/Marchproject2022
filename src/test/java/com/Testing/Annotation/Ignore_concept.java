package com.Testing.Annotation;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	
	
	
	@Test(enabled=false)
	private void books() {
		System.out.println("Books");

	}
	
	@Ignore
	@Test(priority=1)
	 private void whatsapp() {
	System.out.println("Whatsapp");

	}
	
	@Test(priority=2)
	  private void instagram() {
	System.out.println("Instagram");

	}
	
	@Test(priority=-1)
	  private void spotify() {
		System.out.println("spotify");
	}
	
	@Test(priority=0)
	  private void wynkmusic() {
		System.out.println("Wynk Music");

	}
	  
	  
	  
 
}


