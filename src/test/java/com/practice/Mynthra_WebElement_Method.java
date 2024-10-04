package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mynthra_WebElement_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.click();
		search.sendKeys("real me");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).clear();

		//search.clear();// this is not working
//		search.sendKeys("specs");
//		search.submit();//this is not working

//		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).clear();
//		driver.findElement(By.xpath("//a[@class='desktop-submit']")).clear();
		Thread.sleep(2000);
//		search.sendKeys("specs");
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("specs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		
		WebElement product = driver.findElement(By.xpath("(//li[@class='product-base'])[6]"));
		System.out.println(product.getText()+ "text1");
		System.out.println(product.getTagName()+ "text2");
		System.out.println(product.getSize()+ "text3");
		System.out.println(product.getSize().getHeight()+ "text4");
		System.out.println(product.getLocation()+ "text5");
		System.out.println(product.getCssValue("font")+ "text6");
		System.out.println(product.getRect()+ "text7");
		System.out.println(product.getRect().getWidth()+ "text8");
		System.out.println(product.getRect().getY()+ "text9");
		System.out.println(product.getAttribute("style xpath")+ "text10");
		System.out.println(product.getAttribute("type")+ "text11");
		System.out.println(product.getAttribute("class")+ "text12");
		System.out.println(product.getAttribute("value")+ "text13");
		
		Thread.sleep(2000);
//		driver.quit();
		
	}

}
