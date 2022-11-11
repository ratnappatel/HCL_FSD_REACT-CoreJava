package com.hcl.polymorphsm;

public class TestDynamicPoly {

	public static void main(String[] args) {
		Child c=new Child();
		c.display("Ratna"); // Hi +how r u
		System.out.println("==========================");
		Parent p=new Parent();
		p.display("Ratna"); //Hi 
		
		//While inheritance parent class reference-variable can point to child-object
		System.out.println("==========================");
		Parent p2=new Child();
		p2.display("Uttam"); //  hi = 1 , hi-how = 2
		
		p2=new Parent();
		p2.display("Gargesh"); //  hi = 1 , hi-how = 2
				

	}
}
