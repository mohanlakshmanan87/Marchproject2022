package com.March.Baseclass;

import java.awt.AWTException;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base_Class {
	
	public static WebDriver driver;
	
	public static String value;
	
	  public static WebDriver browser_configuration(String type) {
		  
		 if(type.equalsIgnoreCase("chrome")) {
			 
		    System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			 
			driver = new ChromeDriver();
			 
		 }	 
		 
		  
		 else if(type.equalsIgnoreCase("firefox")) {
				 
			 System.setProperty("webdrivergecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
						 
		     driver = new FirefoxDriver();
						 
		}	  
		  
		  
		 driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 return driver;
		 
	  } 
		 
		 
		public  static void clickonElement(WebElement element) {
		
             element.click();
		} 
	
	
	     public static void inputvalueelement(WebElement element, String data) {
			
	    	 element.sendKeys(data);

		}
	
	
	    public static void getUrl(String url) {
			
	    	driver.get(url);

		}
	
	
	  public static void dropdown(String type, WebElement element,String value) {
		
	    try {
	    	
	    	Select s = new Select(element);
	    	
	    	if (type.equalsIgnoreCase("byvalue")) {
				
	    		s.selectByValue(value);
			}
	    	
	    	else if (type.equalsIgnoreCase("bytext")) {
	    		
	    		s.selectByVisibleText(value);
	    	}
				
		
	    	else if (type.equalsIgnoreCase("byindex")) {
	    		
	    		int index = Integer.parseInt(value);
	    		
	    		s.selectByIndex(index);
				
			}
	    	
	    }  catch (Exception e) {
		 e.printStackTrace();
	    	
		}

	}
	
	
	public static String particularData(String path, int row_Index,int cell_Index) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(row_Index);
		
		Cell cell = row.getCell(cell_Index);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			
			value = cell.getStringCellValue();
			
		}
		 
		 
		else if (cellType.equals(cellType.NUMERIC)) {
			
		double numericCellValue = cell.getNumericCellValue();
		
		int val = (int) numericCellValue;
		
		value = String.valueOf(val);
		
	}
		
		return value;
		
	}
	
	 public static void close() {
		 
		 driver.close();

	}
		
		
		
	
	
public static void  filehandler(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileHandler.copy(source,dest);
	}

	
public static void fileutils(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(source, dest);

	}

public static void navigate(String type ,String value) {
		if (type.equalsIgnoreCase("to")) {
			driver.navigate().to(value);
		}
		
		else if (type.equalsIgnoreCase("back")) {
			driver.navigate().back();	
		}
		
		else if (type.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
		}
		
		else if (type.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
	}

}		
		

public static void explicitwait(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


public static void implicitwait(int seconds, String type) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.valueOf(type));
		
	}


public static void action(String type , WebElement element) {
		Actions ac = new Actions(driver);
	if (type.equalsIgnoreCase("Click")) {
		ac.click(element).build().perform();
	}
	
	
	else if (type.equalsIgnoreCase("doubleclick")) {
		ac.doubleClick(element).build().perform();
	}
	
	
	else if (type.equalsIgnoreCase("rightclick")) {
		ac.contextClick(element).build().perform();
	}
	
	
	else if (type.equalsIgnoreCase("Move")) {
		ac.moveToElement(element).build().perform();
	}
	
  }

public static void robot(String type ,int values) throws AWTException {
		
		Robot r = new Robot();
		if(type.equalsIgnoreCase("Keypress")) {
			r.keyPress(values);
		}
		
		else if (type.equalsIgnoreCase("keyrelease")) {
			r.keyRelease(values);
		}
	}

public static void frame(WebElement element) {
		driver.switchTo().frame(element);
	}


public static void Default() {
		driver.switchTo().defaultContent();
	}


public static void Alert(String type) {
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}
		
		
		else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}


public static void ScrollbyElement(WebElement element ) {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", element);
}

public static void Webtablealldata(List<WebElement> element) {
	 
	 for (WebElement coloumtext : element) {
			String text = coloumtext.getText();
			System.out.println(text);
}
	 
}

public static void gettext(WebElement element) {
    String text = element.getText();
	System.out.println(text);
}	

}

