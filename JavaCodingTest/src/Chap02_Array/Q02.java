package Chap02_Array;

import java.util.Scanner;

/**
 * 
 * 보이는 학생
 * 
 * 설명 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 떄, 맨 앞에 서 있는 선생님이 볼 수 있는
 * 학생의 수를 구하는 프로그램을 작성하세요. (어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않습니다.)
 * 
 * 입력 설명 : 첫 줄에 정수 N(5 <= N <= 100000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 * 
 * 출력설명 : 선생님이 볼 수 있는 최대학생수를 출력한다.
 * 
 * 입력예시 : 8
 * 130 135 148 140 145 150 150 153
 * 
 * 출력예시 : 5
 *
 */
public class Q02 {

	public int solution(int[] arr) {
		int answer = 1;
		
		int max = arr[0];
		
		for(int i = 1; i < arr.length; i ++) {
			if(max < arr[i]) {
				max = arr[i];
				answer ++;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Q02 T = new Q02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(arr));
		
	}

}
