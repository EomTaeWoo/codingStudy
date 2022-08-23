package BasicMath02;

import java.util.Scanner;

public class Chap01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < a; i ++) {
			
			//�Ҽ��� ��� true, �ƴ� ��� false
			boolean isPrime = true;
			
			int num = sc.nextInt();
			
			if(num == 1) {	//1 �ΰ�� ���� �ݺ�������
				continue;
			}
			
			for (int j = 2; j<= Math.sqrt(num); j ++) {
				if(num % j == 0) {
					isPrime = false;	//�Ҽ� �ƴϹǷ� false�� �ٲ���
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
