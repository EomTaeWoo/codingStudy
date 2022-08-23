package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Chap01_03 {

	public static void main(String[] args) throws IOException {
		// BufferedReader 선언 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		// 반복할 갯수 선언 
		int n = Integer.parseInt(br.readLine()); 
		// StringTokenizer로 입력 
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		// 배열 변수 선언 
		int[] array = new int[n]; 
		// N만큼 반복 
		for(int i = 0; i < n; i++) { 
			// 데이터 입력
			array[i] = Integer.parseInt(st.nextToken());
		} 
		// 배열.sort 사용 
		Arrays.sort(array);
		// 결과
		// 출력 
		System.out.print(array[0] + " " + array[n - 1]);

	}

}
