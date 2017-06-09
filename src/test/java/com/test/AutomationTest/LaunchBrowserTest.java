package com.test.AutomationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowserTest {
@Test
public static void method(){
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://www.google.com");
	//test
}
}
