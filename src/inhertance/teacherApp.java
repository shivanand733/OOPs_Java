package inhertance;

public class teacherApp {
public static void main(String[] args) {

	physicsTeacher p1 = new physicsTeacher();
	p1.teach();
	p1.markAttednece();
	p1.doExp();
	System.out.println();
	chemestriTeacher c1 = new chemestriTeacher();
	
	c1.teach();
	c1.markAttednece();
	c1.doExp();
	System.out.println();
	biologyTeacher b1 = new biologyTeacher();
	b1.teach();
	b1.markAttednece();
	b1.doExp();
	System.out.println();
	
}
	
}
