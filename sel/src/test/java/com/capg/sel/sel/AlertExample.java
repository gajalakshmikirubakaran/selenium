package com.capg.sel.sel;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertExample {
	WebDriver driver;
	Logger logger = Logger.getLogger(AlertExample.class.getName());

	@Test
	public void ExampleForAlert() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\sri\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.109.2.81:4444/seleniumproject/pizza.html");
		//driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		/*driver.findElement(By.xpath("//button[@onclick="+"'alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		logger.info(alert.getText());
		alert.accept();*/
		//driver.findElement(By.name("q")).sendKeys("akalz");
		//driver.findElement(By.name("btnK")).click();
		/*driver.findElement(By.name("q")).sendKeys("charger");
		driver.findElement(By.className("vh79eN")).click();
		System.out.println("Done");
		logger.info("Hi");*/
		WebElement element=driver.findElement(By.id("sel"));
		Select se=new Select(element);
		se.selectByVisibleText("Tomato");
		se.selectByVisibleText("Panner");
		
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
		//System.out.println("You have selected ::"+ webElement.getText());
			logger.info(""+webElement.getText());
			
		}
				 
		logger.info("done");
	}
}
