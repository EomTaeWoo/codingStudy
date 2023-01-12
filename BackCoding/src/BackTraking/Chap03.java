package BackTraking;

import java.util.Scanner;

public class Chap03 {
	public static int[] arr;
	public static int n,m;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[m];
		dfs(0);
		System.out.println(sb);
	}
	public static void dfs(int depth) {
		
		// 재귀 깊이가 m과 같아지면 탐색과정에서 담았던 배열을 출력
		if(depth == m) {
			for(int i = 0; i < m; i ++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 1; i <= n; i ++) {
			arr[depth] = i;
			dfs(depth + 1);
		}
	}
}
