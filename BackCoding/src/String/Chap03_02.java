package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap03_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i] = -1;
		}
		
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i ++) {
			char ch = S.charAt(i);
			
			if(arr[ch -'a'] == -1) {	//arr 원소 값이 -1인 경유에만 초기화
				arr[ch-'a'] = i;
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
