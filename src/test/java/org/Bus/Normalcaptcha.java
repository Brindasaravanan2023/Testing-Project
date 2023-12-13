package org.Bus;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.asprise.ocr.Ocr;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Normalcaptcha {

	static WebDriver driver;

	@Test
	public static void One() throws InterruptedException, AWTException, IOException, TesseractException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.get("https://2captcha.com/demo/normal");
		driver.manage().window().maximize();

		WebElement captchaImage = driver.findElement(By.xpath("//img[@alt='normal captcha example']"));

		Thread.sleep(3000);

		File src = captchaImage.getScreenshotAs(OutputType.FILE);

		File des = new File(
				"E:\\Users\\AdminB\\eclipse-workspace\\Mavenproject5\\src\\test\\resources\\image\\captcha.png");

		FileUtils.copyFile(src, des);

		// Create the instance of OCR Engine
		Ocr ocr = new Ocr();

		// Start OCR Engine
		ocr.startEngine("eng", Ocr.SPEED_FASTEST);

		// path of the image
		String getText = ocr.recognize(
				new File[] { new File("E:\\Users\\AdminB\\eclipse-workspace\\Mavenproject5\\"
						+ "src\\test\\resources\\image\\captcha.png") },

				Ocr.RECOGNIZE_TYPE_ALL, Ocr.OUTPUT_FORMAT_PLAINTEXT);

		// Print the text
		System.out.println(getText);

		// Stop OCR engine
		ocr.stopEngine();

	}

}
