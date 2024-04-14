package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * ���̴� �л�
 * 
 * ���� : �������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ� �������� �� �� �ִ�
 * �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (� �л��� �ڱ� �տ� �� �ִ� �л��麸�� ũ�� �� �л��� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)
 * 
 * �Է� ���� : ù �ٿ� ���� N(5 <= N <= 100000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
 * 
 * ��¼��� : �������� �� �� �ִ� �ִ��л����� ����Ѵ�.
 * 
 * �Է¿��� : 8
 * 130 135 148 140 145 150 150 153
 * 
 * ��¿��� : 5
 *
 */
public class Q02 {

	public int solution(int[] arr) {
		int answer = 1;
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i ++) {
			if(max < arr[i]) {
				max = arr[i];
				answer ++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Q02 T = new Q02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr));
		
	}

}
