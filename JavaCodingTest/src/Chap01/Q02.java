package Chap01;

import java.util.Scanner;

public class Q02 {

	public static String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) {
			/*
			 * if(Character.isLowerCase(x)) { answer+= Character.toUpperCase(x); } else {
			 * answer+= Character.toLowerCase(x); }
			 */
			if(x >= 65 && x <= 90) {
				answer+= (char)(x+32);
			} else {
				answer+= (char)(x-32);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Q02 T = new Q02();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.solution(str));
	}

}
