package BruteForce;

import java.util.Scanner;

public class Chap02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		for(int i = 0; i < n; i ++) {
			int number = i;
			int sum = 0; //�� �ڸ��� �� ����
			
			while(number != 0) {
				sum += number % 10;	//�� �ڸ��� ���ϱ�
				number /= 10;
			}
			
			// i ���� �� �ڸ��� �������� ���� ��� (�����ڸ� ã���� ���)
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
}
