package kodlamaio_demo.dataAccess;

import java.util.List;

import kodlamaio_demo.entities.Category;

public interface CategoryDao {
	void add(Category category);
	List<Category> getCategories(List<Category> categories);
}
