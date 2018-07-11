package com.persistence;

public class Category {
	
	private int ID;
	private String Category;
	
	
	
	public Category() {
	}
	
	
	public Category(int iD, String category) {
		super();
		ID = iD;
		Category = category;
	}



	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	
	
	
	
}
