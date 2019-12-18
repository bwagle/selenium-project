package com.selenium.testcase.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseclass {
	public static WebDriver webDriver;


	public void setup() {

		
		    
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wagle\\Desktop\\webdriver\\chromedriver.exe");
			webDriver = new ChromeDriver();
     		webDriver.manage().window().maximize();
//	        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		
			//System.out.println("Please enter valid value");

		
	}

}
