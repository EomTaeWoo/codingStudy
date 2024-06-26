package Chap01_String;

import java.util.Scanner;

/**
 * 
 * 문자 찾기
 * 설명 : 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 * 대소문자를 구분하지 않습니다. 문자열의 길이는 100을 넘지 않습니다.
 * 
 * 입력 : 첫 출에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 입력예시 : Computercooler , c
 * 출력예시 : 2
 *
 */
public class Q01 {
	
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);	// char변수라서 Character클래스를 써야함
		
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
		char t = sc.next().charAt(0);	// 문자열에서 문자한개를 가져온다.
		
		System.out.println(T.solution(str, t));
	}

}
