package DynamicProgramming;

import java.util.Scanner;

public class Chap10_02 {
	// bottom-up ���
	final static long mod = 1000000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[][] dp = new long[n + 1][10];
		
		// ù ��° �ڸ����� ������ �� ���� �ڸ����̹Ƿ� ����� ���� 1���ۿ� ����
		for(int i = 1; i < 10; i ++) {
			dp[1][i] = 1;
		}
		
		// �� ��° �ڸ������� n���� Ž��
		for(int i = 2; i <=n; i ++) {
			//i��° �ڸ����� �ڸ������� Ž��(0 ~ 9)
			for(int j = 0; j < 10; j ++) {
				//j=0 �� �ڸ����� 0�̶�� ���� �ڸ����� ù��° �ڸ����� ����
				if(j == 0) {
					dp[i][0] = dp[ i - 1][1] % mod;
				}
				// j = 9 ��� ���� �ڸ����� 8�� ����
				else if( j == 9) {
					dp[i][9] = dp[i-1][8] % mod;
				}
				
				// �� ���� ��� ���� �ڸ����� �ڸ��� +1, -1�� ���� ��
				else {
					dp[i][j] = (dp[i - 1][j - 1]+ dp[i - 1][j + 1]) % mod;
				}
			}
		}
		
		long result = 0;
		
		// �� �ڸ��������� ����� ���� ��� �����ش�.
		for(int i = 0; i < 10; i ++) {
			result += dp[n][i];
		}
		
		System.out.println(result % mod);
	}

}
