package ThisCodingTest.Grid;

import java.util.Scanner;

public class Chap03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//첫번째 문자를 숫자로 변경한 값을 대입
		long result = str.charAt(0) - '0';
		
		for(int i = 1; i < str.length(); i ++) {
			// 두 수 중에서 하나라도 '0' 혹은 '1' 인 경우, 곱하기보다 더하기
			int num = str.charAt(i) -'0';
			if(num <= 1 || result <= 1) {
				result += num;
			} else {
				result *= num;
			}
		}
		System.out.println(result);
	}

}
