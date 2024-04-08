package Programmers.OneWeek;
import java.util.stream.*;

// ����
public class Step03_01 {

	public static void main(String[] args) {
		int result = solution(new int[] {120, 110, 140, 150}, 485);
		System.out.println(result);
	}
	
	public static int solution(int[] budgets, int M) {
		// 2�й��� Ȱ���ϱ� ���� �ּҰ�, �ִ밪 ���ؾ���
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
			//�߰���
			//int mid = (min + max) / 2;
			final int mid = (min + max) / 2;
			
			// �հ�
			//int sum = 0;
			int sum = IntStream.of(budgets).map(b -> Math.min(b, mid)).sum();	// mid(���� ������ ����ϸ� �ȵȴ�.
			
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


