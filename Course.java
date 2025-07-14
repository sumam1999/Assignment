package eduSmart;

public class Course {
	
	
	private String title;
	private int durationInHour;
	private final int maxStudents;
	
	
	public Course(String title, int durationInHour, int maxStudents){
		this.title = title;
		this.durationInHour = durationInHour;
		this.maxStudents = maxStudents;
	}
	public Course(String title){
		this.title = title;
		this.durationInHour = 20;	
		this.maxStudents = 100;		
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getDurationInHour() {
		return durationInHour;
	}
	public void setDurationInHour(int durationInHour) {
		this.durationInHour = durationInHour;
	}

	public int getMaxStudents() {
		return maxStudents;
	}
	
	public void showCourseDetails() {
		System.out.println("----- Course Details -----");
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationInHour + " hours");
        System.out.println("Max Students: " + maxStudents);
	}
}