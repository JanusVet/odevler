package kodlamaio_demo.business;

import kodlamaio_demo.entities.Category;

import kodlamaio_demo.dataAccess.CategoryDao;
import kodlamaio_demo.dataAccess.CourseDao;

public class CategoryManager {
	private Category[] categories;
	private CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao, Category[] categories) {
		this.categoryDao = categoryDao;
		this.categories = categories;
		
	}
	
	public void add(Category category, CourseDao courseDao) throws Exception {
		 for(Category category1 : categories) {
			 if(category.getCategoryName() ==  category1.getCategoryName()) {
				 throw new Exception("Kurs ismi zaten var");
			 }
			 
			 categoryDao.add(category);
		 }
		 
		 
	}
	
	
	
	
} 
