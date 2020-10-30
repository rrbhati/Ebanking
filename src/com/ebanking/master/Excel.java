package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws InterruptedException, IOException  {
     //call the libaray and method here to reuse script for open application
		
		LibraryA Lb = new LibraryA();
		Lb.OpenApp("http://122.175.8.158/ranford2");
		Lb.AdminLogin("Admin","M1ndq" );
		
		//Before calling role method data through libarayA we need to get Excel file(that has multiple data)to get testdata Excel file.
		
		FileInputStream Fis=new FileInputStream("C:\\Selenium Workspace\\Ebanking\\src\\com\\ebanking\\testdata\\Roledata.xlsx");
		
		//to work with workbook we have one class xssf is a workbook.
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheets comes from workbook
		
		XSSFSheet WS=WB.getSheet("Rdata");
		
		//i want to get all data than first should know how many lines of data in the Excel than go for row count
		
		int Rcount=WS.getLastRowNum();
		System.out.println(Rcount);
		
		//if multiple iteration.....loop need to use as per needed
		
		//for loop(initialization,termination,incrementions.)
		
		for(int i=1; i<=Rcount;i++) {
		
		//now go with Row which comes from sheet
		XSSFRow WR=WS.getRow(i);
		
		//cell comes from Row 
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		
		//if we have data than get data from excel but to pass the data in Excel than use create cell
		
		XSSFCell WC2=WR.createCell(2);
		
		//now get Cell value
		
		String Rname=WC.getStringCellValue();
		String Rtype=WC1.getStringCellValue();
		
		//we have to call method from LibarayA for role
		
		String Res=Lb.Role(Rname,Rtype);
		System.out.println(Res);
		
		WC2.setCellValue(Res);
		}
	  // if u want to pass data back to Excel file in results than 
		
		FileOutputStream Fos= new FileOutputStream("C:\\Selenium Workspace\\Ebanking\\src\\com\\ebanking\\results\\Res.xlsx");
		WB.write(Fos);
		WB.close();
		
		
			
			
		}
		
	

}
