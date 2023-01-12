package BackTraking;

import java.util.Scanner;

public class Chap07 {
	
	public static int max = Integer.MIN_VALUE;		// 최댓값
	public static int min = Integer.MAX_VALUE;		// 최솟값
	public static int[] operator = new int[4];		// 연산자 개수
	public static int[] number;						// 숫자
	public static int n;							// 숫자 개수
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		number = new int[n];
		
		for(int i = 0; i < n; i ++) {
			number[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i ++) {
			operator[i] = sc.nextInt();
		}
		
		dfs(number[0],1);
		
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int num, int idx) {
		if(idx == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for(int i = 0; i < 4; i ++) {
			// 연산자 개수가 1개 이상인 경우
			if(operator[i] > 0) {
				
				// 해당 연산자를 1 감소시킨다.
				operator[i]--;
				
				switch(i) {
				case 0 : dfs(num + number[idx], idx + 1); break;
				case 1 : dfs(num - number[idx], idx + 1); break;
				case 2 : dfs(num * number[idx], idx + 1); break;
				case 3 : dfs(num / number[idx], idx + 1); break;
				}
				// 재귀호출이 종료되면 다시 해당 연산자 개수를 복구한다.
				operator[i]++;
			}
		}
	}
}
