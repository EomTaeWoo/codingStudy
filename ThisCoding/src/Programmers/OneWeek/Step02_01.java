package Programmers.OneWeek;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// ����ū��
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
		
		// ���� -> ���� -> ������������ -> ����
		//String[] strNums = new String[numbers.length];
		//for(int i=0; i < numbers.length; i ++) {
		//	strNums[i] = "" + numbers[i];
		//}
		
		// �ڹٿ��� �����ϴ� ��Ʈ�Լ� ���
		// java8 ���� ū ����
		/*
		Arrays.sort(strNums, new Comparator<String>() {
				public int compare(String s1, String s2) {
					return (s2 + s1).compareTo(s1 + s2);
				}
			});
		*/
		// ���ٽ����� �����ϸ� �̷��� �ȴ�.
		//Arrays.sort(strNums, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
		// ���� ��Ʈ
		// ���� ������ ���ų� ����� �����ų�
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
		// startsWith("") �� ����ϴ°� ����
		//if(answer.startsWith("0")) {
		//	return "0";
		//}
		return answer;
	}

}

