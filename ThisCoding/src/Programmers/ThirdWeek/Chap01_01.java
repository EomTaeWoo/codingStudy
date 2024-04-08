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
		int answer = Arrays.stream(clothes)		//모든 옷의 종류가 있다.
				.map(c -> c[1])					// 1번 인덱스 옷의 종류들만 꺼낸다.
				.distinct()						// 중복 제거
				.map(type -> (int) Arrays.stream(clothes).filter(c -> c[1].equals(type)).count())	// 타입에 필터링해서 카운트한다. 타입별로 몇개인지 알 수 있다.
				.map(c -> c + 1)				// 개수에 1을 더해서
				.reduce(1, (c, n) -> c * n);	// 곱해서 누적 개수를 구한다.
		
		return answer - 1 ;
	}

}
