package inhertance;

import java.util.Scanner;

public class birdApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	goldenEgale ge = new goldenEgale();
	System.out.print(scan.next());
	ge.fly();
	ge.eat();
}
}
