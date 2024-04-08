package DynamicProgramming;

import java.util.Scanner;

public class Chap04 {
	public static Long[] seq = new Long[101];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		seq[0] = 0L;
		seq[1] = 1L;
		seq[2] = 1L;
		seq[3] = 1L;
		
		int t = sc.nextInt();
		while(t--> 0) {
			int n = sc.nextInt();
			System.out.println(padovan(n));
		}
	}
	
	public static long padovan(int n) {
		if(seq[n] == null) {
			seq[n] = padovan(n - 2) + padovan(n - 3);
		}
		return seq[n];
	}
}
