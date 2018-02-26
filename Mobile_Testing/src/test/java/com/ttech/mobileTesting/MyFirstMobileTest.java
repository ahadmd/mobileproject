package com.ttech.mobileTesting;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

    public class MyFirstMobileTest {
    @Test
	public  void test1() throws MalformedURLException {
    	
    	File f = new File("src");
    	File fs = new File(f, "ApiDemos-debug.apk");
    	
	DesiredCapabilities cap= new DesiredCapabilities();  // this is Selenium package (DesiredCapabilities) class must create object
    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AhadEmulator");
    
    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
    
    AndroidDriver <AndroidElement> driver = new AndroidDriver<> ( new URL("http://127.0.0.1:4723/wd/hub"),cap);
    
    
    
    
    
    
	}}