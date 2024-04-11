package Chap01_String;

import java.util.Scanner;

/**
 * 
 * 회문 문자열
 * 
 * 설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 'yes', 회문 문자열이 아니면 'no'를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 * 
 * 입력 : 첫 출에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 * 
 * 출력 : 첫 번째 줄에 회문 문자열인지의 결과를 yes 또는 no로 출력합니다.
 * 
 * 입력예시 : gooG
 * 출력예시 : yes
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
