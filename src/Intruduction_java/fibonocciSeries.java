package Intruduction_java;

import java.util.Scanner;

public class fibonocciSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eneter number:");
		int number = scan.nextInt();
		int num1 = 0;
		int num2 = 1;
		if(number == 1) {
			System.out.println(num1);
		} else if(number == 2) {
			System.out.print(num1 + " " + num2 + " ");
		} else {
			System.out.print(num1 + " " + num2 + " ");
			for (int i = 1; i < number - 1;i++) {
				int nextnum = num1 + num2;
				System.out.print( " "+ nextnum);
				num1= num2;
				num2 = nextnum;
			}
		}
	}
}
