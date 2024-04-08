package DynamicProgramming;

import java.util.Scanner;

public class Chap05 {
	static int[] arr;		//배열
	static Integer[] dp;	//메모제이션 할 dp
	static int max;			//최댓값 변수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		/**
		 * dp[0] 은 첫 원소로 이전에 더이상 탐색할 것이 없기 떄문에
		 * arr[0] 자체 값이 되므로 arr[0]으로 초기화 해준다.
		 * max또한 첫 번째 원소로 초기화 해준다.
		 */
		
		dp[0] = arr[0];
		max = arr[0];
		
		// dp의 마지막 index는 n - 1이므로 n -1부터 top-down 탐색
		recur(n - 1);
		System.out.println(max);
	}
	
	static int recur(int n) {
		//탐색하지 않은 인덱스라면
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n - 1) + arr[n], arr[n]);
			
			// 해당 dp[n]과 max 중 큰 값으로 max 갱신
			max = Math.max(dp[n], max);
		}
		
		return dp[n];
	}
}
