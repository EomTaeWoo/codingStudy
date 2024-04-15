package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * 피보나치 수열
 * 
 * 설명 : 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합아여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13 을 출력하면 된다.
 * 
 * 입력설명 : 첫 ㅈㄹ에 총 하수 N(3 <= N <= 45) 이 입력된다.
 * 
 * 출력설명 : 첫 줄에 피보나치 수열을 출력합니다.
 * 
 * 입력예시 : 10
 * 
 * 출력예시 : 1 1 2 3 5 8 13 21 34 55
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
