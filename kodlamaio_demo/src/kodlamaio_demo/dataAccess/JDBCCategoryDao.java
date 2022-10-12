package kodlamaio_demo.dataAccess;

import kodlamaio_demo.entities.Category;

public class JDBCCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + "JDBC ile eklendi");
		
	}

}
