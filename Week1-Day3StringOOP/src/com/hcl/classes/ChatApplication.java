package com.hcl.classes;

public class ChatApplication {

	public static void main(String[] args) {
		User ratna=new User();
		User uttam=new User();
		Message msg=new Message(12,"Hi Ever");
		Message m=ratna.sendMessage(uttam);
		uttam.readMessage(m);
	}
}
