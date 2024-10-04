package com.Test_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_fetch {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		search.click();
		search.sendKeys("kurtis", Keys.ENTER);
		Thread.sleep(2000);
		WebElement product = driver.findElement(By.xpath("//li[@id='29314216']//a[@data-refreshpage='true']"));
		System.out.println(product.getText());
	}

}
