package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ���� ã��
 * ���� : �� ���� ���ڿ��� �Է¹ް�, Ư�� ���ڸ� �Է¹޾� �ش� Ư�����ڰ� �Է¹��� ���ڿ��� �� �� �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
 * ��ҹ��ڸ� �������� �ʽ��ϴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 * 
 * �Է� : ù �⿡ ���ڿ��� �־�����, �� ��° �ٿ� ���ڰ� �־�����.
 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * 
 * �Է¿��� : Computercooler , c
 * ��¿��� : 2
 *
 */
public class Q01 {
	
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);	// char������ Character�Լ��� �����
		
		/*
		for(int i = 0; i < str.length(); i ++) {
			if(str.charAt(i) == t) {
				answer ++;
			}
		}
		*/
		
		for(char x : str.toCharArray()) {
			if(x == t) {
				answer ++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char t = sc.next().charAt(0);	// ���ڿ����� �����Ѱ��� �����´�.
		
		System.out.println(T.solution(str, t));
	}

}
