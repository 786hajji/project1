package com.src.ITclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeAmazon { private static WebDriver driver;
{
   @FindBy (xpath="//*[contains(text(),'Best Sellers')])[1]") WebElement signin;
   	
   public HomeAmazon(WebDriver driver) {
	   HomeAmazon.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   public void bestSellersClick() {
   
}
}
