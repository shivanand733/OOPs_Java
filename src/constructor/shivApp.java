package constructor;

public class shivApp {
public static void main(String[] args) {
	shiv s1 = new shiv();
	shiv s2 = new shiv(12,"Shalivahan","Kumbar");
	shiv s3 = new shiv(s2);
	
	s2.disp();		//using the constructor....
	s1.disp();		//Default Constructor....
	s3.disp();
}
}
