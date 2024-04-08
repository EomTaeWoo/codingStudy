package DynamicProgramming;

import java.util.Scanner;

public class Chap10_01 {
	// Top - Down ���
	static Long[][] dp;
	static int n;
	final static long mod = 1000000000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		dp = new Long[n + 1][10];
		
		// ù��° �ڸ����� 1�� �ʱ�ȭ
		for(int i = 0; i < 10; i ++) {
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		// ������ �ڸ����� 1~9������ ����� ���� ��� �����ش�.
		for(int i = 1; i <= 9; i ++) {
			result += recur(n, i);
		}
		System.out.println(result % mod);
	}
	
	/**
	 * digit �� �ڸ���, val�� �ڸ����� �ǹ�
	 * ù° �ڸ����� �� val�� ������ ������
	 * ����� ���� 1�ۿ� ����. �� dp[1]�� �� �ڸ�����
	 * 1�� �ʱ�ȭ �Ǿ�� �Ѵ�.
	 */
	static long recur(int digit, int val) {
		
		// ù ° �ڸ����� �����Ѵٸ� ���̻� Ž���� ĥ�� ����
		if(digit == 1) {
			return dp[digit][val];
		}
		
		// �ش� �ڸ��� val���� ���� ������� �ʾ��� ���
		if(dp[digit][val] == null) {
			// val�� 0�� ��� ������ 1�ۿ� ����
			if(val == 0) {
				dp[digit][val] = recur(digit - 1, 1);
			}
			// val�� 1�� ��� ������ 8�ۿ� ����
			else if(val == 9) {
				dp[digit][val] = recur(digit - 1, 8);
			}
			// �� ���� ���� val - 1�� val + 1���� ����� ���� ���� ����� ���� ��
			else {
				dp[digit][val] = recur(digit - 1, val - 1) + recur(digit -1, val + 1);
			}
		}
		return dp[digit][val] % mod;
	}
}
