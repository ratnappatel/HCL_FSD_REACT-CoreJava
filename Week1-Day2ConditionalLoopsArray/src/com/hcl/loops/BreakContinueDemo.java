package com.hcl.loops;

public class BreakContinueDemo {

	public static void main(String[] args) {

		for(int i=0;i<100;i=i+2)
		{
			if(i==28 || i==48 || i==88)
				continue;
			else if(i>91)
				break;
			System.out.print(i+",  ");
		}
	}

}
