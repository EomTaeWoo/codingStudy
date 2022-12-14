package ThisCodingTest.Implementation;

import java.util.Scanner;

public class Chap02 {
	public static boolean check(int h, int m, int s) {
		if(h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 ==3 || s % 10 == 3) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		//시각 문제
		/*
		정수 N이 입력되면 00시 00분 00초로부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는
		모든 경우의 수를 구하는 프로그램을 작성하세요. 예를 등러 1을 입력했을 때 다음은 3이 하나라도 포함되어
		있으므로 세어야 하는 시각 입니다.
		- 00시 00분 03초
		- 00시 13분 00초
		반면에 다음은 3이 하나라도 포함되어 있지 않으므로 세면 안 되는 시각입니다.
		- 00시 02분 55초
		- 01시 27분 45초
		*/
		Scanner sc = new Scanner(System.in);
		
		// H를 입력받기
		int h = sc.nextInt();
		int cnt = 0;
		for(int i = 0; i <= h; i++) {
			for(int j = 0; j < 60; j ++) {
				for(int k = 0; k < 60; k++) {
					//매 시각 안에 '3' 이 포함되어 있다면 카운트 증가
					if(check(i,j,k)) cnt ++;
				}
			}
		}
		System.out.println(cnt);
	}
}
