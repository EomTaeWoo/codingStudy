package Chap01;

import java.util.Scanner;

public class Q06 {

	public String solution(String str) {
		String answer = "";
		for(int i = 0; i < str.length(); i ++) {
			//System.out.println(str.charAt(i) + " " + str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) {
				answer+= str.charAt(i);
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
