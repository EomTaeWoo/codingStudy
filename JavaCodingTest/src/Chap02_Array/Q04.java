package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * �Ǻ���ġ ����
 * 
 * ���� : 1) �Ǻ���ġ ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� �վƿ� ���� ���ڰ� �Ǵ� �����̴�.
 * 2) �Է��� �Ǻ���ġ ������ �� ���� ���̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13 �� ����ϸ� �ȴ�.
 * 
 * �Է¼��� : ù ������ �� �ϼ� N(3 <= N <= 45) �� �Էµȴ�.
 * 
 * ��¼��� : ù �ٿ� �Ǻ���ġ ������ ����մϴ�.
 * 
 * �Է¿��� : 10
 * 
 * ��¿��� : 1 1 2 3 5 8 13 21 34 55
 *
 */

public class Q04 {

	public int[] solution(int n) {
		int[] answer = new int[n];
		
		answer[0] = 1;
		answer[1] = 1;
		
		for(int i = 2; i < n; i ++) {
			answer[i] = answer[i - 2] + answer[i -1];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}
		
	}
}
