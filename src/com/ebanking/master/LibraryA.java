package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LibraryA {
	 
	public static WebDriver driver;
     public void OpenApp(String Url) {
     driver = new FirefoxDriver();
  
    	          
    	      
     driver.get(Url);
     driver.manage().window().maximize();
    	      
    	      //getTittle
    	      
     String Tit=driver.getTitle();
     System.out.println(Tit);
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
         public String Role(String Rname,String Rtype) throws InterruptedException {
        	 
          driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
   	      
   	      driver.findElement(By.name("btnRoles")).click();
   	      
   	      driver.findElement(By.name("txtRname")).sendKeys(Rname);
   	      
   	      //driver.findElement(By.name("txtRDesc")).sendKeys(des);  
   	      
   	      //dropdown
   	      
   	      Select Rolety = new Select(driver.findElement(By.name("lstRtypeN")));
   	      Rolety.selectByVisibleText(Rtype);
   	      Thread.sleep(2000);
   	      driver.findElement(By.name("btninsert")).click();
   	      
   	      //popup
   	      String Actual=driver.switchTo().alert().getText();
   	      driver.switchTo().alert().accept();
   	      
   	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
   	      return Actual;
   	        
   	      
         }
         
         public void Admlogout() {
         
         driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();	 
        	 
         }
         public void Appclose() {
        	 driver.close();
         }
         
	} 


