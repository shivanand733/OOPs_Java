package constructor;

public class shiv {

	int id;
	String firstName;
	String lastName;
	
	public shiv(int id,String firstName,String lastName) {
		this.id = 438;
		this.firstName = "Shalivahan";
		this.lastName = "Kumbar";
	}
	
	public shiv(shiv ref) {
		this.id = ref.id;
		this.firstName = ref.firstName;
		this.lastName = ref.lastName;
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
