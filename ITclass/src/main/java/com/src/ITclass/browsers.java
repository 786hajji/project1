package com.src.ITclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\yusra\\eclipse-workspace\\ITclass\\src\\driver\\chromedriver.exe");
driver=new ChromeDriver();	
//driver.get("https://www.protrainingtech.com");	// to get to website 
driver.navigate().to("https://www.protrainingtech.com");  //get to website
driver.manage().window().maximize(); //makes your window fit the whole screen
Thread.sleep(6000);  // pauses for 6 seconds 
driver.navigate().back(); //go back a page 
Thread.sleep(6000);   //pauses for 6 seconds 
driver.navigate().forward(); //go to the next page
System.out.println(driver.getCurrentUrl());
String windowhandle=driver.getWindowHandle();
System.out.println(windowhandle);
	}

}
