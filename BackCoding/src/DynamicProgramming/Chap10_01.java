package DynamicProgramming;

import java.util.Scanner;

public class Chap10_01 {
	// Top - Down 방식
	static Long[][] dp;
	static int n;
	final static long mod = 1000000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		dp = new Long[n + 1][10];
		
		// 첫번째 자릿수는 1로 초기화
		for(int i = 0; i < 10; i ++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		// 마지막 자릿수인 1~9까지의 경우의 수를 모두 더해준다.
		for(int i = 1; i <= 9; i ++) {
			result += recur(n, i);
		}
		System.out.println(result % mod);
	}
	
	/**
	 * digit 는 자릿수, val은 자리값을 의미
	 * 첫째 자리수는 각 val이 끝이지 때문에
	 * 경우의 수는 1밖에 없다. 즉 dp[1]의 각 자릿값은
	 * 1로 초기화 되어야 한다.
	 */
	static long recur(int digit, int val) {
		
		// 첫 째 자리수에 도착한다면 더이상 탐색할 칠요 없음
		if(digit == 1) {
			return dp[digit][val];
		}
		
		// 해당 자릿의 val값에 대해 담색하지 않았을 경우
		if(dp[digit][val] == null) {
			// val이 0일 경우 다음은 1밖에 못옴
			if(val == 0) {
				dp[digit][val] = recur(digit - 1, 1);
			}
			// val이 1일 경우 다음은 8밖에 못옴
			else if(val == 9) {
				dp[digit][val] = recur(digit - 1, 8);
			}
			// 그 외의 경우는 val - 1과 val + 1값의 경우의 수를 합한 경우의 수가 됨
			else {
				dp[digit][val] = recur(digit - 1, val - 1) + recur(digit -1, val + 1);
			}
		}
		return dp[digit][val] % mod;
	}
}
