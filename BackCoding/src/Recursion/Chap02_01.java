package Recursion;

import java.util.Scanner;

public class Chap02_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		int result = fibo(n);
		System.out.println(result);
	}
	
	public static int fibo(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibo(n-1) + fibo(n-2);
	}
}
