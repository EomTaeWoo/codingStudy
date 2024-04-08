package InputOuput;

import java.util.Scanner;

public class Childe {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		
		long sum = a + b + c;
		System.out.println(sum);
	}
}
