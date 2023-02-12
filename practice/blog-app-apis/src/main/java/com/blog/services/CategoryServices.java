package com.blog.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.blog.payloads.CategoryDto;

@Component
public interface CategoryServices {
	
	//create
	public CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	public CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	//delete
	public void deleteCategory(Integer categoryId);
	
	//get
	public CategoryDto getCategory(Integer categoryId);

	//get all
	List<CategoryDto>getCategories();
}
