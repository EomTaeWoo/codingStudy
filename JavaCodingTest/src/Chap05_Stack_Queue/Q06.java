  package Chap05_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q06 {

	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <=n; i ++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 1; i <k; i ++) {
				//.poll() 꺼낸값을 리턴한다.
				q.offer(q.poll());
			}
			q.poll();
			if(q.size() == 1) {
				answer = q.poll();
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
