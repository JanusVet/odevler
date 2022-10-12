package kodlamaio_demo.dataAccess;

import kodlamaio_demo.entities.Instructor;

public class JDBCInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName() + "JDBC ile eklendi");
		
	}

}
