package org.Newtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebookloginsearch {
	
	WebDriver driver;
	
	public Facebookloginsearch(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	 By username = By.id("email");
	 
	 By password = By.id("pass");
	 
	 By login  = By.name("login");
	 
	 
	 public void searchfacebook(String userinput, String passwordinput) {
		
		 driver.findElement(username).sendKeys(userinput);
		 
		 driver.findElement(password).sendKeys(passwordinput);
		 
		 driver.findElement(login).click();

	}

}
