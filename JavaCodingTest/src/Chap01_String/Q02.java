package Chap01_String;

import java.util.Scanner;

/**
 * 
 * ��ҹ��� ��ȯ
 * 
 * ���� : �빮�ڿ� �ҹ��ڰ� ���� �����ϴ� ���ڿ��� �Է¹޾� �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
 * 
 * �Է� : ù �ٿ� ���ڿ��� �Էµȴ�. ���ڿ��� ���̴� 100�� ���� �ʽ��ϴ�.
 * ���ڿ��� ���� ���ĺ����θ� �����Ǿ� �ֽ��ϴ�.
 * 
 * ���� �Է� : StuDY
 * ��� ���� : sTUdy
 *
 */
public class Q02 {
	
	public String solution(String str) {
		String answer = "";
		
		/*
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {		// CharacterŬ������ isLowerCase�Լ��� ����
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}
		}
		*/
		
		// ACCII �ѹ��� �빮�� 65 ~ 90 / �ҹ��� 97 ~ 122
		for(char x : str.toCharArray()) {
			if(x >= 65 && x < 90) {
				answer += (char) (x + 32);
			} else if(x >= 97 && x <= 122){
				answer += (char) (x - 32);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q02 T = new Q02();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
		
	}
}
