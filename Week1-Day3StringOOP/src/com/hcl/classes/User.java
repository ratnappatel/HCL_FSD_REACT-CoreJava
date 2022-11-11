package com.hcl.classes;

import java.util.Scanner;

public class User {
	int id;
	String name;
	Scanner sc;
	public User() {
		sc=new Scanner(System.in);
		System.out.println("Enter User Name : ");
		name=sc.next();
		System.out.println("Enter User Id : ");
		id=sc.nextInt();
	}
	public Message sendMessage(User whom)
	{
		System.out.println(this.name+" is Sending Message to "+whom.name);
		Message msg=new Message(101,"Hi ...");
		return msg;
	}
	public void readMessage(Message msg)
	{
		System.out.println("Message text : "+msg.text);
	}
	

}
