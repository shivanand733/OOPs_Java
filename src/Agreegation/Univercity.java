package Agreegation;

public class Univercity {
	
		//create  the agrigation and composation
		
		//composition
		classRoom cr = new classRoom(101, "ECE 101");
		
		//Aggregation
		professor pref;
		
		//composation 
		belagavi b1 = new belagavi(180,"belagavi sp");
		
		//Aggregation 
		student stu ;
		
		//Aggrigation 
		Events ev;
		
	public void classRoomDetails() {
		System.out.println(cr.getNo());
		System.out.println(cr.getType());
	}
	
	public void professorDetails() {
		System.out.println(pref.getName());
		System.out.println(pref.getSub());
	}
	
	public void train() {
		System.out.println(b1.getTrincost());
		System.out.println(b1.getTrainName());
	}
	
	public void getAdminstion(student stu) {
		this.stu = stu;
	}
	
	public void getEvents(Events ev) {
		this.ev = ev;
	}
}
