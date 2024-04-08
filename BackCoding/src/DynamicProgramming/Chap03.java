package DynamicProgramming;

import java.util.Scanner;

public class Chap03 {
	public static int[] dp = new int[10000001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i < dp.length; i ++) {
			dp[i] = -1;
		}
		System.out.println(Tile(n));
	}
	
	public static int Tile(int n) {
		if(dp[n] == -1) {
			dp[n] = (Tile(n - 1) + Tile(n - 2)) % 15746;
		}
		return dp[n];
	}
}