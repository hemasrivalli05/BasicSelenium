package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetTitle_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//fetch the title 
		String title = driver.getTitle();
		System.out.println(title);

		// validation purpose
		if(title.equals("Facebook - log in or sign up")) {
			System.out.println("welcome");
		}else {
			System.out.println("invalid");
		}
		
	}

}
