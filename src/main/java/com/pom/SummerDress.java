package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDress {
	
	
	public  WebDriver driver;
	
	@FindBy(xpath="(//*[@title='Printed Dress'])[6]//following::a[@title='Printed Summer Dress'][4]")
	private WebElement summerdress;
	
	@FindBy(id="quantity_wanted")
	private WebElement quantity;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="color_16")
	private WebElement color;
	
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addtoart;
	
	@FindBy(xpath="//*[@title='Continue shopping']")
	private WebElement continueshopping;
	
public SummerDress(WebDriver driver2) {
		
		this.driver= driver2;
		
		PageFactory.initElements(driver, this);
	}

public WebElement getSummerdress() {
	return summerdress;
}

public WebElement getQuantity() {
	return quantity;
}

public WebElement getSize() {
	return size;
}

public WebElement getColor() {
	return color;
}

public WebElement getAddtoart() {
	return addtoart;
}

public WebElement getContinueshopping() {
	return continueshopping;
}

	
	
	
	
	
	
	
	
	
	
	
	

}
