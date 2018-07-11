package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.persistence.*;
import com.persistence.PersonManager;

public class createCategoryAction extends ActionSupport {

	private String Category;
	public String execute() {
			Category category = new Category();
			category.setCategory(Category);
			CategoryManager.createCategory(category);			
			return "success";
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
}
