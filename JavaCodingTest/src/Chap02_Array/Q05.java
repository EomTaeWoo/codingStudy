package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * 소수 (에라토스테네스 체)
 * 
 * 설명 : 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19총 8개 입니다.
 * 제한시간은 1초입니다.
 * 
 * 입력설명 : 첫 줄에 자연수의 개수 N(2 <= N < 200000)이 주어집니다.
 * 
 * 출력설명 : 첫 줄에 소수의 개수를 출력합니다.
 * 
 * 입력예시 : 20
 * 
 * 출력예시 : 8
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
