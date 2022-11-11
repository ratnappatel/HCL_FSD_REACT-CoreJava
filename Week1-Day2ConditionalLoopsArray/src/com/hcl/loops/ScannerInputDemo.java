package com.hcl.loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerInputDemo {

	public static void main(String[] args) throws FileNotFoundException{
		File file=new File("Data.txt");
		// A Posibility of file being not present on given path..
		Scanner sc=new Scanner(file);
		/*
		 * while(sc.hasNext()) System.out.println(sc.nextLine());
		 */
		sc.close();
		sc=new Scanner(System.in);
		System.out.println("Enter Int value");
		int a=sc.nextInt();
		
		System.out.println("Enter boolean value");
		boolean flag=sc.nextBoolean();
		
		System.out.println("Enter double value");
		double d=sc.nextDouble();
		
		System.out.println("Enter float value");
		float f=sc.nextFloat();
		
		System.out.println("Enter long value");
		long l=sc.nextLong();
		
		System.out.println("Enter byte value");
		byte b=sc.nextByte();
		
		System.out.println("Int : "+a);
		System.out.println("Boolena : "+flag);
		System.out.println("Double : "+d);
		System.out.println("Float : "+f);
		System.out.println("Long : "+l);
		System.out.println("Byte : "+b);
	}
}
