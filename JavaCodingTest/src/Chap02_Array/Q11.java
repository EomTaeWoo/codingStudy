package Chap02_Array;

import java.util.Scanner;

public class Q11 {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = Integer.MIN_VALUE;	// 최솟값 초기화
		
		for(int i = 1; i <= n; i ++) {
			int cnt = 0;
			for(int j = 1; j <= n; j ++) {
				for(int k = 1; k <= 5; k ++) {
					if(arr[i][k] == arr[j][k]) {
						cnt ++;
						break;
					}
				}
			}
			if(cnt > max) {
				max = cnt;
				answer = i;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Q11 T = new Q11();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6];
		for(int i = 1; i <= n; i ++) {
			for(int j = 1; j <= 5; j ++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
		
	}

}
