package Programmers.OneWeek;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// 가장큰수
public class Step02_01 {

	public static void main(String[] args) {
		
		String result = solution(new int[] {6, 10, 2});
		System.out.println(result);
	}
	
	public static String solution(int[] numbers){
		String answer = IntStream.of(numbers)
						.mapToObj(String::valueOf)
						.sorted((s1,s2) -> (s2 + s1)
						.compareTo(s1+s2))
						.collect(Collectors.joining());
		
		// 숫자 -> 문자 -> 내림차순정렬 -> 조합
		//String[] strNums = new String[numbers.length];
		//for(int i=0; i < numbers.length; i ++) {
		//	strNums[i] = "" + numbers[i];
		//}
		
		// 자바에서 제공하는 솔트함수 사용
		// java8 보다 큰 버전
		/*
		Arrays.sort(strNums, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return (s2 + s1).compareTo(s1 + s2);
				}
			});
		*/
		// 람다식으로 변경하면 이렇게 된다.
		//Arrays.sort(strNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
		// 버블 솔트
		// 무한 루프를 돌거나 계산이 느리거나
		/*
		for(int i = 0; i < strNums.length - 1; i++) {
			for(int j = i + 1; j < strNums.length; j ++) {
				String s1 = strNums[i];
				String s2 = strNums[j];
				if((s1+s2).compareTo(s2+s1) < 0) {
					strNums[i] = strNums[j];
					strNums[j] = s1;
				}
			}
		}
		*/
		
		
		//String answer = "";
		
		//for(String s : strNums) {
		//	answer += s;
		//}
		
		/*
		 * if(answer.charAt(0) == '0') { return "0"; }
		 */
		// startsWith("") 를 사용하는걸 권장
		//if(answer.startsWith("0")) {
		//	return "0";
		//}
		return answer;
	}

}

