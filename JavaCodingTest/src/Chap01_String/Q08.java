package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ������ �Ӹ����
 * 
 * ���� : �տ��� ���� ���� �ڿ��� ���� ���� ���� ���ڿ��� �Ӹ�����̶�� �մϴ�.
 * ���ڿ��� �ԷµǸ� �ش� ���ڿ��� �Ӹ�����̸� "YES", �ƴϸ� "NO"�� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �� ȸ���� �˻��� �� ���ĺ��� ������ ȸ���� �˻��ϸ�, ��ҹ��ڸ� �������� �ʽ��ϴ�.
 * ���ĺ� �̿��� ���ڵ��� �����մϴ�.
 * 
 * �Է� : ù �ٿ� ���� 100�� ���� �ʴ� ������ ���� ���ڿ��� �־����ϴ�.
 * 
 * ��� : ù ��° �ٿ� �Ӹ���������� ����� YES �Ǵ� NO�� ����մϴ�.
 * 
 * �Է¿��� : found7, time: study; Yduts; emit, 7Dnuof
 * ��¿��� : YES
 *
 */
public class Q08 {

	public String solution(String str) {
		String answer = "";
		
		str = str.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) {
			answer = "YES";
		} else {
			answer = "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		Q08 T = new Q08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.solution(str));
	}

}
