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
		
		// dp의 첫번째 값(집)은 각 색상비용의 첫번째 값으로 초기화
		dp[0][Red] = cost[0][Red];
		dp[0][Green] = cost[0][Green];
		dp[0][Blue] = cost[0][Blue];
		
		System.out.print(Math.min(paint_cost(n-1,Red), Math.min(paint_cost(n-1,Green), paint_cost(n-1,Blue))));
	}
	
	static int paint_cost(int n, int color) {
		
		// 만약 탐색하지 않은 배열이라면
		if(dp[n][color] ==0) {
			
			//color의 색에 따라 이전 집의 서로 다른 색을 재귀호츌하여 최솟값과 현재 집의 비용을 더해서 dp에 저장
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
