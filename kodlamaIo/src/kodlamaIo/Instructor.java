package kodlamaIo;

public class Instructor extends User{
	private String courses;

	public Instructor(int id, String name , String lastName, String password, String courses) {
		super(id,name,lastName,password);
		this.courses = courses;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	
}
