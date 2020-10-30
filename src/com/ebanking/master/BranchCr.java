package com.ebanking.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BranchCr {
	
	@FindBy(id="txtbName")
	WebElement Branchname;
	
	@FindBy(id="txtAdd1")
	WebElement Add;
	
	@FindBy(id="txtZip")
	WebElement ZipCd;
	
	@FindBy(id="lst_counrtyU")
	WebElement Country;
	
	@FindBy(id="lst_stateI")
    WebElement State;
	
	@FindBy(id="lst_cityI")
	WebElement City;
	
	@FindBy(id="btn_insert")
	WebElement Submit;
	
	public void Bcr() throws InterruptedException {
		Branchname.sendKeys("Meenaa");
		Add.sendKeys("Irving");
		ZipCd.sendKeys("89898");
		
		Select ctry = new Select(Country);
	    ctry.selectByVisibleText("INDIA");
	    
	    Select St = new Select(State);
	    St.selectByVisibleText("GOA");
	    
	    Select city = new Select(City);
	    city.selectByVisibleText("GOA");
	    
	    Thread.sleep(3000);
	    
	    Submit.click();
	    
	
		
		
	}
	
}
