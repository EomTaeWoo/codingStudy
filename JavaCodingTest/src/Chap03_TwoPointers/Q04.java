package Chap03_TwoPointers;

import java.util.Scanner;

public class Q04 {
	
	public int solution(int n, int k, int[] arr){
		int answer = 0;
		int sum = 0;
		int lt = 0;
		for(int rt = 0; rt < n ; rt ++) {
			sum += arr[rt];
			if(sum == k) {
				answer ++;
			}
			while (sum >= k) {
				sum -= arr[lt++];
				if(sum == k) {
					answer ++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(T.solution(n, k, arr));
	}
}
