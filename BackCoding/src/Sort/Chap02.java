package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Chap02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i =0 ; i < 5; i ++) {
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		
		System.out.println(sum/5);
		Arrays.sort(arr);
		System.out.println(arr[2]);
	}
}