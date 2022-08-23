package BasicMath01;

import java.util.Scanner;

public class Chap05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	//테스트 케이스 (횟수)
		
		for (int i = 0; i < T; i ++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();
			
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
		}
	}
}
