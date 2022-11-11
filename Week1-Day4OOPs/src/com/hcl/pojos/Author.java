package com.hcl.pojos;

import java.util.Date;

public class Author {
	
	private int id;
	private String name;
	private int noOfBooks;
	private Date dob;
	//Recommended to have No-Args Constructor  ctrl+space-bar
	// wear-helmet while driving two-wheeler
	public Author() {
		
	}
	public Author(int id, String name, int noOfBooks, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBooks = noOfBooks;
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void printDetails()
	{
		System.out.println("Author's ID : "+this.id);
		System.out.println("Author's Name : "+this.name);
		System.out.println("Author's DateOfBirth : "+this.dob);
		System.out.println("No of Books Written : "+this.noOfBooks);
	}
}
