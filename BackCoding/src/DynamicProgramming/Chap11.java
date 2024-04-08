package DynamicProgramming;

import java.util.Scanner;

public class Chap11 {
	
	static Integer[] dp;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp = new Integer[n + 1];
		arr = new int[n + 1];
		
		for(int i = 1; i < n + 1; i ++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = 0;
		dp[1] = arr[1];
		
		/**
		 * (n이 1로 주어질 수 있으므로 이럴 떄를 위해 조건식을 달아둔다.
		 * 또한 dp[2]는 어떤 경우에도 첫 번째와 두번째를 합한 것이 최대값이다.
		 */
		if(n > 1) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(recur(n));
	}
	
	static int recur(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(Math.max(n - 2, recur(n - 3) + arr[n - 1]) + arr[n], recur(n - 1));
		}
		
		return dp[n];
	}
}
