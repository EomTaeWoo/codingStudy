package ThisCodingTest.Implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chap04 {

	public static String str;
	public static ArrayList<Character> result = new ArrayList<Character>();
	public static int value = 0;
	
	public static void main(String[] args) {
		// 문자열 재정렬
		/*
		알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력으로 주어집니다. 이때 모든 알파벳을 오름차순으로
		정렬하여 이어서 출력한 뒤에, 그 뒤에 모든 숫자를 더한 값을 이어서 출력합니다.
		예를 들어 K1KA5CB7이라는 값이 들어오면 ABCKK13을 출력합니다
		*/
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		
		//문자를 하나씩 확인하며
		for(int i = 0; i< str.length(); i ++) {
			//알파벳인 경우 결과 리스트에 삽입
			if(Character.isLetter(str.charAt(i))) {
				result.add(str.charAt(i));
			} else {
				value += str.charAt(i) - '0';
			}
		}
		
		//알파벡을 오름차순으로 정렬
		Collections.sort(result);
		
		//알파벳을 차례대로 출력
		for(int i = 0; i < result.size(); i ++) {
			System.out.print(result.get(i));
		}
		// 숫자가 하나라도 존재하는 경우 가장 뒤에 출력
		if(value != 0) System.out.print(value);
		System.out.println();
	}

}
