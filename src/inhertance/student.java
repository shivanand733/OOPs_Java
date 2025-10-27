package inhertance;

public class student {

	int id;
	String name;
	int age;
	static int idIn;
	public student(String name, int age) {
		this(++idIn);
		this.name = name;
		this.age = age;
	}
	
	public student(int id) {
		this.id = id;
	}
	
}
