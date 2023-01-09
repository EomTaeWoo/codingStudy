package BruteForce;

import java.util.Scanner;

public class Chap04 {
	
	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		arr = new boolean[n][m];
		
		//�迭 �Է�
		for(int i = 0; i < n; i ++) {
			String str = sc.next();
			
			for(int j = 0; j < m; j ++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
		
		int n_row = n - 7;
		int m_row = m - 7;
		
		for(int i = 0; i < n_row; i ++) {
			for(int j = 0; j < m_row; j ++) {
				find(i,j);
			}
		}
		System.out.println(min);
		
	}
	
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y];	//ù ��° ĭ�� ��
		
		for(int i = x; i < end_x; i ++) {
			for(int j = y; j < end_y; j ++) {
				
				//�ùٸ� ���� �ƴҰ�� count1����
				if(arr[i][j] != TF) {
					count ++;
				}
				
				/**
				 * ���� ĭ�� ���� �ٲ�Ƿ�
				 * true��� false��, false��� true�� ���� ����
				 */
				TF = (!TF);
			}
			TF = !TF;
		}
		
		/**
		 * ù ��° ĭ�� �������� �� ���� ��ĥ �� ����(count)��
		 * ù ��° ĭ�� ���� �ݴ�Ǵ� ���� �������� �� ����
		 * ��ĥ �� ����(64 - count) �� �ּڰ��� count�� ����
		 */
		
		count = Math.min(count,64 - count);
		
		/**
		 * ���������� ��� �� �ּӰ����� ���� count����
		 * �� ���� ��� �ּڰ��� ����
		 */
		
		min = Math.min(min, count);
	}

}
