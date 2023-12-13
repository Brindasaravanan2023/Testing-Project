package org.Bus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Onlinenew {

	static WebDriver driver;

	@Test
	public static void One() throws InterruptedException, AWTException, IOException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https://qa-hrcpatientpay.kernernorland.com/#/checkout/guarantor/"
				+ "3561?token=$2b$10$jyNCEbSFW/ljRpmyo0sGR.HAtN0G7x.fBCOGY38g4kixCEMDKjUju&sessionId=409");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/"
				+ "div/div/div[2]/div/div/div/form/div[1]/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[7]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/input"));

		Actions action = new Actions(driver);

		action.moveToElement(element1).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();

		element1.sendKeys("1");

		Thread.sleep(3000);

		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/"
				+ "div/div/div[2]/div/div/div/form/div[1]/div/div/div/div/div/div/div/div/div/div/table/tbody/tr[3]/td[7]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div[2]/input"));

		Actions action1 = new Actions(driver);

		action1.moveToElement(element2).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();

		element2.sendKeys("1");

		Thread.sleep(3000);

		WebElement element3 = driver.findElement(By.xpath("//button[text()='Pay using instalments']"));

		element3.click();

		Robot robot = new Robot();

		for (int i = 1; i <= 10; i++) {

			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

		}

		Thread.sleep(3000);

		WebElement element4 = driver.findElement(By.xpath("//div[@class='insta-options-header'][1]"));

		element4.click();

		Thread.sleep(3000);

		Robot robot1 = new Robot();

		for (int i = 1; i <= 40; i++) {

			robot1.keyPress(KeyEvent.VK_DOWN);
			robot1.keyRelease(KeyEvent.VK_DOWN);

		}
		Thread.sleep(3000);

		WebElement element5 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/"
				+ "div/div/div[2]/div/div/div/div/div[3]/div/label/span/input"));

		element5.click();

		Thread.sleep(3000);

		WebElement element6 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/div[2]/div[1]/"
				+ "div/div/div[2]/div/div/div/div/div[3]/button"));

		element6.click();

		Thread.sleep(12000);

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='sq-card-component']")));

		Thread.sleep(3000);

		WebElement element7 = driver.findElement(By.xpath("//input[@id='cardNumber']"));

		element7.sendKeys("111111111111");

		Thread.sleep(3000);

		WebElement element8 = driver.findElement(By.xpath("//*[@id=\"expirationDate\"]"));

		element8.sendKeys("1212");

		Thread.sleep(3000);

		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"cvv\"]"));

		element9.sendKeys("123");

		driver.switchTo().defaultContent();

		Thread.sleep(3000);

		WebElement element10 = driver.findElement(By.xpath("//*[@id=\"rswps-form\"]/input"));

		element10.sendKeys("test1@gmail.com");

		Thread.sleep(3000);

		WebElement element11 = driver.findElement(By.xpath("//*[@id=\"rswp-card-button\"]"));

		element11.click();

	}

}
