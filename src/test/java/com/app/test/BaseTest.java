package com.app.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class BaseTest 
{

	public AndroidDriver driver;
	
	@BeforeTest
	
	public void connectServer() throws MalformedURLException 
	{
		//Java
        File appDir = new File("/Users/mdhossain/eclipse-workspace/AppiumDemo/apps");
        File app = new File(appDir, "app-debug.apk");
        
        //Selenium
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        
        //Appium
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	/*@AfterTest
	public void tearDown()
	{
		driver.close();
	}*/
	
	
	
}
