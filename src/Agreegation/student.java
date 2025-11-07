package Agreegation;

public class student {

	private int studentId;
	private String name;
	
	public student() {
		//deafult constructor 
	}
	
	public student(int studentId,String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	//getter and setter
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
