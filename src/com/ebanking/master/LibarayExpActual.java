package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LibarayExpActual {
	 
	 WebDriver driver;
     public void OpenApp(String Url) {
     driver = new FirefoxDriver();
  
    	          
    	      
     driver.get(Url);
     driver.manage().window().maximize();
    	
    }  
        public void AdminLogin(String UserName,String Password) throws InterruptedException {
    
    	driver.findElement(By.id("txtuId")).sendKeys(UserName);
	    driver.findElement(By.name("txtPword")).sendKeys(Password);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    }  
    
        public void Branches(String Bname,String add,String zip,String Country,String State,String City) throws InterruptedException {
        	
          driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
   	     
  	      driver.findElement(By.name("BtnNewBR")).click();
  	      
  	      driver.findElement(By.name("txtbName")).sendKeys(Bname);
  	      
  	      driver.findElement(By.name("txtAdd1")).sendKeys(add);
  	      
  	      driver.findElement(By.name("txtZip")).sendKeys(zip);
  	      
  	      //dropdown
  	      
  	      Select ctry = new Select(driver.findElement(By.name("lst_counrtyU")));
  	      ctry.selectByVisibleText(Country);
  	     
  	      Select stat = new Select(driver.findElement(By.name("lst_stateI")));
  	      stat.selectByVisibleText(State);
  	      
  	      Select city = new Select(driver.findElement(By.name("lst_cityI")));
  	      city.selectByVisibleText(City);
  	      Thread.sleep(2000);
  	      
  	      driver.findElement(By.id("btn_insert")).click();
  	      
  	      //popup alert
  	      
  	      driver.switchTo().alert().accept();
  	      
  	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
  	      
    	 } 
         public void Role(String Rname,String des,String Rtype) throws InterruptedException {
        	 
          driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
   	      
   	      driver.findElement(By.name("btnRoles")).click();
   	      
   	      driver.findElement(By.name("txtRname")).sendKeys(Rname);
   	      
   	      driver.findElement(By.name("txtRDesc")).sendKeys(des);  
   	      
   	      //dropdown
   	      
   	      Select Rolety = new Select(driver.findElement(By.name("lstRtypeN")));
   	      Rolety.selectByVisibleText(Rtype);
   	      Thread.sleep(2000);
   	      driver.findElement(By.name("btninsert")).click();
   	      
   	      //popup
   	      
   	      driver.switchTo().alert().accept();
   	      
   	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
   	      
    	  }
        
	} 


