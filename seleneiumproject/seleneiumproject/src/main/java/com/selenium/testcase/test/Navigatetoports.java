package com.selenium.testcase.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

import com.selenium.testcase.base.TestBaseclass;

public class Navigatetoports extends TestBaseclass{
	
	public void navigatetoport()  {
		webDriver.findElement(By.xpath("//a[@title=\"Explore\"]")).click();
		//Actions action=new Actions(webDriver);
		//WebElement w= webDriver.findElement(By.xpath("//a[@title=\"Explore\"]"));
		//action.moveToElement(w);
		//System.out.println("Check");
		//Thread.sleep(4000);
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.xpath("//div//li//a[.=\"Ports\" and @class=\"linkItem\"]")).click();
		
		
	}
	public void searchforport(String s) {
		WebElement place=webDriver.findElement(By.xpath("//input[@id=\"searchbar\"]"));
		place.sendKeys(s);
		webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		webDriver.findElement(By.xpath("//a[contains(@title,'"+s+"')]")).click();
		
		
		
		
		
		
	}

}
