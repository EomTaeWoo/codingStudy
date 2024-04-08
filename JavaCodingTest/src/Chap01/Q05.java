package Chap01;

import java.util.Scanner;

public class Q05 {
	
	public String solution(String str) {
		String answer = "";
		char[] a = str.toCharArray();
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(a[lt])) {
				lt ++;
			} else if (!Character.isAlphabetic(a[rt])) {
				rt --;
			} else {
				char tmp = a[lt];
				a[lt] = a[rt];
				a[rt] = tmp;
				lt ++;
				rt --;
			}
		}
		answer = String.valueOf(a);
		return answer;
	}
	
	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}

}
