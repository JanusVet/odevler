package kodlamaio_demo.dataAccess;

import kodlamaio_demo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + "Hibernate ile eklendi");
		
	}

}
