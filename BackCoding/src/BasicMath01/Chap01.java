package BasicMath01;

import java.util.Scanner;

public class Chap01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//불변 비용
		int b = sc.nextInt();	//가변 비용
		int c = sc.nextInt();	//상품 가격
		
		if (c <= b) {
			System.out.println("-1");
		}else {
			System.out.println(a/(c-b)+1);
		}
		System.out.println("테스트");
	}

}
