package com.hcl.variables;

public class StringImmDemo {

	public static void main(String[] args) {
		String str="Hi ";
		System.out.println("str = "+str+" @ "+str.hashCode());
		
		String str1="Hi ";
		System.out.println("str1 = "+str+" @ "+str1.hashCode());
		
		String str2=new String("Hi ");
		System.out.println("str2 = "+str+" @ "+str2.hashCode());
		/*
		 * str=str+" Everone !!..";
		 * System.out.println("str = "+str+" @ "+str.hashCode());
		 */
		
		
		  if(str==str1) 
			  System.out.println("str == str1");  //1
		  else
			  System.out.println("str != str1"); //2
		  // identical
		  
		  if(str==str2) 
			  System.out.println("str == str2");  //1
		  else
			  System.out.println("str != str2"); //2
		  
		  
		  if(str.equals(str2))
			  System.out.println("str == str2");  //1
		  else
			  System.out.println("str != str2"); //2
			
		
		// Thumb Rule to compare Strings always use equals method because 
		  //we does't know whether string is literal or an object

	}

}
