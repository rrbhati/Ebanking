package com.ebanking.master;

public class ExeLib {

	public static void main(String[] args) throws InterruptedException {
		
		LibraryA Lb = new LibraryA();
		Lb.OpenApp("http://122.175.8.158/ranford2");
		Lb.AdminLogin("Admin","M1ndq");
		Lb.Branches("Tina12","AjmerRoad","12345","INDIA","GOA","GOA");
		Lb.Role("rekha","E");

	}

}
