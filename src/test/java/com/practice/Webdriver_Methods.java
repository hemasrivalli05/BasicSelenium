package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {
		
		//1. GET METHOD
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//2.GET CURRENT URL
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		//validate
		if (currenturl.equals("https://www.facebook.com/")) {
			System.out.println("valid");
		}else 
				System.out.println("invlid");
			
		//3. GET TITLE 
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook - log in or sign up")) {
			System.out.println("valid title");
		}else
			System.out.println("invalid title");
		
		//4. GET PAGE SOURCE
		String source = driver.getPageSource();
		System.out.println(source);
		
		Thread.sleep(2000);//wait for 2 sec ;to slow and able to see the action
		
		//5. CLOSE
		driver.close();
	
	}

}
