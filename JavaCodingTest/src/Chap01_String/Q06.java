package Chap01_String;

import java.util.Scanner;

/**
 * 
 * �ߺ���������
 * 
 * ���� : �ҹ��ڷ� �� �Ѱ��� ���ڿ��� �ԷµǸ� �ߺ��� ���ڸ� �����ϰ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * �ߺ��� ���ŵ� ���ڿ��� �� ���ڴ� ���� ���ڿ��� ������ �����մϴ�.
 * 
 * �Է� : ù �ٿ� ���ڿ��� �Էµ˴ϴ�. ���ڿ��� ���̴� 100�� ���� �ʴ´�.
 * 
 * ��� : ù �ٿ� �ߺ����ڰ� ���ŵ� ���ڿ��� ����մϴ�.
 * 
 * �Է¿��� : ksekkset
 * ��¿��� : kset
 *
 */
public class Q06 {
	
	public String solution(String str) {
		String answer = "";
		
		for(int i = 0; i < str.length(); i ++) {
			//System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q06 T = new Q06();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}
