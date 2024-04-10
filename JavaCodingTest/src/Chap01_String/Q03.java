package Chap01_String;

import java.util.Scanner;

/**
 * 
 * 문장 속 단어
 * 
 * 설명 : 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 단어는 공백으로 구분됩니다.
 * 
 * 입력 : 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 * 
 * 출력 : 첫 줄에 가장 긴 단어를 출력한다.
 * 
 * 입력예시 : it is time to study
 * 출력예시 : study
 *
 */

public class Q03 {
	
	public String solution(String str) {
		String answer = "";
		
		/*
		int max = Integer.MIN_VALUE;		// 가장 작은값으로 초기화됨.
		String[] strList = str.split(" ");
		
		for(String x : strList) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		*/
		
		// indexOf로 구현
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
		
		// 마지막 단어 체크
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
