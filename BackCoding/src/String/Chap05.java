package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];		//영문자의 개수는 26개임
		String a = br.readLine();
		
		for(int i = 0; i < a.length(); i ++) {
			if('a' <= a.charAt(i) && a.charAt(i) <= 'z') {
				arr[a.charAt(i) - 97]++;
			}else {
				arr[a.charAt(i) - 65]++ ;
			}
		}
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < 26; i ++) {
			if(arr[i]>max) {
				max = arr[i];
				ch = (char)(i+65);
			}else if (arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.print(ch);
	}

}
