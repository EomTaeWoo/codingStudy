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
	
	// Ž��
	static int search(int[] arr, int n, int m) {
		int result = 0;
		
		// 3���� ���� ������ ù��° ī��� n-2������ ��ȸ
		for(int i = 0; i < n; i ++) {
			
			// �� ��° ī��� ù ��° ī�� �������� n-1������ ��ȸ
			for(int j = i+1; j < n-1; j++) {
				
				// �� ��° ī��� �� ��° ī�� �������� n���� ��ȸ
				for(int k = j + 1; k < n; k ++) {
					
					// 3�� ī���� �� ���� temp
					int temp = arr[i] + arr[j] + arr[k];
					
					// m�� �� ī���� ���� ���ٸ� temp return �� ����
					if (m == temp) {
						return temp;
					}
					
					// �� ī���� ���� ���� �պ��� ũ�ٸ� m���� ���� ��� result ����
					if(result < temp && temp < m) {
						result = temp;
					}
				}
			}
		}
		
		// ��� ��ȸ�� ��ġ�� result ����
		return result;
	}
}
