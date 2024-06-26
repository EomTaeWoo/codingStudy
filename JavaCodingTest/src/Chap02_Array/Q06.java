package Chap02_Array;

import java.util.Scanner;

public class Q06 {

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
