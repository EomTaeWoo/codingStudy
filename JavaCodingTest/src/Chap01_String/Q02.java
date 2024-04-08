package Chap01_String;

import java.util.Scanner;

/**
 * 
 * 대소문자 변환
 * 
 * 설명 : 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * 
 * 입력 : 첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
 * 문자열은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 예시 입력 : StuDY
 * 출력 예시 : sTUdy
 *
 */
public class Q02 {
	
	public String solution(String str) {
		String answer = "";
		
		/*
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {		// Character클래스에 isLowerCase함수가 있음
				answer += Character.toUpperCase(x);
			} else {
				answer += Character.toLowerCase(x);
			}
		}
		*/
		
		// ACCII 넘버로 대문자 65 ~ 90 / 소문자 97 ~ 122
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
