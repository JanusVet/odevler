package kodlamaio_demo.dataAccess;

import kodlamaio_demo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + "Hibernate ile eklendi");
	}

}
