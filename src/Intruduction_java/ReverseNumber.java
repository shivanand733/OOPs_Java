package Intruduction_java;

public class ReverseNumber {
	int reverse1(int n) {
		int rev = 0;
		
		while(n != 0) {
			int last = n % 10;
			rev = rev * 10 + last;
			n = n /10;
		}
		return rev;
	}
}
