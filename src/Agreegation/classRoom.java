package Agreegation;

public class classRoom {

	private int no;
	private String type;
	
	public classRoom(int no,String type) {
		this.no = no;
		this.type = type;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
