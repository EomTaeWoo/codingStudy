package Programmers.OneWeek;

import java.util.LinkedList;
import java.util.Queue;

// 기지국 설치
public class Step01_01 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = sol.solution(16, new int[] {9}, 2);
		System.out.println(result);
	}

}

class Solution{
	public int solution(int n, int[] stations, int w) {
		int answer = 0;
		
		/*
		 * Queue<Integer> sq = new LinkedList<>(); for(int s : stations) { sq.offer(s);
		 * }
		 */
		int si = 0;
		int position = 1;
		while(position <= n) {
			/*
			if(!sq.isEmpty() && sq.peek() - w <= position) {
				position = sq.poll() + w + 1;
			} else {
				answer += 1;
				position += w * 2 + 1;
			}
			*/
			if(si < stations.length && stations[si] - w <= position) {
				position = stations[si] + w + 1;
				si += 1;
			} else {
				answer += 1;
				position += w * 2 + 1;
			}
			
		}
		return answer;
	}
}
