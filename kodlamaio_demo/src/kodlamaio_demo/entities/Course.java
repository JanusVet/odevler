package kodlamaio_demo.entities;

public class Course {
	private int id;
	private String courseName;
	private double price;
	
	public Course(int id, String courseName, double price) {
		this.id = id;
		this.courseName = courseName;
		this.price = price;
		
	}
	
	public Course() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public double getPrice(double price) {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
