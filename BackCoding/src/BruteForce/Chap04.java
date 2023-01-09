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
		
		//배열 입력
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
		
		boolean TF = arr[x][y];	//첫 번째 칸의 색
		
		for(int i = x; i < end_x; i ++) {
			for(int j = y; j < end_y; j ++) {
				
				//올바른 색이 아닐경우 count1증가
				if(arr[i][j] != TF) {
					count ++;
				}
				
				/**
				 * 다음 칸은 색이 바뀌므로
				 * true라면 false로, false라면 true로 값을 변경
				 */
				TF = (!TF);
			}
			TF = !TF;
		}
		
		/**
		 * 첫 번째 칸을 기준으로 할 때의 색칠 할 개수(count)와
		 * 첫 번째 칸의 색의 반대되는 색을 기준으로 할 때의
		 * 색칠 할 개수(64 - count) 중 최솟값을 count에 저장
		 */
		
		count = Math.min(count,64 - count);
		
		/**
		 * 이전까지의 경우 중 최속값보다 현재 count값이
		 * 더 작을 경우 최솟값을 갱신
		 */
		
		min = Math.min(min, count);
	}

}
