package kodlamaio.entities;

public class Course {
	private int id;
	private String courseName;
	private String instructorFullName;
	private String categories;
    private double coursePrice;
	public Course() {

	}

	public Course(int id, String courseName, String instructorFullName, String categories, double coursePrice) {

		this.id = id;
		this.courseName = courseName;
		this.instructorFullName = instructorFullName;
		this.categories = categories;
		this.coursePrice = coursePrice;
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

	public String getInstructorFullName() {
		return instructorFullName;
	}

	public void setInstructorFullName(String instructorFullName) {
		this.instructorFullName = instructorFullName;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public double getCoursePrice() {
		return coursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

}