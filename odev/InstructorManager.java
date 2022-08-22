package video3.odev;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName()+" named instructor added..");
	}

}
