package kodlamaIo;

public class Student extends User{
	private String studentNumber;

	public Student(int id, String name , String lastName, String password, String studentNumber) {
		super(id, name,lastName,password);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
