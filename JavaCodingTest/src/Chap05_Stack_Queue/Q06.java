package Chap05_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q06 {

	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> Q = new LinkedList<>();
		
		for(int i = 1; i <= n; i ++) {
			Q.offer(i);
		}
		while(!Q.isEmpty()) {
			for(int i = 1; i < k; i ++) {
				Q.offer(Q.poll());
			}
			Q.poll();
			if(Q.size() == 1) {
				answer = Q.poll();
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Q06 T = new Q06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(T.solution(n, k));
		
		
	}
}
