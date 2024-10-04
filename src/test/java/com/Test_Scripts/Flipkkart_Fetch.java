package com.Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkkart_Fetch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("dress", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'LFEi7Z')])[2]")).click();
		Thread.sleep(2000);
				
		WebElement name = driver.findElement(By.xpath("//h1[contains(@class,'6EBuvT')]"));
		Thread.sleep(2000);
		System.out.println(name.getText());
		Thread.sleep(2000);
		WebElement price = driver.findElement(By.xpath("//div[contains(@class,'CxhGGd')]"));
		System.out.println(price.getText());

	}

}
