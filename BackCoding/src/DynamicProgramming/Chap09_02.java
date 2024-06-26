package DynamicProgramming;

import java.util.Scanner;

public class Chap09_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(recur(n, 0));
	}
	
	static int recur(int n, int count) {
		// n 이 2미만인 경우 누적된 count값을 반환
		if(n < 2) {
			return count;
		}
		return Math.min(recur(n / 2, count + 1 + (n % 2)), recur(n /3, count + 1 + (n % 3)));
	}
}
