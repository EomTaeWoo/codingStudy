package Chap05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Q02 {
	
	public String solution(String str) {
		String answer = "";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == ')') {
				// stack.pop()은 꺼낸값을 리턴합니다.
				while(stack.pop() != '(') {
					
				}
			} else {
				stack.push(x);
			}
		}
		for(int i = 0; i < stack.size(); i ++) {
			answer += stack.get(i);
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
