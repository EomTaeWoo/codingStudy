package OneArray;

import java.util.HashSet;
import java.util.Scanner;

public class Chap04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * int[] num1 = null ; int[] num2 = null ; int cnt = 0;
		 * 
		 * for (int i=0;i<10;i++) { num1[i] = sc.nextInt(); } for (int i = 0; i < 10 ;
		 * i++) { num2[i] = num1[i]%42; if (num2[i] == num2[i+1]) { cnt++; } }
		 * System.out.println(cnt);
		 */
		HashSet<Integer> h = new HashSet<Integer>();
		
		for (int i = 0; i< 10; i++) {
			h.add(sc.nextInt()%42);
			//�Է¹��� ���� ������ ���� add�޼��带 ���� hashset�� ����
		}
		sc.close();
		System.out.println(h.size());
	}

}
