package com.src.ITclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ilocators {
private static final String CreateAccount = null;
static WebDriver driver; 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yusra\\eclipse-workspace\\ITclass\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();	
		//driver.get("https://www.protrainingtech.com");	// to get to website 
		driver.navigate().to("https://www.facebook.com");  //get to website
		driver.manage().window().maximize(); //makes your window fit the whole screen
		Thread.sleep(6000);
		/*//WebElement Portfolio=driver.findElement(By.id("menu-item-7300"));
		//Portfolio.click();
		//String Youraccount; 
		//WebElement Youraccount11=driver.findElement(By.linkText("Your Account"));// for any links a or aherf
		//Youraccount11.click();
		WebElement Create1kAccount=driver.findElement(By.partialLinkText("Create new"));
		Create1kAccount.click();
		Thread.sleep(6000);
		WebElement names = driver.findElement(By.name("firstname"));
		names.sendKeys("ali");
		WebElement lastnames= driver.findElement(By.name("lastname"));
		lastnames.sendKeys("Khan");
		WebElement email=driver.findElement(By.name("reg_email__"));
		email.sendKeys("akhan");
		WebElement password=driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("*****");
		WebElement bithwk=driver.findElement(By.name("birthday_month"));
		Select ob=new Select(bithwk);
		ob.selectByValue("8");
		WebElement month=driver.findElement(By.name("birthday_day"));
		Select ob1=new Select(month);
		ob1.selectByValue("8");
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select ob11=new Select(year);
		ob11.selectByValue("2000");
		Thread.sleep(10000);
		driver.close();
		driver.findElement(By.xpath("//*[@id="Email"]"));/*
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yusra\\eclipse-workspace\\ITclass\\src\\driver\\chromedriver.exe");
		driver=new ChromeDriver();	
		//driver.get("https://www.protrainingtech.com");	// to get to website 
		driver.navigate().to("https://www.facebook.com");  //get to website
		driver.manage().window().maximize(); //makes your window fit the whole screen
		Thread.sleep(6000);*/
		
		
		//Xpath is very specific 
		 //WebElement First_name= driver.findElement(By.xpath("//*[@name='firstname']"));
		 //First_name.sendKeys("ALi");
		
		 
	}

}
