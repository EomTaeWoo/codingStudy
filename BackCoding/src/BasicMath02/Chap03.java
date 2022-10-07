package BasicMath02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chap03 {
	public static void main(String[] args) throws IOException{
		// 规过 1
		/*
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 2; i <= Math.sqrt(num); i ++) {
			while(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
		if(num != 1) {
			System.out.println(num);
		}
		*/
		
		//规过 2
		/*
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int num = sc.nextInt();
		
		for(int i = 2; i <= Math.sqrt(num); i ++) {
			while(num % i == 0) {
				sb.append(i).append('\n');
				num /= i;
			}
		}
		if(num != 1) {
			sb.append(num);
		}
		System.out.println(sb);
		*/
		
		//规过 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 2; i <= Math.sqrt(num); i ++) {
			while(num % i == 0) {
				sb.append(i).append('\n');
				num /= i;
			}
		}
		if(num != 1) {
			sb.append(num);
		}
		System.out.println(sb);
	}
}
