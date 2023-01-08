package Recursion;

import java.util.Scanner;

public class Chap06 {
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sb.append((int) (Math.pow(2, n)-1)).append("\n");
		
		Hanoi(n,1,2,3);
		System.out.println(sb);
	}
	
	public static void Hanoi(int n, int start, int mid, int to) {
		//�̵��� ������ ���� 1�����?
		if(n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		// A -> C�� �ű�ٰ� ������ ��,
		// STEP 1 : n-1���� A���� B�� �̵�(= start ������ n-1���� ������ mid �������� �ű��.)
		Hanoi(n-1, start, to, mid);
		
		// STEP 2 : 1���� A���� C�� �̵�(= start ������ n��° ������ to�������� �ű��.)
		sb.append(start + " " + to + "\n");
		
		// STEP 3 : n-1���� B���� C�� �̵� (=mid ������ n-1���� ������ to �������� �ű��.)
		Hanoi(n-1,mid,start,to);
		
	}
}
