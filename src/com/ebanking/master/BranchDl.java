package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BranchDl {
	
	@FindBy(id="BtnNewBR")
     WebElement NewBranch;
	
	@FindBy(xpath=("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[3]/table/tbody/tr/td[1]/a/img"))
	WebElement Home;
	
	
	public void Nb() {
		NewBranch.click();
	}
	
	public void H() {
		Home.click();
	}
}

