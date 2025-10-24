package constructor;

public class shivApp {
public static void main(String[] args) {
	shiv s1 = new shiv();
	shiv s2 = new shiv(12,"Shalivahan","Kumbar");
	
	s2.disp();		//using the constructor....
	s1.disp();		//Default Constructor....
}
}
