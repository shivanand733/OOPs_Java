package inhertance;

public class shiv1 {

	String c;
	String d;
	
	public shiv1() {
		this("cars");
	}
	
	public shiv1(String c) {
		
		this("new Car", "Petrol");
		this.c = c;
		
	}
	
	
	public shiv1(String c,String d) {
		super();
		this.c = c;
		this.d = d;
	}
	
}
