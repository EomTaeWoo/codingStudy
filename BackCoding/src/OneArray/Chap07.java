package OneArray;

import java.util.Scanner;

public class Chap07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		int testcase = sc.nextInt();
		
		for (int i = 0; i < testcase; i ++) {
			int N = sc.nextInt(); //학생 수
			arr = new int[N];	//각 학생들의 점수가 들어갈 배열
			
			double sum = 0;		//누적 합계
			
			for (int j = 0; j<N; j++) {
				int val = sc.nextInt();	//성적입력
				arr[j] = val;			//각 성적 넣기
				sum += val;				//성적 합산
			}
			double mean = (sum/N);		//평군
			double count = 0;			//평균넘는 학생 수
			
			//평균이 넘는 학생수 찾기
			for(int j = 0; j < N; j ++) {
				if(arr[j]> mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		sc.close();
	}

}
