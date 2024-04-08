package Chap01;

import java.util.Scanner;

public class Q03 {

	public String solution(String str) {
		String answer = "";
		String[] strList = str.split(" ");
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < strList.length; i++) {
			
			if(strList[i].length() > max) {
				max = strList[i].length();
				answer = strList[i];
			}
		}
		/*
		for(String x : strList) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}*/
		return answer;
	}
	public static void main(String[] args) {
		Q03 T = new Q03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
