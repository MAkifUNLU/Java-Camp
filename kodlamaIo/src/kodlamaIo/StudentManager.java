package kodlamaIo;

public class StudentManager {
	public void joinCourses(Student student) {
		System.out.println("Kursa kay�t olundu");
	}
	public void homeworkStatus(Student student) {
		System.out.println("Kurs tamamland� :" + student.getName() + student.getLastName());
	}
}
