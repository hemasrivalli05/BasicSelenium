package com.practice;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTabs_Mynthra_Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub4*/
		/*
		 * Flipkart - search product and click on 1st 5 mobiles (total 6 tabs will be
		 * there) switch to each tab and add any one of the product into the cart for
		 * remaining 5 winows, close them
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()=\"Mobiles\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"realme C51 (Mint Green, 64 GB)\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"realme P1 5G (Phoenix Red, 128 GB)\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"realme P1 5G (Peacock Green, 128 GB)\"]")).click();
//		driver.findElement(By.xpath("//a[text()=\"realme P1 Pro 5G (Phoenix Red, 256 GB)\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"realme P1 Pro 5G (Phoenix Red, 128 GB)\"]")).click();

		Set<String> windowid = driver.getWindowHandles();
		for (String win : windowid) {
			driver.switchTo().window(win);
			Thread.sleep(5000);
			if (driver.getTitle().equals("Realme C51 (Carbon Black, 64 GB)  (4 GB RAM)")) {

				driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
				break;

			}
			for (String win1 : windowid) {
				driver.switchTo().window(win1);
				if (driver.getTitle()
						.equals("realme P1 Pro 5G ( 128 GB Storage, 8 GB RAM ) Online at Best Price On Flipkart.com")) {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
					break;
				}
				// driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+
				// In9uk2\"]")).click();
			}
			for (String win2 : windowid) {
				driver.switchTo().window(win2);
				if (driver.getTitle()
						.equals("realme P1 5G ( 128 GB Storage, 6 GB RAM ) Online at Best Price On Flipkart.com")) {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
					break;
				}

			}
			for (String win3 : windowid) {
				driver.switchTo().window(win3);
				if (driver.getTitle().equals("Realme C51 (Carbon Black, 64 GB)  (4 GB RAM)")) {
					Thread.sleep(5000);
					driver.findElement(By.xpath("//button[@class=\"QqFHMw vslbG+ In9uk2\"]")).click();
					break;
				}

			}
			driver.quit();

		}
	}
}




//
//import java.time.Duration;
//import java.util.List;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WindowTabs_Mynthra_Flipkart {
//
//	public static void main(String[] args) throws InterruptedException {
//
////		WebDriver driver = new ChromeDriver(); 
////		driver.manage().window().maximize(); 
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
////	       
////	            // Myntra
////	    driver.get("https://www.myntra.com/");
////		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shirt");
////		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
////
////		WebElement product = driver.findElement(By.xpath("(//img[@title='Allen Solly Pure Cotton Custom Fit Opaque Printed Casual Shirt'])[1]"));
////		product.click();
////	    // Switch to the new tab
////	    String parentWindowMyntra = driver.getWindowHandle();
////	    Set<String> allWindowMyntraID = driver.getWindowHandles();
////	    allWindowMyntraID.remove(parentWindowMyntra);
////	           
////	    for (String windowID : allWindowMyntraID) {
////	         driver.switchTo().window(windowID);
//////	         driver.findElement(By.xpath("(//button[@class='size-buttons-size-button-selected size-buttons-size-button size-buttons-size-button-default'])[1]")).click();
////	         driver.findElement(By.xpath("(//button[contains(@class,'size-buttons-size-button-default')])[3]")).click();
////	         driver.findElement(By.xpath("(//div[normalize-space()='ADD TO BAG'])[1]")).click();
////	         driver.close();
////	    }
////	    driver.switchTo().window(parentWindowMyntra); // Switch back to the Myntra main window
////		driver.close();
////		
////		//flipkart
////		WebDriver driver = new ChromeDriver(); 
//////		driver.manage().window().maximize(); 
////		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
////		driver.get("https://www.flipkart.com/"); 
////		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER); 
////		 
////		List <WebElement> products = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
////
////		 for (int i = 1; i <= 5; i++) {
////			 products.get(i).click();
////             Thread.sleep(2000); // Wait for the tab to open
////         }
//////		// Switch to the new tab
////		    String parentWindowFlipkart = driver.getWindowHandle();
////		    Set<String> allWindows = driver.getWindowHandles();
////	 		System.out.println(allWindows);
////
////	 		allWindows.remove(parentWindowFlipkart);
////		    Thread.sleep(2000); // Wait for the tab to open
////
////		    for (String windowID : allWindows) {
////		         driver.switchTo().window(windowID);
////		         driver.switchTo().window(windowID);
////		         driver.switchTo().window(windowID);
////	             Thread.sleep(2000); // Wait for the tab to open
////
////		     
////
////		}
////		 
//		// Get all window handles
////         String parentWindow = driver.getWindowHandle();
////         Set<String> allWindows = driver.getWindowHandles();
//// 		System.out.println(allWindows);
//
////         // Switch to the first tab
////         String firstTab = null;
////         int tabIndex = 1;
////         for (String windowID : allWindows) {
////             if (!windowID.equals(parentWindow)) {
////         		System.out.println(windowID);
////                 driver.switchTo().window(windowID);
////          		System.out.println(windowID);
////
////                 if (tabIndex == 1) {
////                     firstTab = windowID;
////                     driver.switchTo().window(windowID);
////                     Thread.sleep(2000);
////                     System.out.println("On first tab");
////                 } else if (tabIndex == 2) {
////                     driver.switchTo().window(windowID);
////                	 Thread.sleep(2000);
////                     System.out.println("On second tab");
////                 } else if (tabIndex == 3) {
////                     driver.switchTo().window(windowID);
////                	 Thread.sleep(2000);
////                     System.out.println("On third tab");
////                     // Add product to cart on the third tab
//////                     try {
//////                         WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]"));
//////                         addToCartButton.click();
//////                         Thread.sleep(3000);  // Adjust the sleep time as necessary
//////                     } catch (Exception e) {
//////                         System.out.println("Failed to add product to cart.");
//////                     }
////                 }
////                 tabIndex++;
////             }
////         }
//
////         // Close all tabs except the parent and the first tab
////         allWindows = driver.getWindowHandles();
////         for (String windowID : allWindows) {
////             if (!windowID.equals(parentWindow) && !windowID.equals(firstTab)) {
////                 driver.switchTo().window(windowID);
////                 driver.close();
////             }
////         }
//	}
//
//}
