package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCurrentUrl_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//method to fetch the url 
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
		 if(currenturl.equals("https://www.facebook.com/")){
			 System.out.println("valid url");
		 }else 
			 System.out.println("invalid url");
				 				 
	}

}
