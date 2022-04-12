package com.pagemanager;

import org.openqa.selenium.WebDriver;

import com.pom.BacktoOrder;
import com.pom.ConfirmOrder;
import com.pom.Dresses;
import com.pom.Login_Page;
import com.pom.PayBank;
import com.pom.Proceed_1;
import com.pom.Proceed_2;
import com.pom.Proceed_3;
import com.pom.Signout;
import com.pom.SummerDress;
import com.pom.Terms;
import com.pom.Tshirts;
import com.pom.ViewMyCart;
import com.pom.Women;


public class Page_object_Manager {

	
    public WebDriver driver;
	
	private Login_Page login;
	
	private Women w;
	
	private SummerDress s;
	
	private ViewMyCart view;
	
	private Proceed_1 p1;
	
	private Proceed_2 p2;
	
	private Terms t;
	
	private Proceed_3 p3;
	
	private PayBank pay;
	
	private ConfirmOrder c; 
	
	private BacktoOrder b;
	
	private Signout s1;
	
	private Dresses d;
	
	private Tshirts ts;
	
	
public Page_object_Manager(WebDriver driver2) {
		
		this.driver = driver2;
	}
	
	
	public Login_Page getLogin() {
		
		if(login==null) {
		
			login = new Login_Page(driver);
			
		}
		
		
		return login;
	}

	public Women getW() {
		
	
		if(w==null) {
			
			w = new Women(driver);
		}
		
		return w;
	}

	public SummerDress getS() {
		
		if(s==null) {
			
			s = new SummerDress(driver);
		
		}
		return s;
	}

	public ViewMyCart getView() {
		
		
		if(view==null) {
			
			view = new ViewMyCart(driver);
		}
		return view;
	}

	public Proceed_1 getP1() {
		
		if(p1==null) {
			
			p1 = new Proceed_1(driver);
		}
		
		return p1;
	}

	public Proceed_2 getP2() {
		
		if(p2==null) {
			
			p2 = new Proceed_2(driver);
		}
		return p2;
	}

	public Terms getT() {
		
		if(t==null) {
			
			t = new Terms(driver);
		}
		
		return t;
	}

	public Proceed_3 getP3() {
		
		if(p3==null) {
			
			p3 = new Proceed_3(driver);
		}
		  return p3;
	}

	public PayBank getPay() {
		
		if(pay==null) {
			
			pay= new PayBank(driver);
		}
		
		return pay;
	}

	public ConfirmOrder getC() {
		
	
		if(c==null) {
			
			c = new ConfirmOrder(driver);
		
		}
		return c;
	}

	public BacktoOrder getB() {
		
		if(b==null) {
			
			b = new BacktoOrder(driver);
		}
		return b;
	}

	public Signout getS1() {
		
		if(s1==null) {
			
			s1 = new Signout(driver);
		}
		return s1;
	}

	
public Dresses getD() {
		
		if(d==null) {
			
			d = new Dresses(driver);
		}
		return d;
	}

public Tshirts getTs() {
	
	if(ts==null) {
		
		ts = new Tshirts(driver);
	}
	return ts;
}

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
