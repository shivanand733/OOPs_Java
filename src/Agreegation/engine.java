package Agreegation;

public class engine {

	private String model;
	private String hoursePower;
	
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setHoursePower(String hoursePower) {
		this.hoursePower = hoursePower;
	}
	
	public String getHoursePower() {
		return hoursePower;
	}
	
	//default constructor 
	public engine() {
		
	}
	
	//parameterized constructor 
	public engine(String model,String hoursePower) {
		this.model = model;
		this.hoursePower = hoursePower;
	}
	
	
	void display() {
		System.out.println("model: " + model);
		System.out.println("hourse power: " + hoursePower);
	}
}
