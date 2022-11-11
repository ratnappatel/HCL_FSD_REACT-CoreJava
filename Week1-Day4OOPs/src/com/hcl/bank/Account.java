package com.hcl.bank;

import java.util.Scanner;

public class Account {
	
	private int number;
	private String name;
	private long mobileNo;
	private double balance; // I have hidden data
	private String address;
	Scanner sc;
	
	public Account() {
		sc=new Scanner(System.in);
		this.number=this.generateAccountNumber();
	}
	// Argument Constructor
	public Account(String name,long mobileNo,double balance,String address) {
		this(); // will call no-args-constructo
		this.name=name;
		this.mobileNo=mobileNo;
		this.balance=balance;
		this.address=address;
	}
	public int generateAccountNumber()
	{
		int no=(int)(Math.random()*100000000);
		return no;
	}
	
	//Cashier in bank branch, other-app like googlepay, cash-deposit-machine
	 void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	 
	 public void updateMobileNo(long newMobileNo)
	 {
		 System.out.println("Enter Current registered mobileno");
		 long mobile=sc.nextLong();
		 if(mobile == this.mobileNo)
		 {
			 int otp=(int)(Math.random()*10000);
			 System.out.println("Your OTP for updating registered mobile no is : \n "+otp);
			 System.out.println("Enter OTP");
			 int inputOTP=sc.nextInt();
			 if(inputOTP==otp)
				 this.mobileNo=newMobileNo;
			 else
				 System.out.println("OTP is not valid \n TRY AGAIN LATER !!!!");
		 }
			 
	 }
	 public void updateAddress()
	 {
		 System.out.println("Only Bank branch can update address\n hence walk into nearest branch with PhotoID proof");
	 }
	 public void printDetails()
	 {
		 System.out.println("Name : "+this.name);
		 System.out.println("Account No : "+this.number);
		 System.out.println("Available Balance : "+this.balance);
		 System.out.println("Registerd Mobile No : "+this.mobileNo);
		 System.out.println("Registered Address is : "+this.address);
		 
	 }

}
