package com.learning_Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Window_Popup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("dress", Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(@class,'LFEi7Z')])[2]")).click();
		
		//this is used to fetch parent windowID
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		//this is used to fetch all windowIDs
		Set<String> allWindowID = driver.getWindowHandles();
		System.out.println(allWindowID);
		//this is used to remove parent windowID from all windowIDs
		allWindowID.remove(parentWindowID);
		
		for(String windowID : allWindowID) {
			//this is used to switch to the chilWindow
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			String text = driver.findElement(By.xpath("//h1[contains(@class,'6EBuvT')]")).getText();
			System.out.println(text);
			driver.close();
		}
	 //this line will switch back the control to parent window
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
