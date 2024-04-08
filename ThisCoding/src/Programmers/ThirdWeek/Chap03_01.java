package Programmers.ThirdWeek;

import java.util.Stack;

public class Chap03_01 {
	
	// ¿­¸®´Â °ýÈ£, ´ÝÈ÷´Â °ýÈ£ °¹¼ö
	class Galho{
		int open, close;

		public Galho(int open, int close) {
			this.open = open;
			this.close = close;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// ±íÀÌ ¿ì¼± Å½»ö
	public int solution(int n) {
		int answer = 0;
		
		Stack<Galho> stack = new Stack<>();
		stack.push(new Galho(0,0));
		while(!stack.isEmpty()) {
			Galho g = stack.pop();
			
			if(g.open > n) {
				continue;
			}
			if(g.open < g.close) {
				continue;
			}
			// ¿Ã¹Ù¸¥ Á¶°Ç
			if(g.open + g.close == 2 * n) {
				answer ++;
				continue;
			}
			
			stack.push(new Galho(g.open+1, g.close));	// ¿­¸®´Â °ýÈ£
			stack.push(new Galho(g.open, g.close+1));	// ´ÝÈ÷´Â °ýÈ£
		}
		
		return answer;
	}
}
