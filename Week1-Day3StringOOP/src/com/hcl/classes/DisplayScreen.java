package com.hcl.classes;

public class DisplayScreen {
	
	public static void displayScores(int scores[])
	{
		for(int s:scores)
			System.out.println("scores : "+s);
	}
	
	public static void main(String args[])
	{
		Score s1=new Score();
		int arr[]=s1.addScore();
		displayScores(arr);
	}

}
