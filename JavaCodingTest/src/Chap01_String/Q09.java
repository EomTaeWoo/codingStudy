package Chap01_String;

import java.util.Scanner;

/*
 * ���ڸ� ���
 * 
 * ���� : ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�.
 * ���� "tge0a1h205er"���� ���ڸ� �����ϸ� 0,1,2,0,5�̰� �̰��� �ڿ����� ����� 1205�� �˴ϴ�.
 * �����Ͽ� ��������� �ڿ����� 100,000,000�� ���� �ʽ��ϴ�.
 * 
 * �Է� : ù �ٿ� ���ڰ� ���� ���ڿ��� �־����ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 * 
 * ��� : ù �ٿ� �ڿ����� ����մϴ�.
 * 
 * �Է¿��� : g0en2T0s8eSoft
 * ��¿��� : 208
 */

public class Q09 {

	public int solution(String str) {
		String answer = "";
		
		/*
		str = str.replaceAll("[^0-9]", "");
		answer = Integer.parseInt(str);
		*/
		
		// �ƽ�Ű�ѹ��� �ذ�
		/*
		for(char x : str.toCharArray()) {
			if(x >= 48 && x <= 57) {
				answer = answer * 10 + (x-48);
			}
		}
		*/
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				answer += x;
			}
		}
		
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Q09 T = new Q09();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}
