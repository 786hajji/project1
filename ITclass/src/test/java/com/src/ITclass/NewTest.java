package com.src.ITclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;

public class NewTest{
 
  
  private RemoteWebDriver driver;



@BeforeTest    //before method runs one test cases at a time
  public void beforeTest() throws InterruptedException {
      System.out.println("this is befire Test");
	
      String brow="chrome"
      
    if (brow.contains("chrome")) {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yusra\\eclipse-workspace\\ITclass\\src\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();	
}
	 else if (brow.contains("firefox")) {
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\yusra\\eclipse-workspace\\ITclass\\src\\driver\\geckodriver.exe");
		driver=new FirefoxDriver();	
	 }
	 else { 
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\yusra\\eclipse-workspace\\ITclass\\src\\driver\\msedgedriver.exe");
			driver=new EdgeDriver();	
	 }
		driver.get("https://www.amazon.com");	// to get to website 
		//driver.navigate().to("https://www.amazon.com");  //get to website
		driver.manage().window().maximize(); //makes your window fit the whole screen
		Thread.sleep(5000);
  }



@Test
  public void Test1() {
	System.out.println("this is test 1");

HomeAmazon ob= new HomeAmazon(driver);
ob.bestSellersClick();
Thread.setDefaultUncaughtExceptionHandler(null);

}



@Test
public void Test2() {
	System.out.println("this is test 2");
}



  @AfterTest    //aftermethod runs every test one at a time
  public void afterTest() throws InterruptedException{
	  System.out.println("this is aftertest");
	  Thread.sleep(5000);
	  driver.close();
  }

}
