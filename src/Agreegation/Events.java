package Agreegation;

public class Events {

	private int roomNumber;
	private String eventName;
	
	public Events() {
		//deafault constructor 
	}
	
	//parametrized constructor
	public Events(int roomNumber,String eventName) {
		this.roomNumber = roomNumber;
		this.eventName = eventName;
	}
	
	//getters and setters 
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public String getEventName() {
		return eventName;
	}
}
