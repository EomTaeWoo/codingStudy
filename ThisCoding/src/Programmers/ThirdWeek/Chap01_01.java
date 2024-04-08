package Programmers.ThirdWeek;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Chap01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int solution(String[][] clothes) {
		Map<String, Integer> counts = new HashMap<>();
		
		for(String[] c : clothes) {
			String type = c[1];
			counts.put(type,counts.getOrDefault(type, 0) + 1);
		}
		
		
		int answer = 1;
		for(Integer c : counts.values()) {
			answer *= c + 1;
		}
		answer -= 1;
		return answer;
	}
	
	public int solution2(String[][] clothes) {
		int answer = Arrays.stream(clothes)		//��� ���� ������ �ִ�.
				.map(c -> c[1])					// 1�� �ε��� ���� �����鸸 ������.
				.distinct()						// �ߺ� ����
				.map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())	// Ÿ�Կ� ���͸��ؼ� ī��Ʈ�Ѵ�. Ÿ�Ժ��� ����� �� �� �ִ�.
				.map(c -> c + 1)				// ������ 1�� ���ؼ�
				.reduce(1, (c, n) -> c * n);	// ���ؼ� ���� ������ ���Ѵ�.
		
		return answer - 1 ;
	}

}
