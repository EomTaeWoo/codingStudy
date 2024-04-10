package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ���� �� �ܾ�
 * 
 * ���� : �� ���� ������ �־����� �� ���� �ӿ��� ���� �� �ܾ ����ϴ� ���α׷��� �ۼ��ϼ���.
 * ������� �ܾ�� �������� ���е˴ϴ�.
 * 
 * �Է� : ù �ٿ� ���̰� 100�� ���� �ʴ� �� ���� ������ �־����ϴ�. ������ ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * 
 * ��� : ù �ٿ� ���� �� �ܾ ����Ѵ�.
 * 
 * �Է¿��� : it is time to study
 * ��¿��� : study
 *
 */

public class Q03 {
	
	public String solution(String str) {
		String answer = "";
		
		/*
		int max = Integer.MIN_VALUE;		// ���� ���������� �ʱ�ȭ��.
		String[] strList = str.split(" ");
		
		for(String x : strList) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		*/
		
		// indexOf�� ����
		int max = Integer.MIN_VALUE, pos;
		while((pos = str.indexOf(' ')) != -1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > max) {
				max = len;
				answer = tmp;
			}
			str = str.substring(pos + 1);
		}
		
		// ������ �ܾ� üũ
		if(str.length() > max) {
			answer = str;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Q03 T = new Q03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println(T.solution(str));
		
	}
}
