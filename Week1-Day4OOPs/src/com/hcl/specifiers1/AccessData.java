package com.hcl.specifiers1;

import com.hcl.specifiers.Data;

public class AccessData {

	public static void main(String[] args) {
		Data d1=new Data();
		//System.out.println("Private a = "+d1.a);
		//System.out.println("Protected b = "+d1.b);
		//System.out.println("Packaged c = "+d1.c);
		System.out.println("Public d = "+d1.d);
		
		//d1.method1();
		//d1.method2();
		//d1.method3();
		d1.method4();

	}

}
