package org.Bus;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;

public class Recaptcha {
	
  static WebDriver driver;	
	
    @Test
	public static void One() throws InterruptedException, AWTException, IOException, TesseractException  {
		
			
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https://2captcha.com/demo/recaptcha-v2");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"g-recaptcha\"]/div/div/iframe"));

		element.click();
		  
		 
		  
		  
		  
		  
		  
		  
		   

}
	
}
