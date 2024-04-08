package DynamicProgramming;

import java.util.Scanner;

public class Chap06 {
	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;
	
	static int[][] cost;
	static int[][] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		cost = new int[n][3];
		dp = new int[n][3];
		
		for(int i = 0; i < n; i ++) {
			cost[i][Red] = sc.nextInt();
			cost[i][Green] = sc.nextInt();
			cost[i][Blue] = sc.nextInt();
		}
		
		// dp�� ù��° ��(��)�� �� �������� ù��° ������ �ʱ�ȭ
		dp[0][Red] = cost[0][Red];
		dp[0][Green] = cost[0][Green];
		dp[0][Blue] = cost[0][Blue];
		
		System.out.print(Math.min(paint_cost(n-1,Red), Math.min(paint_cost(n-1,Green), paint_cost(n-1,Blue))));
	}
	
	static int paint_cost(int n, int color) {
		
		// ���� Ž������ ���� �迭�̶��
		if(dp[n][color] ==0) {
			
			//color�� ���� ���� ���� ���� ���� �ٸ� ���� ���ȣ���Ͽ� �ּڰ��� ���� ���� ����� ���ؼ� dp�� ����
			if(color == Red) {
				dp[n][Red] = Math.min(paint_cost(n - 1, Green), paint_cost(n-1,Blue)) + cost[n][Red];
			} else if(color == Green) {
				dp[n][Green] = Math.min(paint_cost(n - 1, Red), paint_cost(n-1,Blue)) + cost[n][Green];
			} else {
				dp[n][Blue] = Math.min(paint_cost(n - 1, Red), paint_cost(n-1,Green)) + cost[n][Blue];
			}
		}
		return dp[n][color];
	}
}
