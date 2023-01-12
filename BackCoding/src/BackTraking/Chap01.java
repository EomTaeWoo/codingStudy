package BackTraking;

import java.util.Scanner;

public class Chap01 {
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(n,m,0);
	}
	public static void dfs(int n, int m, int depth) {
		
		// ��� ���̰� m�� �������� Ž���������� ��Ҵ� �迭�� ���
		if(depth == m) {
			for(int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < n; i ++) {
			
			// ���� �ش� ���(��)�� �湮���� �ʾҴٸ�?
			if(!visit[i]) {
				
				visit[i] = true;		// �ش� ��带 �湮�� ���·� ����
				arr[depth] = i + 1;		// �ش� ���̸� index�� �Ͽ� i + 1 �� ����
				dfs(n,m,depth + 1);		// ���� �ڽ� ��� �湮�� ���� depth 1 ������Ű�鼭 ���ȣ��
				
				// �ڽĳ�� �湮�� ������ ���ƿ��� �湮��带 �湮���� ���� ���·� ����
				visit[i] = false;
			}
		}
	}
}
