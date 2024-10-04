package com.learningWebDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Get_Method {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//call the method by using reference variables
		driver.get("https://www.facebook.com/");
		

	}

}
