package com.test1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_ManageMethods {

	public static void main(String[] args) {

//		1. flipkart application
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	//		a. maximize
			Options opt = driver.manage();
			Window win = opt.window();
			win.maximize();
			//b. GET SIZE(HEIGHT AND WIDTH)
	        Dimension sx = win.getSize();
	        System.out.println(sx.getHeight());
	        Dimension sy = win.getSize();
	        System.out.println(sy.getWidth());
	        //c. minimize
	        win.minimize();
			//d. GET POSITION(X AND Y)
			Point pos = win.getPosition();
			int ps = pos.getX();
			System.out.println(ps);
			Point posy = win.getPosition();
			int psy = posy.getX();
			System.out.println(psy);
	//		e. FULLSCREEN
			win.fullscreen();	
				
	//	2. zomato application
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://www.zomato.com/ncr");
		
	//		a. maximize
			Options optz = driver2.manage();
			Window winz = optz.window();
			winz.maximize();
			//b. GET SIZE(HEIGHT AND WIDTH)
	        Dimension sxz = winz.getSize();
	        System.out.println(sxz.getHeight());
	        Dimension syz = winz.getSize();
	        System.out.println(syz.getWidth());      		
			//c. GET POSITION(X AND Y)
			Point posz = winz.getPosition();
			int psz = posz.getX();
			System.out.println(psz);
			Point posyz = winz.getPosition();
			int psyz = posyz.getX();
			System.out.println(psyz);
			//d. FULLSCREEN
			winz.fullscreen();	
			//e. minimize
	        winz.minimize();
		}
	
}


