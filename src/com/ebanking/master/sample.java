package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class sample {
 LibraryA Lb=new  LibraryA(); 
	 
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  Lb.AdminLogin("Admin","M1ndq");
  }

  @AfterTest
  public void afterTest() {
	  Lb.Admlogout();
  }

  @BeforeSuite
  public void beforeSuite() {
	  Lb.OpenApp("http://122.175.8.158/ranford2");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  Lb.Appclose();
  }

}
