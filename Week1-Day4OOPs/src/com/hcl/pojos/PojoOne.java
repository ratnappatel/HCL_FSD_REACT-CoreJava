package com.hcl.pojos;

public class PojoOne {
	
	private String vehicle="Royal Enfield";
	private String mobile="9529216356";
	
	//getter ==> return current value of private field
	//setter ==> change current value of private field
	
	public String getVehicle()
	{
		return this.vehicle;
	}
	
	public void setVehicle(String vehicle)
	{		
		this.vehicle=vehicle;
	}
	
	public String getMobile()
	{
		return this.mobile;
	}
	public void setMobile(String mobile)
	{
		//write a logic to verify whose modifying should we allow or not..
		this.mobile=mobile;
	}
	

}
