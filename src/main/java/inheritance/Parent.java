package inheritance;

public class Parent {
    
	private final String firstName;
	
	public Parent() {
		firstName = null;
	}
	public Parent(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return "My firstName"+ firstName;
	}
	
	public static String who() {
		return "Parent";
	}
}
