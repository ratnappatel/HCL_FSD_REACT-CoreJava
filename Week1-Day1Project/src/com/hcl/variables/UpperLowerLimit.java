package com.hcl.variables;

public class UpperLowerLimit {

	public static void main(String[] args) {
		System.out.println("byte : Upper Limit = "+Byte.MAX_VALUE+
				" + Lower Limit = "+Byte.MIN_VALUE);
		byte b=(byte) -132; // Explicit Type Conversion
		System.out.println("b= "+b);
		
		System.out.println("short : Upper Limit = "+Short.MAX_VALUE+
				" + Lower Limit = "+Short.MIN_VALUE);
		
		System.out.println("int : Upper Limit = "+Integer.MAX_VALUE+
				" + Lower Limit = "+Integer.MIN_VALUE);
		
		System.out.println("long : Upper Limit = "+Long.MAX_VALUE+
				" + Lower Limit = "+Long.MIN_VALUE);
		
		long l=3523534625235l; // l/L as suffix
		float f=34.567f; // f/F as suffix
		//In Java any numeric value without decimal point is int by-default
		//In Java any numeric value with decimal point is double by-default

	}

}
