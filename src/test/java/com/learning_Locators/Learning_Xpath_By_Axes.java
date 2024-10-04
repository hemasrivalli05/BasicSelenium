package com.learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Xpath_By_Axes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("samsung galaxy s24");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		WebElement namep = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24+ 5G (Cobalt Violet, 256 GB)']"));
		WebElement price = driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S24+ 5G (Cobalt Violet, 256 GB)']/ancestor::a/descendant::div[contains(@class,'DiR')]"));
		System.out.println(namep.getText());
		System.out.println(price.getText());


	}

}
