package Sort;

import java.util.Scanner;

public class Chap07_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10000];
		
		int n = sc.nextInt();
		while(n != 0) {
			arr[n % 10]++;
			n /= 10;
		}
		
		for(int i = 9; i >= 0; i --) {
			while(arr[i]-- > 0) {
				System.out.print(i);
			}
		}
	}

}
