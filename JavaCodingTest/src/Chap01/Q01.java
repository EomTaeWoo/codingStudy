package Chap01;

import java.util.*;

public class Q01 {
	
	public int solution(String str, char c) {
		int answer = 0;
		
		str = str.toUpperCase();
		c = Character.toUpperCase(c);
		//System.out.println(str + " " + c);
		/*
		 * for(int i = 0; i < str.length(); i ++) { if(str.charAt(i) == c) { answer++; }
		 * }
		 */
		for(char x : str.toCharArray()) {
			if(x == c) {
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		char c = kb.next().charAt(0);
		
		System.out.println(T.solution(str,c));
		
	}

}
