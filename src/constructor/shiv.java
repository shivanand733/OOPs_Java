package constructor;

public class shiv {

	int id;
	String firstName;
	String lastName;
	
	public shiv(int id,String firstName,String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public shiv() {
		id = 123;
		firstName = "Shivanand";
		lastName = "Kumbar";
	}
	
	public void disp() {
		System.out.println("id " + id + " First Name: " + firstName + " Last Name: " + lastName);
	}
}
