package com.Test_Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Search_Filter_SS {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("dress", Keys.ENTER);
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[1]"));
		Select selmin = new Select(dropdown);
		selmin.selectByValue("500");
		Thread.sleep(2000);
		
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[@class='Gn+jFg'])[2]"));
		Select selmax = new Select(dropdown2);
		selmax.selectByValue("1500");
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);//it is in RAM
		File minmax = new File("./screenshots/flipkart-Page.png");
		FileHandler.copy(src, minmax);
				
		Thread.sleep(2000);
		driver.quit();	
		
	}

}
