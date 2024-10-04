package com.practice;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker_Hidden_element {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to frame by webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("datepicker")).click();
		for (int i = 0; i < 12; i++) {
            driver.findElement(By.xpath("//a[@title='Prev']")).click();
		} 
            
            // Get today's date and format it to match the datepicker format
            LocalDate today = LocalDate.now();
            int dayOfMonth = today.getDayOfMonth();
            String dayString = String.format("%d", dayOfMonth);
            System.out.println(today);
            
            // Click on the specific day in the previous year
            driver.findElement(By.xpath("//a[text()='" + dayString + "']")).click();
            
        }
	}


