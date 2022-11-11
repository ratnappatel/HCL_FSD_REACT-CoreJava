package com.hcl.conditional;

import java.util.Scanner;

public class IfSwitchDemo {
	public static Scanner sc=new Scanner(System.in);

	public static  void withdraw(int pin)
	{
		
		System.out.println("Enter an amount.");
		int number=sc.nextInt();
		if(number<10000 && number >5000 )
				System.out.println("dispence 500rs & 200rs currency combination..");
		else if(number>10000 && number< 50000)
			System.out.println("dispence 500rs & 2000rs currency combination..");
		else if(number>50000)
			System.out.println("Amount higher than 50000 can not be withdrawn through ATM-Machine");
	}
	public static void main(String[] args) {
		System.out.println("Enter Your PinCode");
		int pin=sc.nextInt();
		
		if(pin==6427)
		{
			System.out.println("1. Check Balance");
			System.out.println("2. Display Mini Statement");
			System.out.println("3. Withdraw");
			System.out.println("4. Change Pin-Code");
			System.out.println("5. Change Mobile No.");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Your Availbale Balance is : "+(Math.random()*10000000));
					break;
				case 2:
					System.out.println("Displayed Mini Statement ");
					break;
				case 3:
					IfSwitchDemo.withdraw(pin);
					break;
				case 4:
					System.out.println("Enter New Pin-Code");
					int code=sc.nextInt();
					System.out.println("Your ATM Pin Updated to "+code);
					break;
				case 5:
					System.out.println("Enter New Mobile No..");
					long mobile=sc.nextLong();
					System.out.println("Your Mobile No updated to "+mobile);
					break;
					
			}
		}
		else
			System.out.println("Enterd Pin is Incorrect... \n TRY AGAIN LATER..");
	}

}
