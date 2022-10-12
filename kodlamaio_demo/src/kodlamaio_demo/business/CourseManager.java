package kodlamaio_demo.business;

import kodlamaio_demo.dataAccess.CourseDao;
import kodlamaio_demo.entities.Course;

public class CourseManager {
	private Course course;
	private CourseDao courseDao;
	
	public CourseManager(Course course, CourseDao courseDao) {
		this.course = course;
		this.courseDao = courseDao;
	}
	
	public void add(Course course) {
		
	}
	
}
