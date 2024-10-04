package com.test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Register_AbsolutePath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();//regester link page open
		
		//fetch the title 
		String carttitle = driver.getTitle();
		System.out.println(carttitle);
		
			// validation 
			if(carttitle.equals("Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com")) {
				System.out.println("welcome register page");
			}else {
				System.out.println("invalid cart ");
			}	
			Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input[1]")).click();//female gender
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[2]/input[1]")).sendKeys("first name hema");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[3]/input[1]")).sendKeys("last H12");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[2]/div[2]/div[4]/input[1]")).sendKeys("h13@gmail.com");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[1]/input[1]")).sendKeys("!h12pswd");
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/form[1]/div[1]/div[2]/div[3]/div[2]/div[2]/input[1]")).sendKeys("!h12pswd");
		 
		
	}

}

