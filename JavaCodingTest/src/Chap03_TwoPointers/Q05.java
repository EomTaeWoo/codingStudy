package Chap03_TwoPointers;

import java.util.Scanner;

public class Q05 {
	
	public int solution(int n){
		int answer = 0;
		int[] arr = new int[n/2 + 1];
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = i + 1;
		}
		
		int sum = 0;
		int lt = 0;
		for(int rt = 0; rt < arr.length; rt ++) {
			sum += arr[rt];
			if(sum == n) {
				answer ++;
			}
			while(sum > n) {
				sum -= arr[lt++];
				if(sum == n) {
					answer ++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(T.solution(n));
	}

}
