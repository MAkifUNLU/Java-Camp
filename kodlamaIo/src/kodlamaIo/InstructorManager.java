package kodlamaIo;

public class InstructorManager {
	public void createCourse(Instructor instructor) {
		System.out.println("Kurs olu�turuldu :"+  instructor.getCourses());
	}
	public void deleteCourse(Instructor instructor) {
		System.out.println("Kurs silindi :"+  instructor.getCourses());
	}
}
