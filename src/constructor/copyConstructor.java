package constructor;

public class copyConstructor {

	private int id;
	private String name;
	private int marks;
	
	public copyConstructor (int id,String name,int marks){
	this.id = id;
	this.name = name;
	this.marks = marks;
	}
	
	public void dispInfo() {
		System.out.println("Student name: " + name  + "\nhis/shi id:  " + id + " \nstudent score in the  exam: " + marks);
	}
	public copyConstructor() {
		super();
	}
}
