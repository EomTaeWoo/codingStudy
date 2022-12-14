package BasicMath02;

import java.util.Scanner;

public class Chap02 {
	
	public static boolean prime[];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		prime = new boolean[B + 1];	//배열생성
		get_prime();
		
		// 소수 합 및 최솟값
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = A; i <= B; i ++) {
			if(prime[i] == false) {
				sum += i;
				if(min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}
		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	//에라토스테네스 체 알고리즘
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i<= Math.sqrt(prime.length); i ++) {
			for ( int j = i*i; j< prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
