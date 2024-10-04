package com.practice;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods_prac {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");
		
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);

		nav.forward();
		Thread.sleep(2000);

		nav.refresh();
	
		Navigation strurl = driver.navigate();
		strurl.to("https://placements.qspiders.com/");
		
	}

}
