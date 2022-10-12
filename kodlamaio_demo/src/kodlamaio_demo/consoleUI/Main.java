package kodlamaio_demo.consoleUI;

import java.util.ArrayList;
import java.util.List;

import kodlamaio_demo.business.CourseManager;
import kodlamaio_demo.dataAccess.HibernateCategoryDao;
import kodlamaio_demo.entities.Category;
import kodlamaio_demo.entities.Course;

public class Main {

	public static void main(String[] args) {
		List<Category> categories = new ArrayList<>();
		
		
		
		Category category1 = new Category(1, "Back-end");
		Category category2 = new Category(2, "Back-end");
		
		categories.add(category1);
		categories.add(category2);
		
		for(Category c : categories) {
			System.out.println(c.getCategoryName());
		}
		
	}

}
