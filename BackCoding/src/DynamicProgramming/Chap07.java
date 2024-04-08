package DynamicProgramming;

import java.util.Scanner;

public class Chap07 {
	
	static int[][] arr;
	static Integer[][] dp;
	static int n;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		arr = new int[n][n];
		dp = new Integer[n][n];
		
		// 배열 초기화
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < i + 1; j ++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 가장 마지막 행의 값들을 DP의 마지막 행에도 똑같이 복사
		for(int i = 0; i < n; i ++) {
			dp[n - 1][i] = arr[n - 1][i];
		}
		System.out.println(find(0,0));
	}
	
	static int find(int depth, int idx) {
		
		// 마지막 행일 경우 현재 위치의 dp값 변환
		if(depth == n - 1) return dp[depth][idx];
		
		// 탐색하지 않았던 값일 경우 다음 행의 양폭 값 비교
		if(dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + arr[depth][idx];
		}
		return dp[depth][idx];
	}

}
