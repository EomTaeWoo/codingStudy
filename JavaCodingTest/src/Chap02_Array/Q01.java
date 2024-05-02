package Chap02_Array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * ū �� ����ϱ�
 * 
 * ���� : N���� ������ �Է¹޾�, �ڽ��� �ٷ� �� ������ ū ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * (ù ��° ���� ������ ����Ѵ�.)
 * 
 * �Է� : ù �⿡ �ڿ��� N�� �־�����, �� ���� �ٿ� N���� ������ �Էµȴ�.
 * 
 * ��� : �ڽ��� �ٷ� �� ������ ū ���� �� �ٷ� ����Ѵ�.
 * 
 * �Է¿��� : 6
 * 7 3 9 5 6 12
 * 
 * ��¿��� : 7 9 6 12
 *
 */

public class Q01 {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		answer.add(arr[0]);
		for(int i = 1; i < n; i++) {
			if(arr[i] > arr[i - 1]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		
	}

}