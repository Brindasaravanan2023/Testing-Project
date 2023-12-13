package org.Bus;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.asprise.ocr.Ocr;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;

public class Captcha {
	
static WebDriver driver;	
	
	@Test
	public static void One() throws InterruptedException, AWTException, IOException, TesseractException  {
			
		
		   WebDriverManager.firefoxdriver().setup();
		   driver = new FirefoxDriver();
		   driver.get("https://unifiedportal-mem.epfindia.gov.in/memberinterface/");
		   driver.manage().window().maximize();
		   
		   WebElement element1 = driver.findElement(By.id("userName"));
		   
		   element1.sendKeys("100785158079");
		   
		   WebElement element2 = driver.findElement(By.id("password"));
		   
		   element2.sendKeys("Nigaazhini@2023");
		   
		   WebElement imageelement = driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[1]/div[2]/div/div[2]"
		   		+ "/div/div[2]/form/div[4]/div[1]/div/span/img"));
		   
		   
		   File src = imageelement.getScreenshotAs(OutputType.FILE);
		   
          File des = new File ("E:\\Users\\AdminB\\eclipse-workspace\\Mavenproject5\\src\\test\\resources\\image\\captcha.png");
		   
		   FileUtils.copyFile(src, des);
		   
		    Ocr.setUp(); // one time setup
	     
	        Ocr ocr = new Ocr(); // create a new OCR engine
	     
		   ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
	     
 	      String s = ocr.recognize(new File[] {new File("E:\\Users\\AdminB\\eclipse-workspace\\Mavenproject5\\"
 	      		+ "src\\test\\resources\\image\\captcha.png")},
		    		 
    	    Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);
	     
       	     System.out.println("Result: " + s);
		    
       	     ocr.stopEngine();
		    
		  }
		
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// FileHandler.copy(src, new File(path));
//    
//    Thread.sleep(3000);
//   
//	ITesseract image = new Tesseract();
//	   
//	String imagetxt = image.doOCR(new File(path));
//	   
//    System.out.println(imagetxt);
//    
//    WebElement element3 = driver.findElement(By.xpath("//*[@id=\"captcha\"]"));
//
//    element3.sendKeys(imagetxt);
	
	
	
	
	
	
	
		
		   //BufferedImage image = ImageIO.read(new File("E:\\Users\\AdminB\\eclipse-workspace\\Mavenproject5\\"
		   		//+ "src\\test\\resources\\image\\captcha.png"));  
		   
		   
		   
		  
		  // String imageText = new Ocr().recognizeCharacters((RenderedImage) image);
		   

		    
		   
		    
	        
		
		   
		           
	   
  //  	  String captcha = imagetxt.split("below")[1].replaceAll("[^a-zA-z0-9]", "");
		   
     	  
  
    	
	   
 	   
    	   
}
	




