package com.ebanking.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicTc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sande\\Downloads\\geckodriver.exe");
	       WebDriver driver =new FirefoxDriver();
		//  System.setProperty("webdriver.chrome.driver","C:\\Selenium Workspace\\chromedriver_win32\\chromedriver.exe");
	    //  WebDriver driver = new ChromeDriver();
	          
	      
	      driver.get("http://122.175.8.158/ranford2");
	      //miximiz
	      
	      driver.manage().window().maximize();
	      
	      //getTittle
	      
	      String Tit=driver.getTitle();
	      System.out.println(Tit);
	      
	      
	      
	      driver.findElement(By.id("txtuId")).sendKeys("Admin");
	      
	      driver.findElement(By.name("txtPword")).sendKeys("M1ndq");
	      
	      driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	     
	      //Branch creation 
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	     
	      driver.findElement(By.name("BtnNewBR")).click();
	      
	      driver.findElement(By.name("txtbName")).sendKeys("teena1");
	      
	      driver.findElement(By.name("txtAdd1")).sendKeys("abc1#");
	      
	      driver.findElement(By.name("txtZip")).sendKeys("12345");
	      
	      //dropdown
	      
	      Select ctry = new Select(driver.findElement(By.name("lst_counrtyU")));
	      ctry.selectByVisibleText("INDIA");
	     
	      Select stat = new Select(driver.findElement(By.name("lst_stateI")));
	      stat.selectByVisibleText("Delhi");
	      
	      Select city = new Select(driver.findElement(By.name("lst_cityI")));
	      city.selectByVisibleText("Delhi");
	      
	      driver.findElement(By.id("btn_insert")).click();
	      
	      //popup alert
	      
	      driver.switchTo().alert().accept();
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
	      
	      //Roles
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	      
	      driver.findElement(By.name("btnRoles")).click();
	      
	      driver.findElement(By.name("txtRname")).sendKeys("Abcd");
	      
	      driver.findElement(By.name("txtRDesc")).sendKeys("Manager1234@");  
	      
	      //dropdown
	      
	      Select Rolety = new Select(driver.findElement(By.name("lstRtypeN")));
	      Rolety.selectByVisibleText("E");
	      
	      driver.findElement(By.name("btninsert")).click();
	      
	      //popup
	      
	      driver.switchTo().alert().accept();
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
	      
	      // Employee
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
	      
	      driver.findElement(By.name("BtnNew")).click();
	      
	      driver.findElement(By.name("txtUname")).sendKeys("Abc1");
	      
	      driver.findElement(By.name("txtLpwd")).sendKeys("aa1@");
	      
	      Select Role = new Select(driver.findElement(By.name("lst_Roles")));
	      Role.selectByValue("hhghghdg");
	      
	      Select Branch = new Select(driver.findElement(By.name("lst_Branch")));
	      Branch.selectByValue("1");
	      
	      driver.findElement(By.name("BtnSubmit")).click();
	      
	      // popup
	      
	      driver.switchTo().alert().accept();
	      
	     //Logout
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
	      
	      driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();
	      
	      
		}
	
	      
	     
	    	  
	      
	     
	      

	}


