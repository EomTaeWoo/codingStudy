package DynamicProgramming;

import java.util.Scanner;

public class Chap05 {
	static int[] arr;		//�迭
	static Integer[] dp;	//�޸����̼� �� dp
	static int max;			//�ִ� ����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		/**
		 * dp[0] �� ù ���ҷ� ������ ���̻� Ž���� ���� ���� ������
		 * arr[0] ��ü ���� �ǹǷ� arr[0]���� �ʱ�ȭ ���ش�.
		 * max���� ù ��° ���ҷ� �ʱ�ȭ ���ش�.
		 */
		
		dp[0] = arr[0];
		max = arr[0];
		
		// dp�� ������ index�� n - 1�̹Ƿ� n -1���� top-down Ž��
		recur(n - 1);
		System.out.println(max);
	}
	
	static int recur(int n) {
		//Ž������ ���� �ε������
		if(dp[n] == null) {
			dp[n] = Math.max(recur(n - 1) + arr[n], arr[n]);
			
			// �ش� dp[n]�� max �� ū ������ max ����
			max = Math.max(dp[n], max);
		}
		
		return dp[n];
	}
}
