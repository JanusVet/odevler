package kodlamaio_demo.dataAccess;

import kodlamaio_demo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName() + "Hibernate ile eklendi");
		
	}

}
