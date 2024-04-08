package Chap01;

import java.util.Scanner;

public class Q07 {
	
	public String solution(String str) {
		String answer = "YES";
		/*
		 * str = str.toUpperCase();
		 * 
		 * for(int i = 0; i < str.length()/2; i ++) { if(str.charAt(i) !=
		 * str.charAt((str.length() - i - 1))) { answer = "NO"; } }
		 */
		String tmp = new StringBuilder(str).reverse().toString();
		if(!str.equalsIgnoreCase(tmp)) {
			answer = "NO";
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
