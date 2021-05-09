package kodlamaIo;

public class StudentManager {
	public void joinCourses(Student student) {
		System.out.println("Kursa kayýt olundu");
	}
	public void homeworkStatus(Student student) {
		System.out.println("Kurs tamamlandý :" + student.getName() + student.getLastName());
	}
}
