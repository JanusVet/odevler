package kodlamaio_demo.dataAccess;

import kodlamaio_demo.entities.Course;

public class JDBCCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + "JDBC ile eklendi");
		
	}
	
}
