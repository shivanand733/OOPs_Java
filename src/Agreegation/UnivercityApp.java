package Agreegation;

public class UnivercityApp {
public static void main(String[] args) {
	Univercity vtu = new Univercity();
	professor ref = new professor("rahul rai", "basic signal processing");
	student s = new student(426, "Sahana");
	Events e = new Events(101, "Freshers party");
	vtu.pref = ref;
	
	vtu.classRoomDetails();
	vtu.professorDetails();
	vtu.train();
	vtu.getAdminstion(s);
	vtu.getEvents(e);
	
	System.out.println("studnet Id " + vtu.stu.getStudentId() + " Student Name " + vtu.stu.getName());
	System.out.println("Event Running on the Room is "  + vtu.ev.getRoomNumber() + " Function Name " + vtu.ev.getEventName());
	
}
}
