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
		
		// �迭 �ʱ�ȭ
		for(int i = 0; i < n; i ++) {
			for(int j = 0; j < i + 1; j ++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// ���� ������ ���� ������ DP�� ������ �࿡�� �Ȱ��� ����
		for(int i = 0; i < n; i ++) {
			dp[n - 1][i] = arr[n - 1][i];
		}
		System.out.println(find(0,0));
	}
	
	static int find(int depth, int idx) {
		
		// ������ ���� ��� ���� ��ġ�� dp�� ��ȯ
		if(depth == n - 1) return dp[depth][idx];
		
		// Ž������ �ʾҴ� ���� ��� ���� ���� ���� �� ��
		if(dp[depth][idx] == null) {
			dp[depth][idx] = Math.max(find(depth+1, idx), find(depth+1, idx+1)) + arr[depth][idx];
		}
		return dp[depth][idx];
	}

}
