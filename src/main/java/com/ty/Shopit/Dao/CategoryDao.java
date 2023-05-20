package com.ty.Shopit.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.Shopit.Entity.Category;
import com.ty.Shopit.Repo.CategoryRepo;

@Repository
public class CategoryDao {
	@Autowired
	private CategoryRepo categoryRepo;

	public Category addCategory(Category category) {
		return categoryRepo.save(category);
	}

	public Category findCategoryById(long categoryId) {
		Optional<Category> optional = categoryRepo.findById(categoryId);
		if (optional.isEmpty()) {
			return null;
		} else {
			return optional.get();
		}
	}

	public Category updateCategory(Category category) {
		return categoryRepo.save(category);
	}

	public Category deleteCategoryById(long categoryId) {
		Optional<Category> optional = categoryRepo.findById(categoryId);
		if (optional.isEmpty()) {
			return null;
		} else {
			Category category = optional.get();
			categoryRepo.delete(category);
			return category;
		}
	}
}
