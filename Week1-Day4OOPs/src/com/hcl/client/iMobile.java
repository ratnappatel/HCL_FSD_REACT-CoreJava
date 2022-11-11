package com.hcl.client;

import com.hcl.bank.Account;

public class iMobile {

	public static void main(String[] args) {
		Account ratna=new Account("Ratna",9529216356l,250000.23,"2/5- Heerabagh Flats..");
		ratna.updateMobileNo(9829837874l);
		ratna.printDetails();
		ratna.updateAddress();
		//ratna.mobileNo=23984629356// encapsulation
		
	}
}
