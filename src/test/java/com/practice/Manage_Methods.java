package com.practice;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
		//MANAGE-->OPTIONS-->WINDOWS(maximize, minimize, getsize{getheight, getwidth}, getposition{getx, gety} , fullscreen)
		//LONG METHOD TO CALL 
//		1.maximize
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
		//shortcut
//		2. GET POSITION(X AND Y)
		 int px = driver.manage().window().getPosition().getX();
		 System.out.println(px);
		 int py = driver.manage().window().getPosition().getY();
		 System.out.println(py);
		
		 Thread.sleep(2000);
		 
//		 3. FULLSCREEEN 
		 driver.manage().window().fullscreen();
		 
		 Thread.sleep(2000);

//		 4. MINIMIZE
		 driver.manage().window().minimize();
		 
		 Thread.sleep(2000);

//		 5. GET SIZE(HEIGHT AND WIDTH)
		 int sizeh = driver.manage().window().getSize().getHeight();
		 System.out.println(sizeh);
		 
		 int sizew = driver.manage().window().getSize().getWidth();
		 System.out.println(sizew);

	}

}
