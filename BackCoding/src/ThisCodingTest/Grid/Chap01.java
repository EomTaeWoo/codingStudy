package ThisCodingTest.Grid;

import java.util.Scanner;

public class Chap01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		int N = 0;
		
		int[] coin = {500,100,50,10};
		
		for (int i = 0; i < coin.length; i ++) {
			N += money / coin[i];
			money = money % coin[i];
		}
		
		System.out.println(N);
	}
}
