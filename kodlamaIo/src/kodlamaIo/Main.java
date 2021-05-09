package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Akif","ÜNLÜ","abc","101");
		Instructor instructor1 = new Instructor(1,"Engin ","Demiroğ ","abc","Java");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
	    UserManager userManager = new UserManager();

	    studentManager.joinCourses(student1);
	    studentManager.homeworkStatus(student1);
	    
	    instructorManager.createCourse(instructor1);
	    instructorManager.deleteCourse(instructor1);
	    
	    userManager.add(instructor1);
	    userManager.delete(instructor1);
	    
	}

}
