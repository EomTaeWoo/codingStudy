package Chap05_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q07 {
	
	public String solution(String a, String b) {
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		for(char x : a.toCharArray()) {
			Q.offer(x);
		}
		
		for(char x : b.toCharArray()) {
			if(Q.contains(x)) {
				if(x != Q.poll()) {
					return "NO";
				}
			}
		}
		if(!Q.isEmpty()) {
			return "NO";
		}
		
		return answer;
	}
	public static void main(String[] args) {
		
		Q07 T = new Q07();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(T.solution(a, b));
		
	}

}
