package OneArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chap01_01 {

	public static void main(String[] args) throws IOException{
		//BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//반복할 갯수 선언
		int n = Integer.parseInt(br.readLine());
		
		//StringTokenizer로 입력
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//배열 변수 선언
		int[] array = new int[n];
		
		//n만큼 반복
		for (int i = 0; i< n; i++) {
			//배열의 데이터 입력
			array[i] = Integer.parseInt(st.nextToken());
		}
		//min, max 변수 선언 및 초기값 설정
		int min = array[0];
		int max = array[0];
		
		//n만큼 반복
		for (int i = 0; i< n; i++) {
			//min, max를 비교해서 구한다
			if(min> array[i]) {
				min = array[i];
			}else if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.printf("%d %d",min,max);
	}

}
