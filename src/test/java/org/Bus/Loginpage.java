package org.Bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.TesseractException;

public class Loginpage {

	static WebDriver driver;

	@Test
	public static void One() throws InterruptedException, AWTException, IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https://bronze1.hcim.cloud/#/user/login");
		driver.manage().window().maximize();

		WebElement element1 = driver.findElement(By.id("email"));

		element1.sendKeys("test1996@mailinator.com");

		WebElement element2 = driver.findElement(By.id("password"));

		element2.sendKeys("Password@12345");
		
       WebElement element111 = driver.findElement(By.id("isRememberedDevice"));
		
		element111.click();
		
		Thread.sleep(3000);

		WebElement element3 = driver.findElement(By.xpath("//span[text()='Login']"));

		element3.click();

		Thread.sleep(10000);

		WebElement element4 = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/section/aside/div/div[2]/ul/li[3]/span/a"));

		element4.click();

		Thread.sleep(10000);

		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div[2]/main/section/"
				+ "div/div/div/div[1]/div/div[2]/div/div[2]/button/span"));

		element5.click();

		Thread.sleep(12000);

		WebElement element6 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/"
				+ "form/div[1]/div/div/div/div/div/div/div[2]/div/div/span"));

		Thread.sleep(10000);

		Actions actions = new Actions(driver);

		actions.moveToElement(element6);

		element6.click();

		Thread.sleep(5000);

		WebElement element7 = driver.findElement(By.xpath("//*[@id=\"name\"]"));

		element7.sendKeys("Vijay");

		Thread.sleep(5000);

		WebElement element8 = driver.findElement(By.id("employeeTypeId"));

		Actions actions1 = new Actions(driver);

		actions1.moveToElement(element8);

		element8.click();

		Thread.sleep(3000);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement element9 = driver.findElement(By.id("divisionId"));

		Actions actions2 = new Actions(driver);

		actions2.moveToElement(element8);

		element9.click();

		Thread.sleep(3000);

		WebElement element10 = driver.findElement(By.id("divisionId"));

		element10.sendKeys("QA Engineer");

		Thread.sleep(3000);

		Robot robot1 = new Robot();

		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);

		WebElement element11 = driver.findElement(By.id("levelId"));

		Actions actions3 = new Actions(driver);

		actions3.moveToElement(element11);

		element11.click();

		WebElement element12 = driver.findElement(By.id("levelId"));

		element12.sendKeys("Level 1");

		Thread.sleep(3000);

		Robot robot2 = new Robot();

		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);

		WebElement element13 = driver.findElement(By.id("location"));

		Actions actions4 = new Actions(driver);

		actions4.moveToElement(element13);

		element13.click();

		WebElement element14 = driver.findElement(By.id("location"));

		element14.sendKeys("IND");

		Thread.sleep(3000);

		Robot robot3 = new Robot();

		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);

		WebElement element15 = driver.findElement(By.id("shore"));

		Actions actions5 = new Actions(driver);

		actions5.moveToElement(element15);

		element15.click();

		Thread.sleep(3000);

		Robot robot4 = new Robot();

		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);

		WebElement element16 = driver.findElement(By.id("email"));

		Actions actions6 = new Actions(driver);

		actions6.moveToElement(element16);

		element16.click();

		WebElement element17 = driver.findElement(By.id("email"));

		element17.sendKeys("mernernorland@gmail.com");

		WebElement element18 = driver.findElement(By.id("address"));

		Actions actions7 = new Actions(driver);

		actions7.moveToElement(element18);

		element18.click();

		WebElement element19 = driver.findElement(By.id("address"));

		element19.sendKeys("Tn.IND");

		WebElement element20 = driver.findElement(By.id("phoneNo"));

		Actions actions8 = new Actions(driver);

		actions8.moveToElement(element20);

		element20.click();

		WebElement element21 = driver.findElement(By.id("phoneNo"));

		element21.sendKeys("7845726276");

		Thread.sleep(3000);

		WebElement element22 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/"
				+ "div[2]/div[2]/form/div[5]/div[2]/div/div[2]/div/div/div/div/div/div[2]/div/div/div"));

		Actions actions9 = new Actions(driver);

		actions9.moveToElement(element22);

		element22.click();

		Thread.sleep(10000);

		WebElement element23 = driver.findElement(By.xpath("//div[text()='ABC']"));

		element23.click();

		Thread.sleep(10000);

		WebElement element24 = driver.findElement(By.id("contractStartDate"));

		Actions actions10 = new Actions(driver);

		actions10.moveToElement(element24);

		element24.click();

		Thread.sleep(10000);

		WebElement element25 = driver.findElement(By.xpath("//div[text()='31']"));

		Actions actions11 = new Actions(driver);

		actions11.moveToElement(element25);

		element25.click();

		Thread.sleep(10000);

		WebElement element26 = driver.findElement(By.id("contractEndDate"));

		Actions actions12 = new Actions(driver);

		actions12.moveToElement(element26);

		element26.click();

		Thread.sleep(10000);

		WebElement element27 = driver.findElement(By.xpath("//div[text()='31']//following::div[52]"));

		Actions actions13 = new Actions(driver);

		actions13.moveToElement(element27);

		element27.click();

		Thread.sleep(10000);

		WebElement element28 = driver.findElement(By.id("staffCare"));

		Actions actions14 = new Actions(driver);

		actions14.moveToElement(element28);

		element28.click();

		Thread.sleep(10000);

		WebElement element29 = driver.findElement(By.id("staffCare"));

		element29.sendKeys("Test");

		Thread.sleep(10000);

		WebElement element30 = driver.findElement(By.id("contractorTypeId"));

		Actions actions15 = new Actions(driver);

		actions15.moveToElement(element30);

		element30.click();

		Thread.sleep(10000);

		Robot robot10 = new Robot();

		robot10.keyPress(KeyEvent.VK_ENTER);
		robot10.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);

		WebElement element31 = driver.findElement(By.id("salary"));

		Actions actions16 = new Actions(driver);

		actions16.moveToElement(element31);

		element31.click();

		Thread.sleep(10000);

		WebElement element32 = driver.findElement(By.id("salary"));

		element32.sendKeys("190");

	}

}
