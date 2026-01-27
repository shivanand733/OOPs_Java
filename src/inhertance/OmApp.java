package inhertance;

import java.util.Scanner;

public class OmApp {
public static void main(String[] args) {
	
	Scanner Scan = new Scanner(System.in);
	om o = (int x,int y) -> {
	System.out.println( x + y);
	};
	System.out.println("Enter 2 Numbers...");
	o.add(Scan.nextInt(), Scan.nextInt());
}
}
