package com.hcl.pojos;

public class TestPojo {

	public static void main(String[] args) {
		PojoOne p=new PojoOne();
		System.out.println("Registered Mobile No : "+p.getMobile());
		p.setMobile("736484749");
		System.out.println("New Mobile No : "+p.getMobile());
		
		System.out.println("Registered Vehicle Type : "+p.getVehicle());
		p.setVehicle("Yamaha-100RX");
		System.out.println("New Vehicle Type : "+p.getVehicle());
	}

}
