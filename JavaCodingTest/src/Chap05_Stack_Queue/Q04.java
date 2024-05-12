package Chap05_Stack_Queue;

import java.util.*;

public class Q04 {
	
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x - 48);
			} else {
				int lt = stack.pop();
				int rt = stack.pop();
				if(x == '+') {
					stack.push(rt + lt);
				} else if(x == '-') {
					stack.push(rt - lt);
				} else if(x == '*') {
					stack.push(rt * lt);
				} else if(x == '/') {
					stack.push(rt / lt);
				}
			}
		}
		
		answer = stack.get(0);
		
		return answer;
	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
		
		
	}

}
