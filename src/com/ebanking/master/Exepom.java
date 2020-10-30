package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exepom {
	
	@Test
	public void pom() throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2");
	    driver.switchTo().alert().accept();

		
		//pagefactory
		
		RanHomePage RHP=PageFactory.initElements(driver,RanHomePage.class);
		RHP.login();
		AdminHp AHP=PageFactory.initElements(driver,AdminHp.class);
		AHP.Br();
		BranchDl BD=PageFactory.initElements(driver,BranchDl.class);
		//Calling method
		BD.Nb();
		BranchCr BC=PageFactory.initElements(driver,BranchCr.class);
		BC.Bcr();
		
	}

}
