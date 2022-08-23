package BasicMath02;

import java.util.Scanner;

public class Chap01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < a; i ++) {
			
			//소수인 경우 true, 아닌 경우 false
			boolean isPrime = true;
			
			int num = sc.nextInt();
			
			if(num == 1) {	//1 인경우 다음 반복문으로
				continue;
			}
			
			for (int j = 2; j<= Math.sqrt(num); j ++) {
				if(num % j == 0) {
					isPrime = false;	//소숙 아니므로 false로 바꿔줌
					break;
				}
			}
			if(isPrime) {
				count ++;
			}
		}
		System.out.println(count);
	}

}
