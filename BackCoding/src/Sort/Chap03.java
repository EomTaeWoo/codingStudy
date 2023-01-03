package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chap03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		Integer score[] = new Integer[n];
		
		for(int i = 0; i < n; i ++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score,Collections.reverseOrder());
		System.out.println(score[a-1]);
	}
}
