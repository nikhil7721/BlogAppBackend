package com.blog.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	
	@Column(name="title",length=200,nullable=false)
	private String categoryTitle;
	
	@Column(name="description")
	private String categoryDescription;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	public String getCategoryDescription() {
		return categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	public Category(Integer categoryId, String categoryTitle, String categoryDescription) {
		super();
		this.categoryId = categoryId;
		this.categoryTitle = categoryTitle;
		this.categoryDescription = categoryDescription;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryTitle=" + categoryTitle + ", categoryDescription="
				+ categoryDescription + "]";
	}
	
	

}
