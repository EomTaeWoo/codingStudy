package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * �Ҽ� (�����佺�׳׽� ü)
 * 
 * ���� : �ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ���� 20�� �ԷµǸ� 1���� 20������ �Ҽ��� 2,3,5,7,11,13,17,19�� 8�� �Դϴ�.
 * ���ѽð��� 1���Դϴ�.
 * 
 * �Է¼��� : ù �ٿ� �ڿ����� ���� N(2 <= N < 200000)�� �־����ϴ�.
 * 
 * ��¼��� : ù �ٿ� �Ҽ��� ������ ����մϴ�.
 * 
 * �Է¿��� : 20
 * 
 * ��¿��� : 8
 *
 */

public class Q05 {

	public int solution(int n) {
		int answer = 0;
		
		int[] ch = new int[n + 1];
		for(int i = 2; i <= n; i ++) {
			if(ch[i] == 0) {
				answer ++;
				for(int j = i; j <= n; j=j+i) {
					ch[j] = 1;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(T.solution(n));
		
	}
}
