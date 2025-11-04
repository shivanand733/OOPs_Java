package Agreegation;

public class UnivercityApp {
public static void main(String[] args) {
	Univercity vtu = new Univercity();
	
	professor ref = new professor("rahul rai", "basic signal processing");
	 
	vtu.pref = ref;
	
	vtu.classRoomDetails();
	vtu.professorDetails();
	vtu.train();
}
}
