package Intruduction_java;

import java.util.Scanner;

public class ReverseApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to revers it");
	int n = scan.nextInt();
	
	ReverseNumber reverse = new ReverseNumber();
	int  ReversedNumber = reverse.reverse1(n);
	System.out.println("Reversed Number is : " +ReversedNumber);
}
}
