package AbstractClasses;

abstract public class Bus {
	private int busId;
	private String busName;
	
	public abstract void busRoute();	// long route or short route 
	public abstract void busType(); 	//sleeper bus orn sitting 
	
	public Bus() {
		//default constructor 
	}
	
	//parametrized constructor 
	public Bus(int busId, String busName) {
		this.busId = busId;
		this.busName = busName;
	}

	
	//setters and getters
	public int getBusId() {
		return busId;
	}
	
	public String getBusName() {
		return busName;
	}
	
	public void setBusId(int busId) {
		this.busId = busId;
	}
	
	public void setBusName(String busName) {
		this.busName = busName;
	}
}
