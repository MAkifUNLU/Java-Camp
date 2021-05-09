package kodlamaIo;

public class InstructorManager {
	public void createCourse(Instructor instructor) {
		System.out.println("Kurs oluþturuldu :"+  instructor.getCourses());
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println("Kurs silindi :"+  instructor.getCourses());
	}
}
