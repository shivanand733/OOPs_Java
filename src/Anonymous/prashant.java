package Anonymous;

public class prashant {
public static void main(String[] args) {
	int id = 234;
	String name = "prashanth";
	int age = 26;
	
	displyInfo(name, id, age);
	System.out.println();
	new sahana().displyInfo();
	System.out.println();
	new shivanand().displyInfo();
}

public static void displyInfo(String name,int id,int age) {
	System.out.println("Id " + id);
	System.out.println("Name " + name);
	System.out.println("Age " + age);
}
}
