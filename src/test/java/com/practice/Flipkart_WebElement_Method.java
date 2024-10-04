package com.practice;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_WebElement_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		search.click();
		search.sendKeys("oppo");
		Thread.sleep(2000);
		search.clear();
		search.sendKeys("real me");
		search.submit();
		
		WebElement product = driver.findElement(By.xpath("(//div[text()='realme 12x 5G (Twilight Purple, 128 GB)'])[2]"));
		System.out.println(product.getText());
		System.out.println(product.getTagName());
		System.out.println(product.getSize());
		System.out.println(product.getSize().getHeight());
		System.out.println(product.getLocation());
		System.out.println(product.getCssValue("font"));
		System.out.println(product.getRect());
		System.out.println(product.getRect().getWidth());
		System.out.println(product.getRect().getY());
		System.out.println(product.getAttribute("style xpath"));
		System.out.println(product.getAttribute("type"));
		System.out.println(product.getAttribute("class"));
		System.out.println(product.getAttribute("value"));
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
