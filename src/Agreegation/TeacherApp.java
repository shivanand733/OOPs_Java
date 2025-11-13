package Agreegation;

public class TeacherApp {
public static void main(String[] args) {
	Teacher ref;
	ref = new Electronoics();
	ref.takeAttedence();ref.doExp();ref.teach();
	
	ref = new Maths();
	ref.takeAttedence();ref.doExp();ref.teach();
	
	ref = new AppliedScience();
	ref.takeAttedence();ref.doExp();ref.teach();
	

}
}
