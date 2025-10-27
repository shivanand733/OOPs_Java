package inhertance;

public class studentApp {
	public static void main(String[] args) {
		student s1 = new student("ramu", 23);
		System.out.println("Student id " + s1.id + " Name " + s1.name + " Age " + s1.age);
		student s2 = new student("ramesh", 24);
		System.out.println("Student id " + s2.id + " Name " + s2.name + " Age " + s2.age);
	}
}
