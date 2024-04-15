package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.
����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
���� ��� N=5�̸�
�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 *
 * �Է� : ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.
�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.

 * ��� : �� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�.
 * 
 * �Է¿��� : 
 * 5
2 3 3 1 3
1 1 2 2 3

 * ��¿��� : 
A
B
A
B
D
 */
public class Q03 {
	
	public String solution(int n, int[] arrA, int[] arrB) {
		String answer = "";
		
		for(int i=0; i < n; i ++) {
			if(arrA[i] == arrB[i]) {
				answer += "D";
			} else if (arrA[i] == 1 && arrB[i] == 3) {
				answer += "A";
			} else if (arrA[i] == 2 && arrB[i] == 1) {
				answer += "A";
			} else if (arrA[i] == 3 && arrB[i] == 2) {
				answer += "A";
			} else {
				answer += "B";
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Q03 T = new Q03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		for(int i = 0; i < n; i ++) {
			arrA[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i ++) {
			arrB[i] = sc.nextInt();
		}
		for(char x : T.solution(n, arrA, arrB).toCharArray()) {
			System.out.println(x);
		}
		
		
	}

}
