package DynamicProgramming;

import java.util.Scanner;

public class Chap08 {
	static Integer dp[];
	static int arr[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		dp = new Integer[n + 1];
		arr = new int[n + 1];
		
		for(int i = 1; i <= n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = arr[0];		// 디폴트로 null으므로 0으로 초기화 해줘야한다.
		dp[1] = arr[1];
		
		if(n >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		
		System.out.println(find(n));
	}
	
	static int find(int n) {
		// 아직 탐색하지 않는 N번째 계단일 경우
		if(dp[n] == null) {
			dp[n] = Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n]; 
		}
		
		return dp[n];
	}
}
