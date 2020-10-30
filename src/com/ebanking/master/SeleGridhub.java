package com.ebanking.master;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleGridhub {
	
	DesiredCapabilities Cap= null;

	public void SGd() throws MalformedURLException {
		
		Cap=new DesiredCapabilities();
		Cap.setBrowserName("firefox");
		Cap.setPlatform(Platform.WINDOWS);
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.84:4444/wd/hub"),Cap);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		
		
		

	}

}
