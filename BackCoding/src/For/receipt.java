package For;

import java.util.Scanner;

public class receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int money = sc.nextInt();
		int n = sc.nextInt();
		int a, b, c; //구매 금액과 갯수
		int result = 0; //합계
		
		for(int i = 0; i < n; i ++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a * b;
			result += c;
		}
		if(money == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		*/
		
		int total = sc.nextInt();
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			total -= (price * num);
		}
		if(total == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
