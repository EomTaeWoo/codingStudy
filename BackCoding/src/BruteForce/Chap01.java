package BruteForce;

import java.util.Scanner;

public class Chap01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		
		int result = search(arr,n,m);
		System.out.println(result);
	}
	
	// 탐색
	static int search(int[] arr, int n, int m) {
		int result = 0;
		
		// 3개를 고르기 때문에 첫번째 카드는 n-2까지만 순회
		for(int i = 0; i < n; i ++) {
			
			// 두 번째 카드는 첫 번째 카드 다음부터 n-1까지만 순회
			for(int j = i+1; j < n-1; j++) {
				
				// 세 번째 카드는 두 번째 카드 다음부터 n까지 순회
				for(int k = j + 1; k < n; k ++) {
					
					// 3개 카드의 합 변수 temp
					int temp = arr[i] + arr[j] + arr[k];
					
					// m과 세 카드의 합이 같다면 temp return 및 종료
					if (m == temp) {
						return temp;
					}
					
					// 세 카드의 합이 이전 합보다 크다면 m보다 작을 경우 result 갱신
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		
		// 모든 순회를 마치면 result 리턴
		return result;
	}
}
