package DynamicProgramming;

import java.util.Scanner;

public class Chap02 {
	/**
	 * 함수 w에서 a, b, c 중 20이 넘어가게 되면w(20, 20, 20)을 호출하고,
	 * 0이하일 경우는 1을 반환하기 때문에
	 * 각 배열의 크기가 21 (0 ~ 20)을 넘기지 않는다.
	 */
	static int[][][] dp = new int[21][21][21];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			System.out.printf("w(%d, %d, %d) = %d\n",a,b,c,w(a,b,c));
		}
	}
	
	static int w(int a, int b, int c) {
		
		// a,b,c 가 범위를 벗어나지 않으면서 메모이제이션이 되어있는 경우
		if(inRange(a,b,c) && dp[a][b][c] != 0) {
			return dp[a][b][c];
		}
		
		if(a <= 0 || b <= 0 || c <= 0) {
			return 1;
		}
		
		if (a > 20 || b > 20 || c > 20) {
			return dp[20][20][20] = w(20, 20, 20);
		}
		
		if( a < b && b < c) {
			return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1)  - w(a, b-1, c);
		}
		
		return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
	}
	
	static boolean inRange(int a, int b, int c) {
		return  0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}
}
