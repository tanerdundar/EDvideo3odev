package video3.odev;

public class Main {
	
	public static void main(String[] args ) {
		
		Instructor student1 = new Instructor();
		student1.setFirstName("Ali");
		
		Student instructor1 = new Student();
		instructor1.setFirstName("Mehmet");
		
		InstructorManager im = new InstructorManager();
		StudentManager sm = new StudentManager();
		
		im.add(instructor1);
		sm.add(student1);
		
	}

}
