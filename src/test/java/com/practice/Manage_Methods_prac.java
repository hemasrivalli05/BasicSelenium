package com.practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Methods_prac {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		
//		1.maximize
		Options opt = driver.manage();
		Window win = opt.window();
		win.maximize();
		
//		2. GET SIZE(HEIGHT AND WIDTH)
        Options mg = driver.manage();
        Window mw = mg.window();
        Dimension sx = mw.getSize();
        System.out.println(sx.getHeight());
        
        Options mgy = driver.manage();
        Window mwy = mgy.window();
        Dimension sy = mwy.getSize();
        System.out.println(sy.getWidth());
        		
//		3. minimize
		Options opt1 = driver.manage();
		Window winm = opt.window();
		winm.minimize();
		
//		4. GET POSITION(X AND Y)
		Options op = driver.manage();
		Window pw = op.window();
		Point pos = pw.getPosition();
		int ps = pos.getX();
		System.out.println(ps);
		Options op1 = driver.manage();
		Window pwy = op1.window();
		Point posy = pwy.getPosition();
		int psy = posy.getX();
		System.out.println(psy);
		
//		5. FULLSCREEN
		Options mf = driver.manage();
		Window fw = mf.window();
		fw.fullscreen();	
	}
}
