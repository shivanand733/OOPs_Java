package inhertance;

public class demoS2 extends demoS1{

	int b ;
	
	void show() {
		System.out.println(b);
	}
	
	public demoS2(int b) {
		super(20);
		this.b = b;
	}
	
	public void disp() {
		System.out.println("a : " + a + " b : " + b);
	}
	
}
