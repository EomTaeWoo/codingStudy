package Programmers.OneWeek;
import java.util.stream.*;

// 예산
public class Step03_01 {

	public static void main(String[] args) {
		int result = solution(new int[] {120, 110, 140, 150}, 485);
		System.out.println(result);
	}
	
	public static int solution(int[] budgets, int M) {
		// 2분법을 활용하기 위해 최소값, 최대값 구해야함
		int min = 0;
		//int max = 0;
		int max = IntStream.of(budgets).max().orElse(0);
		
		/*
		for(int b : budgets) {
			if(b > max) {
				max = b;
			}
		}
		*/
		
		int answer = 0;
		
		while(min <= max) {
			//중간값
			//int mid = (min + max) / 2;
			final int mid = (min + max) / 2;
			
			// 합계
			//int sum = 0;
			int sum = IntStream.of(budgets).map(b -> Math.min(b, mid)).sum();	// mid(가변 변수를 사용하면 안된다.
			
			/*
			for(int b : budgets) {
				if(b > mid) {
					sum += mid;
				} else {
					sum += b;
				}
			}
			*/
			
			if(sum <= M) {
				min = mid + 1;
				answer = mid;
			} else {
				max = mid - 1;
			}
		}
		
		return answer;
	}
}


