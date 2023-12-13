package org.redbus;

import java.awt.AWTException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTble {
	
static WebDriver driver;
	
	
	@Test
	public static void One() throws InterruptedException, AWTException {
	
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://cosmocode.io/automation-practice-webtable/");
	   driver.manage().window().maximize();
	   
	    List<WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr"));
	    
	    System.out.println(rowelement.size());
	    
	    int rowsize = rowelement.size();
	    
	    
	    List<WebElement> coloumelement = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr[1]/td"));
	   
	    System.out.println(coloumelement.size());
	    
	    int columsize = coloumelement.size();
	    
	 
	    
	    for (int i = 1; i <= rowsize; i++) { //row
	    	
	    	for (int j = 1; j <= columsize; j++) { //coloum 
	    		
	    		System.out.println(driver.findElement(By.xpath("//*[@id=\"countries\"]/tbody/tr[" + i + "]/td[" + j + "]")).getText());
	    		
				
			}
			
		}
	    
	    
	    

}

}
