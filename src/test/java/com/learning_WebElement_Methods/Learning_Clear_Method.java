package com.learning_WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Clear_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		 WebElement searchtf = driver.findElement(By.id("small-searchterms"));
		 searchtf.sendKeys("books");
		Thread.sleep(2000);
		searchtf.clear();
		Thread.sleep(2000);
		 searchtf.sendKeys("mobile");
		Thread.sleep(2000);
		searchtf.clear();

		
//		driver.quit();


	}

}
