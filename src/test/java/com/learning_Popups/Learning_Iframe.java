package com.learning_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Iframe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to the frame by index
//		driver.switchTo().frame(0);
		
		//switch to frame by webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		driver.findElement(By.id("datepicker")).click();
//		driver.findElement(By.xpath("//iframe[@class='demo-frame']")).click();
//		Thread.sleep(2000);
	}

}
