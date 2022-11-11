package com.hcl.specifiers;

public class AccessDataInheritance extends Data {
	public AccessDataInheritance() {
		//System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
		System.out.println(super.d);
		
		//super.method1();
		super.method2();
		super.method3();
		super.method4();
	}

	public static void main(String[] args) {
		new AccessDataInheritance();
		

	}

}
