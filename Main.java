package eduSmart;

public class Main {

	public static void main(String[] args) {

		

		// Create Students
		Student st1 = new Student("Suma", "sumam7616@gmail.com", 110, "", "");
		Student st2 = new Student("Ram", "ram@gmail.com", 109, "", "");


		// Create Instructors
		Instructor in1 = new Instructor("Mr. Sudeep", "sudeep@gmail.com", 11, "", "");
		Instructor in2 = new Instructor("Mr. Pradeep", "pradeep@gmail.com", 12, "", "");

		// Create Admin
		Admin admin = new Admin("Admin11", "admin@gmail.com", 999);

		// Instructors create courses
		System.out.println(in1.createCourse("Java Basics"));
		System.out.println(in1.createCourse("Advanced Java"));
		System.out.println(in2.createCourse("Python Basics"));
		System.out.println(in2.createCourse("Database Systems"));

		// Create Course objects
		Course c1 = new Course("Java Basics", 60, 40);
		Course c2 = new Course("Data Structures", 35, 25);
		Course c3 = new Course("Python Basics");
		Course c4 = new Course("Database Systems", 70, 10);

		// Students enroll
		System.out.println(st1.enrollCourse("Java Basics"));
		System.out.println(st1.enrollCourse("Advanced Java"));
		System.out.println(st2.enrollCourse("Python Basics"));
		System.out.println(st2.enrollCourse("Database Systems"));

		// Display user profiles
		st1.displayWelcome();
		st1.viewProfile();
		st2.viewProfile();
		in1.viewProfile();
		in2.viewProfile();
		admin.viewProfile();

		// Students track progress
		st1.trackProgress();
		st2.trackProgress();

		// Admin removes user
		admin.removeUser(st2);

		// Show course details
		System.out.println();
		c1.showCourseDetails();
		c2.showCourseDetails();
		c3.showCourseDetails();
		c4.showCourseDetails();

	}

}
