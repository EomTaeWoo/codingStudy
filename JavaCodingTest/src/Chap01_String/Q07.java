package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ȸ�� ���ڿ�
 * 
 * ���� : �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� ȸ�� ���ڿ��̶�� �մϴ�.
 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� ȸ�� ���ڿ��̸� 'yes', ȸ�� ���ڿ��� �ƴϸ� 'no'�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ��ҹ��ڸ� �������� �ʽ��ϴ�.
 * 
 * �Է� : ù �⿡ ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
 * 
 * ��� : ù ��° �ٿ� ȸ�� ���ڿ������� ����� yes �Ǵ� no�� ����մϴ�.
 * 
 * �Է¿��� : gooG
 * ��¿��� : yes
 *
 */

public class Q07 {

	public String solution(String str) {
		String answer = "";
		
		
		/*
		String strr = str.toUpperCase();
		for(int i = 0; i < str.length()/2; i ++) {
			if(strr.charAt(i) == strr.charAt(str.length() - i - 1)) {
				answer = "yes";
			} else {
				answer = "no";
			}
		}
		*/
		
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) {
			answer = "yes";
		} else {
			answer = "no";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q07 T = new Q07();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}
