package com.learningWebDriverMethod;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Manage_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.maximize();
		
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
		
	  int height = driver.manage().window().getSize().getHeight();
	  System.out.println(height);
      int width = driver.manage().window().getSize().getWidth();	
      System.out.println(width);
      
      int x_axis = driver.manage().window().getPosition().getX();
      System.out.println(x_axis);
      int y_axis = driver.manage().window().getPosition().getY();
      System.out.println(y_axis);
      
      driver.manage().window().maximize();
      int xm_axis = driver.manage().window().getPosition().getX();
      System.out.println(xm_axis);
      int ym_axis = driver.manage().window().getPosition().getY();
      System.out.println(ym_axis);
      
      driver.manage().window().fullscreen();
      int xf_axis = driver.manage().window().getPosition().getX();
      System.out.println(xf_axis);
      int yf_axis = driver.manage().window().getPosition().getY();
      System.out.println(yf_axis);
      
      driver.manage().window().minimize();
      int x1_axis = driver.manage().window().getPosition().getX();
      System.out.println(x1_axis);
      int y1_axis = driver.manage().window().getPosition().getY();
      System.out.println(y1_axis);
      
      
	}
	

}
